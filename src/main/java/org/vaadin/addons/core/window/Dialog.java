package org.vaadin.addons.core.window;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Component;
import org.vaadin.addons.core.buttons.ButtonType;
import org.vaadin.addons.core.types.DialogType;
import org.vaadin.addons.event.listener.DialogCloseListener;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public class Dialog {

    private String title;
    private DialogType type;
    private ButtonType[] buttonTypes;
    private Component content;
    private DialogCloseListener listener;
    private VaadinIcons icon;

    /**
     * Instantiates a new Dialog.
     */
    public Dialog() {

    }

    /**
     * Gets listener.
     *
     * @return the listener
     */
    public DialogCloseListener getListener() {
        return listener;
    }

    /**
     * Sets listener.
     *
     * @param listener the listener
     */
    public void setListener(DialogCloseListener listener) {
        this.listener = listener;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public DialogType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(DialogType type) {
        this.type = type;
    }

    /**
     * Get button types button type [ ].
     *
     * @return the button type [ ]
     */
    public ButtonType[] getButtonTypes() {
        return buttonTypes;
    }

    /**
     * Sets button types.
     *
     * @param buttonTypes the button types
     */
    public void setButtonTypes(ButtonType[] buttonTypes) {
        this.buttonTypes = buttonTypes;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public Component getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(Component content) {
        this.content = content;
    }

    public VaadinIcons getIcon() {
        if(type == DialogType.CUSTOM) {
            return icon;
        } else {
            return type.getIcon();
        }
    }

    public void setIcon(VaadinIcons icon) {
        this.icon = icon;
    }
}
