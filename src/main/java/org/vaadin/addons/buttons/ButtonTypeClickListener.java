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

import org.vaadin.addons.window.DialogWindow;

/**
 * Created by Dangl on 21.04.2017.
 */
public class ButtonTypeClickListener {

    private ButtonType type;
    private DialogWindow window;

    public ButtonTypeClickListener(ButtonType type, DialogWindow window) {
        this.type = type;
        this.window = window;
    }

    public ButtonType getType() {
        return type;
    }

    public void setType(ButtonType type) {
        this.type = type;
    }

    public DialogWindow getWindow() {
        return window;
    }

    public void setWindow(DialogWindow window) {
        this.window = window;
    }
}
