package org.vaadin.addons.core.window.builder;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.themes.ValoTheme;
import org.vaadin.addons.core.types.DialogType;
import org.vaadin.addons.event.listener.DialogCloseListener;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public class PredefinedDialogBuilder extends AbstractDialogBuilder {

    private Label label;
    private DialogCloseListener listener;

    public PredefinedDialogBuilder(DialogType dialogType) {
        super();
        dialog.setType(dialogType);
        dialog.setTitle(dialogType.getResourceKey().getLocalizedText());
        dialog.setButtonTypes(dialogType.getButtons());
    }

    public PredefinedDialogBuilder withText(String text, ContentMode contentMode) {
        this.label = new Label(text, contentMode);
        dialog.setContent(label);
        return this;
    }

    public PredefinedDialogBuilder withCloseListener(DialogCloseListener listener) {
        this.listener = listener;
        dialog.setListener(listener);
        return this;
    }

}
