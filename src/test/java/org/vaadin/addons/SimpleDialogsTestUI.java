package org.vaadin.addons;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;
import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.addonhelpers.components.VaadinOptionGroup;
import org.vaadin.addons.event.listener.DialogCloseListener;

/**
 * Created by Dangl on 21.04.2017.
 */
public class SimpleDialogsTestUI extends AbstractTest {
    @Override
    public Component getTestComponent() {
        //Not needed in this Context
        return new HorizontalLayout();
    }

    @Override
    protected void init(VaadinRequest request) {
        //Needs to be called
        super.init(request);

        HorizontalLayout root = new HorizontalLayout();
        root.setSizeFull();
        root.setMargin(false);

        Panel buttons = new Panel();
        buttons.setHeight("100%");
        buttons.setWidth("400px");
        VerticalLayout content = new VerticalLayout();
        content.setMargin(true);
        content.setSpacing(true);
        content.setSizeUndefined();

        //Add Buttons for Dialogs into Layout
        content.addComponent(new Label("Simple Dialogs"));

        content.addComponent(new Button("Simple Information Dialog", event -> Dialogs.createInfo().withText("This is a simple Information Dialog", ContentMode.TEXT).open()));
        content.addComponent(new Button("Simple Warning Dialog", event -> Dialogs.createWarning().withText("This is a simple Warning Dialog", ContentMode.TEXT).open()));
        content.addComponent(new Button("Simple Error Dialog", event -> Dialogs.createError().withText("This is a simple Error Dialog", ContentMode.TEXT).open()));
        content.addComponent(new Button("Simple Confirmation Dialog", event -> Dialogs.createConfirmation().withText("This is a simple Confirmation Dialog", ContentMode.TEXT).open()));

        content.addComponent(new Label("Simple Dialogs with Listeners"));

        content.addComponent(new Button("Simple Information Dialog with Listener", event -> Dialogs.createInfo().withText("This is a simple Information Dialog with Listener", ContentMode.TEXT).withCloseListener(event1 -> Notification.show("Button " + event1.getClickedButton().getCaption() + " clicked!")).open()));
        content.addComponent(new Button("Simple Warning Dialog with Listener", event -> Dialogs.createWarning().withText("This is a simple Warning Dialog with Listener", ContentMode.TEXT).withCloseListener(event1 -> Notification.show("Button " + event1.getClickedButton().getCaption() + " clicked!")).open()));
        content.addComponent(new Button("Simple Error Dialog with Listener", event -> Dialogs.createError().withText("This is a simple Error Dialog with Listener", ContentMode.TEXT).withCloseListener(event1 -> Notification.show("Button " + event1.getClickedButton().getCaption() + " clicked!")).open()));
        content.addComponent(new Button("Simple Confirmation Dialog with Listener", event -> Dialogs.createConfirmation().withText("This is a simple Confirmation Dialog with Listener", ContentMode.TEXT).withCloseListener(event1 -> Notification.show("Button " + event1.getClickedButton().getCaption() + " clicked!")).open()));

        content.addComponent(new Label("Simple Dialogs with Listeners"));

        content.addComponent(new Button("Custom Dialog", event -> Dialogs.createCustom().withHeader("Custom Dialog").withIcon(VaadinIcons.AIRPLANE).withContent(new TextArea("this is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\nthis is a custom dialog\n")).open()));

        buttons.setContent(content);
        root.addComponent(buttons);
        setContent(root);
    }
}
