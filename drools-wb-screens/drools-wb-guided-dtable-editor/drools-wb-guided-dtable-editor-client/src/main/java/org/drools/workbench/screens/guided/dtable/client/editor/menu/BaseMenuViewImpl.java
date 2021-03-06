/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.workbench.screens.guided.dtable.client.editor.menu;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Composite;
import org.gwtbootstrap3.client.ui.constants.Styles;

public abstract class BaseMenuViewImpl<M extends BaseMenu> extends Composite implements BaseMenuView<M> {

    protected M presenter;

    @Override
    public void init( final M presenter ) {
        this.presenter = presenter;
    }

    @Override
    public void enableElement( final Element element,
                               final boolean enabled ) {
        if ( enabled ) {
            element.removeClassName( Styles.DISABLED );
        } else {
            element.addClassName( Styles.DISABLED );
        }
    }

    @Override
    public boolean isDisabled( final Element element ) {
        final List<String> classNames = Arrays.asList( element.getClassName().split( "\\s" ) );
        return classNames.contains( Styles.DISABLED );
    }

}
