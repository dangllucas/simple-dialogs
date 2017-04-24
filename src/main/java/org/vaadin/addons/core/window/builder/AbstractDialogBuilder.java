package org.vaadin.addons.core.window.builder;

import org.vaadin.addons.core.window.Dialog;
import org.vaadin.addons.core.window.DialogWindow;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public abstract class AbstractDialogBuilder {

    protected Dialog dialog;

    protected AbstractDialogBuilder() {
        dialog = new Dialog();
    }

    public void open() {
        new DialogWindow(dialog);
    }

}
