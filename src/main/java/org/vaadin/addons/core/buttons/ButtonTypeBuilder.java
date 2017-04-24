/*
 * Copyright 2017 dangllucas
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.vaadin.addons.core.buttons;

import com.vaadin.server.Resource;

import java.util.stream.Stream;

/**
 * Created by Dangl on 21.04.2017.
 */
public class ButtonTypeBuilder {

    private ButtonType current = null;

    private ButtonTypeBuilder() {
        current = new ButtonType();
    }

    /**
     * Create button type builder.
     *
     * @return the button type builder
     */
    public static ButtonTypeBuilder create() {
        return new ButtonTypeBuilder();
    }

    /**
     * With caption button type builder.
     *
     * @param caption the caption
     * @return the button type builder
     */
    public ButtonTypeBuilder withCaption(String caption) {
        current.setCaption(caption);
        return this;
    }

    /**
     * With icon button type builder.
     *
     * @param icon the icon
     * @return the button type builder
     */
    public ButtonTypeBuilder withIcon(Resource icon) {
        current.setIcon(icon);
        return this;
    }

    /**
     * With description button type builder.
     *
     * @param description the description
     * @return the button type builder
     */
    public ButtonTypeBuilder withDescription(String description) {
        current.setDescription(description);
        return this;
    }

    public ButtonTypeBuilder withButtonAction(ButtonAction action) {
        current.getActions().add(action);
        return this;
    }

    public ButtonTypeBuilder wihtButtonActions(ButtonAction... actions) {
        Stream.of(actions).forEach(this::withButtonAction);
        return this;
    }

    /**
     * With style button type builder.
     *
     * @param styleValues the style values
     * @return the button type builder
     */
    public ButtonTypeBuilder withStyle(String styleValues) {
        current.setStyle(styleValues);
        return this;
    }

    /**
     * Build button type.
     *
     * @return the button type
     */
    public ButtonType build() {
        return current;
    }

}
