package org.vaadin.addons.core.buttons;

import org.vaadin.addons.event.ButtonTypeClickEvent;

import java.io.Serializable;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public class ButtonAction {

    public static final ButtonAction CLOSE = new ButtonAction(event -> event.getWindow().close(event.getButtonType()));

    private ButtonClickListener listener;

    @FunctionalInterface
    public interface ButtonClickListener extends Serializable {
        void buttonClick(ButtonTypeClickEvent event);
    }

    private ButtonAction(ButtonClickListener listener) {
        this.listener = listener;
    }

    public ButtonClickListener getListener() {
        return listener;
    }

    public static ButtonAction create(ButtonClickListener listener) {
        return new ButtonAction(listener);
    }

}
