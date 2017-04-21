package org.vaadin.addons.buttons;

import com.vaadin.server.Resource;

/**
 * Created by Dangl on 21.04.2017.
 */
public class ButtonType {

    private String caption;
    private Resource icon;
    private String description;

    public ButtonType(String caption, Resource icon, String description) {
        this.caption = caption;
        this.icon = icon;
        this.description = description;
    }


}
