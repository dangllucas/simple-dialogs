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

package org.vaadin.addons.core.buttons;

import com.vaadin.server.Resource;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.addons.i18n.Messages;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dangl on 21.04.2017.
 */
public class ButtonType {

    /**
     * The constant OK.
     */
    public static final ButtonType OK = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_OK.getLocalizedText()).withStyle(ValoTheme.BUTTON_PRIMARY).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant CANCEL.
     */
    public static final ButtonType CANCEL = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_CANCEL.getLocalizedText()).withStyle(ValoTheme.BUTTON_DANGER).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant CLOSE.
     */
    public static final ButtonType CLOSE = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_CLOSE.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant FINISH.
     */
    public static final ButtonType FINISH = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_FINISH.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant YES.
     */
    public static final ButtonType YES = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_YES.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant NO.
     */
    public static final ButtonType NO = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_NO.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant NEXT.
     */
    public static final ButtonType NEXT = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_NEXT.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant PREV.
     */
    public static final ButtonType PREV = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_PREV.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();
    /**
     * The constant APPLY.
     */
    public static final ButtonType APPLY = ButtonTypeBuilder.create().withCaption(Messages.BUTTON_APPLY.getLocalizedText()).withButtonAction(ButtonAction.CLOSE).build();

    private String caption;
    private Resource icon;
    private String description;
    private String style;
    private List<ButtonAction> actions = new ArrayList<>();

    /**
     * Instantiates a new Button type.
     */
    public ButtonType() {
    }

    /**
     * Instantiates a new Button type.
     *
     * @param caption     the caption
     * @param icon        the icon
     * @param description the description
     */
    public ButtonType(String caption, Resource icon, String description) {
        this.caption = caption;
        this.icon = icon;
        this.description = description;
    }

    /**
     * Gets caption.
     *
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     *
     * @param caption the caption
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public Resource getIcon() {
        return icon;
    }

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(Resource icon) {
        this.icon = icon;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets style.
     *
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets style.
     *
     * @param style the style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Gets actions.
     *
     * @return the actions
     */
    public List<ButtonAction> getActions() {
        return actions;
    }

    /**
     * Sets actions.
     *
     * @param actions the actions
     */
    public void setActions(List<ButtonAction> actions) {
        this.actions = actions;
    }
}
