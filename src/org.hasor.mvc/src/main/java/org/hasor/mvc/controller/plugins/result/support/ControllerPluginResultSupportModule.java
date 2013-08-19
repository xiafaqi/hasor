/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hasor.mvc.controller.plugins.result.support;
import org.hasor.context.AppContext;
import org.hasor.context.ModuleSettings;
import org.hasor.context.anno.Module;
import org.hasor.mvc.controller.ActionDefine;
import org.hasor.mvc.controller.support.ServletControllerSupportModule;
import org.hasor.servlet.AbstractWebHasorModule;
import org.hasor.servlet.WebApiBinder;
/**
 * 负责处理Action调用之后返回值的处理。
 * @version : 2013-8-11
 * @author 赵永春 (zyc@hasor.net)
 */
@Module(description = "org.hasor.mvc.controller.plugins.result软件包功能支持。")
public class ControllerPluginResultSupportModule extends AbstractWebHasorModule {
    public void configuration(ModuleSettings info) {
        info.followTarget(ServletControllerSupportModule.class);
    }
    public void init(WebApiBinder apiBinder) {
        apiBinder.getGuiceBinder().bind(Caller.class);
    }
    public void start(AppContext appContext) {
        Caller caller = appContext.getInstance(Caller.class);
        appContext.getEventManager().addEventListener(ActionDefine.Event_AfterInvoke, caller);
    }
    public void stop(AppContext appContext) {
        Caller caller = appContext.getInstance(Caller.class);
        appContext.getEventManager().removeEventListener(ActionDefine.Event_AfterInvoke, caller);;
    }
}