package org.vaadin.addons.event;

import org.vaadin.addons.core.buttons.ButtonType;
import org.vaadin.addons.core.window.DialogWindow;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public class ButtonTypeClickEvent {

    private ButtonType buttonType;
    private DialogWindow window;

    /**
     * Instantiates a new Button type click event.
     *
     * @param buttonType the button type
     * @param window     the window
     */
    public ButtonTypeClickEvent(ButtonType buttonType, DialogWindow window) {
        this.buttonType = buttonType;
        this.window = window;
    }

    /**
     * Gets button type.
     *
     * @return the button type
     */
    public ButtonType getButtonType() {
        return buttonType;
    }

    /**
     * Gets window.
     *
     * @return the window
     */
    public DialogWindow getWindow() {
        return window;
    }
}
