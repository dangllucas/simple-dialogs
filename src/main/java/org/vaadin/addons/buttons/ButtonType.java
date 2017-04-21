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

package org.vaadin.addons.buttons;

import com.vaadin.server.Resource;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Created by Dangl on 21.04.2017.
 */
public class ButtonType {

    /**
     * The constant Button Type OK.
     */
    public static ButtonType OK = ButtonTypeBuilder.create().withCaption("Ok").withStyle(ValoTheme.BUTTON_PRIMARY).build();

    private String caption;
    private Resource icon;
    private String description;
    private ButtonTypeClickListener listener;
    private String style;

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
     * Gets listener.
     *
     * @return the listener
     */
    public ButtonTypeClickListener getListener() {
        return listener;
    }

    /**
     * Sets listener.
     *
     * @param listener the listener
     */
    public void setListener(ButtonTypeClickListener listener) {
        this.listener = listener;
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
}
