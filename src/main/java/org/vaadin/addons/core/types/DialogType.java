package org.vaadin.addons.core.types;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Resource;
import org.vaadin.addons.core.buttons.ButtonType;
import org.vaadin.addons.i18n.Messages;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public enum DialogType {

    /**
     * Information dialog type.
     */
    INFORMATION(Messages.DIALOG_DEFAULT_INFORMATION, VaadinIcons.INFO_CIRCLE, ButtonType.OK, ButtonType.CLOSE),
    /**
     * Warning dialog type.
     */
    WARNING(Messages.DIALOG_DEFAULT_WARNING, VaadinIcons.WARNING, ButtonType.OK, ButtonType.CLOSE),
    /**
     * Error dialog type.
     */
    ERROR(Messages.DIALOG_DEFAULT_ERROR, VaadinIcons.MINUS_CIRCLE, ButtonType.OK, ButtonType.CLOSE),
    /**
     * Confirmation dialog type.
     */
    CONFIRMATION(Messages.DIALOG_DEFAULT_CONFIRMATION, VaadinIcons.QUESTION_CIRCLE, ButtonType.YES, ButtonType.NO, ButtonType.CLOSE),

    /**
     * Custom dialog type.
     */
    CUSTOM(null, null, null);

    private Messages resourceKey;
    private VaadinIcons icon;
    private ButtonType[] types;

    DialogType(Messages resourceKey, VaadinIcons icon, ButtonType... types) {
        this.resourceKey = resourceKey;
        this.icon = icon;
        this.types = types;
    }

    /**
     * Get types button type [ ].
     *
     * @return the button type [ ]
     */
    public ButtonType[] getButtons() {
        return types;
    }

    /**
     * Gets resource key.
     *
     * @return the resource key
     */
    public Messages getResourceKey() {
        return resourceKey;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public VaadinIcons getIcon() {
        return icon;
    }
}
