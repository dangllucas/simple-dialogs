package org.vaadin.addons.core.window.builder;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Component;
import org.vaadin.addons.core.buttons.ButtonType;
import org.vaadin.addons.core.types.DialogType;
import org.vaadin.addons.core.window.Dialog;
import org.vaadin.addons.event.listener.DialogCloseListener;

/**
 * Created by lucasdangl on 23.04.2017.
 */
public class CustomDialogBuilder extends AbstractDialogBuilder {

    public CustomDialogBuilder() {
        dialog.setType(DialogType.CUSTOM);
    }

    public CustomDialogBuilder withHeader(String header) {
        dialog.setTitle(header);
        return this;
    }

    public CustomDialogBuilder withIcon(VaadinIcons icon) {
        dialog.setIcon(icon);
        return this;
    }

    public CustomDialogBuilder withButtons(ButtonType... btns) {
        dialog.setButtonTypes(btns);
        return this;
    }

    public CustomDialogBuilder withContent(Component content) {
        dialog.setContent(content);
        return this;
    }

    public CustomDialogBuilder withCloseListener(DialogCloseListener listener) {
        dialog.setListener(listener);
        return this;
    }

}
