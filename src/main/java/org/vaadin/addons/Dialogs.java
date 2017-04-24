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

package org.vaadin.addons;

import org.vaadin.addons.core.types.DialogType;
import org.vaadin.addons.core.window.builder.CustomDialogBuilder;
import org.vaadin.addons.core.window.builder.PredefinedDialogBuilder;

/**
 * Created by Dangl on 21.04.2017.
 */
public class Dialogs {

    /**
     * Instantiates a new Dialogs.
     */
    private Dialogs() {
    }

    public static PredefinedDialogBuilder createInfo() {
        return new PredefinedDialogBuilder(DialogType.INFORMATION);
    }

    public static PredefinedDialogBuilder createWarning() {
        return new PredefinedDialogBuilder(DialogType.WARNING);
    }

    public static PredefinedDialogBuilder createError() {
        return new PredefinedDialogBuilder(DialogType.ERROR);
    }

    public static PredefinedDialogBuilder createConfirmation() {
        return new PredefinedDialogBuilder(DialogType.CONFIRMATION);
    }

    public static CustomDialogBuilder createCustom() {
        return new CustomDialogBuilder();
    }

}
