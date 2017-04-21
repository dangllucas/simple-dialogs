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

package org.vaadin.addons.buttons;

import com.vaadin.server.Resource;

/**
 * Created by Dangl on 21.04.2017.
 */
public class ButtonTypeBuilder {

    private ButtonType current = null;

    private ButtonTypeBuilder() {
        current = new ButtonType();
    }

    public static ButtonTypeBuilder create() {
        return new ButtonTypeBuilder();
    }

    public ButtonTypeBuilder withCaption(String caption) {
        current.setCaption(caption);
        return this;
    }

    public ButtonTypeBuilder withIcon(Resource icon) {
        current.setIcon(icon);
        return this;
    }

    public ButtonTypeBuilder withDescription(String description) {
        current.setDescription(description);
        return this;
    }

    public ButtonTypeBuilder withClickListener(ButtonTypeClickListener listener) {
        current.setListener(listener);
        return this;
    }

    public ButtonTypeBuilder withStyle(String styleValues) {
        current.setStyle(styleValues);
        return this;
    }

    public ButtonType build() {
        return current;
    }

}
