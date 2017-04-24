package org.vaadin.addons.event.listener;

import org.vaadin.addons.event.DialogWindowCloseEvent;

import java.io.Serializable;

@FunctionalInterface
public interface DialogCloseListener extends Serializable {
    void windowClosed(DialogWindowCloseEvent event);
}