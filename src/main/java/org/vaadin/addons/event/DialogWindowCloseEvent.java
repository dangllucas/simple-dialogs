package org.vaadin.addons.event;

import org.vaadin.addons.core.buttons.ButtonType;
import org.vaadin.addons.core.window.DialogWindow;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public class DialogWindowCloseEvent {

    private DialogWindow window;
    private ButtonType clickedButton;

    /**
     * Instantiates a new Dialog window close event.
     *
     * @param window        the window
     * @param clickedButton the clicked button
     */
    public DialogWindowCloseEvent(DialogWindow window, ButtonType clickedButton) {
        this.window = window;
        this.clickedButton = clickedButton;
    }

    /**
     * Gets window.
     *
     * @return the window
     */
    public DialogWindow getWindow() {
        return window;
    }

    /**
     * Gets clicked button.
     *
     * @return the clicked button
     */
    public ButtonType getClickedButton() {
        return clickedButton;
    }
}
