/*
 * Copyright 2017 dangllucas
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.vaadin.addons.core.window;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.addons.core.buttons.ButtonType;
import org.vaadin.addons.core.types.DialogType;
import org.vaadin.addons.event.ButtonTypeClickEvent;
import org.vaadin.addons.event.DialogWindowCloseEvent;
import org.vaadin.addons.event.listener.DialogCloseListener;

import java.util.stream.Stream;

/**
 * Created by Dangl on 21.04.2017.
 */
public class DialogWindow extends Window {

    private DialogCloseListener closeListener;
    private Dialog dialog;

    public DialogWindow(Dialog dialog) {
        closeListener = dialog.getListener();
        this.dialog = dialog;
        setModal(true);
        setHeight("-1px");
        setWidth("-1px");
        setClosable(false);
        setResizable(false);
        setContent(buildContent(dialog.getTitle(), dialog.getIcon(), dialog.getContent(), dialog.getButtonTypes()));
        UI.getCurrent().addWindow(this);
        focus();
    }

    public Dialog getDialog() {
        return dialog;
    }

    public void close(ButtonType type) {
        close();
        if (closeListener != null) {
            DialogWindowCloseEvent event = new DialogWindowCloseEvent(this, type);
            closeListener.windowClosed(event);
        }
    }

    private VerticalLayout buildContent(String title, VaadinIcons type, Component content, ButtonType[] buttonTypes) {
        VerticalLayout root = new VerticalLayout();
        root.setMargin(false);
        root.setSpacing(false);

        float width = -1;
        float height = 0;

        if (title != null) {
            HorizontalLayout header = new HorizontalLayout();
            header.setMargin(true);
            header.setHeightUndefined();
            header.setWidth("100%");
            header.addStyleName(ValoTheme.WINDOW_TOP_TOOLBAR);
            Label l = new Label("<font size=\"4\">" + title + "</font>", ContentMode.HTML);
            width = l.getWidth();
            header.addComponent(l);
            header.setComponentAlignment(l, Alignment.MIDDLE_LEFT);

            if (type != null) {
                Label i = new Label(type.getHtml(), ContentMode.HTML);
                header.addComponent(i);
                header.setComponentAlignment(i, Alignment.MIDDLE_RIGHT);
            }

            height = header.getHeight();
            root.addComponent(header);
        }

        if (content != null) {
            content.setSizeFull();
            HorizontalLayout contentRoot = new HorizontalLayout(content);
            contentRoot.setMargin(true);
            root.addComponent(contentRoot);
            height = height + contentRoot.getHeight();
        }

        HorizontalLayout footer = new HorizontalLayout();
        footer.setHeightUndefined();
        footer.setWidth("100%");
        footer.setMargin(true);
        footer.addStyleName(ValoTheme.WINDOW_BOTTOM_TOOLBAR);

        HorizontalLayout buttons = new HorizontalLayout();
        if (buttonTypes != null) {
            Stream.of(buttonTypes).forEach(buttonType -> {
                Button b = new Button(buttonType.getCaption());
                if (buttonType.getIcon() != null) {
                    b.setIcon(buttonType.getIcon());
                }
                if (buttonType.getDescription() != null) {
                    b.setDescription(buttonType.getDescription());
                }
                if (buttonType.getStyle() != null) {
                    b.addStyleName(buttonType.getStyle());
                }
                b.addClickListener(event -> buttonType.getActions().forEach(buttonAction -> {
                    ButtonTypeClickEvent event1 = new ButtonTypeClickEvent(buttonType, DialogWindow.this);
                    buttonAction.getListener().buttonClick(event1);
                }));
                buttons.addComponent(b);
            });
        }
        buttons.setSizeUndefined();
        buttons.setMargin(false);
        buttons.setSpacing(true);


        footer.addComponent(buttons);
        footer.setComponentAlignment(buttons, Alignment.MIDDLE_RIGHT);

        if (buttons.getWidth() > width) {
            width = buttons.getWidth();
        }

        root.addComponent(footer);
        root.setComponentAlignment(footer, Alignment.BOTTOM_LEFT);
        height = height + footer.getHeight();

        root.setHeight(height, Unit.PIXELS);
        root.setWidth(width, Unit.PIXELS);
        return root;
    }
}
