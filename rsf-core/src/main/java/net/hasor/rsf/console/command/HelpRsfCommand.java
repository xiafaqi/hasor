/*
 * Copyright 2008-2009 the original author or authors.
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
package net.hasor.rsf.console.command;
import net.hasor.rsf.RsfContext;
import net.hasor.rsf.console.RsfCommand;
import net.hasor.rsf.console.RsfCommandRequest;
/**
 * 
 * @version : 2016年4月3日
 * @author 赵永春(zyc@hasor.net)
 */
public class HelpRsfCommand implements RsfCommand {
    @Override
    public String helpInfo() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean inputMultiLine() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public String doCommand(RsfContext rsfContext, RsfCommandRequest request) throws Throwable {
        Thread.sleep(3000);
        // TODO Auto-generated met hod stub
        return "Hello Word.";
    }
}