package org.vaadin.addons.i18n;

import com.vaadin.ui.UI;
import org.vaadin.addons.Dialogs;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by lucasdangl on 21.04.2017.
 */
public enum Messages {

    BUTTON_APPLY,
    BUTTON_CANCEL,
    BUTTON_CLOSE,
    BUTTON_FINISH,
    BUTTON_NEXT,
    BUTTON_NO,
    BUTTON_OK,
    BUTTON_PREV,
    BUTTON_YES,

    DIALOG_DEFAULT_INFORMATION,
    DIALOG_DEFAULT_WARNING,
    DIALOG_DEFAULT_ERROR,
    DIALOG_DEFAULT_CONFIRMATION;

    /**
     * The constant DEFAULT_LOCALE.
     */
    public static final Locale DEFAULT_LOCALE = Locale.ENGLISH;
    private ResourceBundle bundle;

    /**
     * Gets localized text.
     *
     * @return the localized text
     */
    public String getLocalizedText() {
        if(bundle == null) {
            try {
                bundle = ResourceBundle.getBundle("messages", getLocale());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bundle.getString(name().toLowerCase());
    }

    private Locale getLocale() throws IOException {
        Properties p = new Properties();
        p.load(Dialogs.class.getResourceAsStream("/supported_languages.properties"));
        Locale locale = UI.getCurrent().getLocale();
        if(p.values().stream().map(o -> objectToString(o)).anyMatch(s -> locale.getLanguage().equals(s))) {
            return locale;
        } else {
            return DEFAULT_LOCALE;
        }
    }

    private String objectToString(Object o) {
        return (String) o;
    }

}
