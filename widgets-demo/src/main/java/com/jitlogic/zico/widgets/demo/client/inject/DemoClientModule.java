/**
 * Copyright 2012-2014 Rafal Lewczuk <rafal.lewczuk@jitlogic.com>
 * <p/>
 * This is free software. You can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * <p/>
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, see <http://www.gnu.org/licenses/>.
 */

package com.jitlogic.zico.widgets.demo.client.inject;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.jitlogic.zico.widgets.client.MessageDisplay;
import com.jitlogic.zico.widgets.client.StatusBar;
import com.jitlogic.zico.widgets.demo.client.Shell;

public class DemoClientModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(Shell.class).in(Singleton.class);
        bind(StatusBar.class).in(Singleton.class);
    }

    @Provides
    public MessageDisplay provideMessageDisplay(StatusBar statusBar) {
        return statusBar;
    }
}
