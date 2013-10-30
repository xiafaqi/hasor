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
package org.hasor.test.simple.service.define;
import net.hasor.core.ApiBinder;
import net.hasor.core.gift.Gift;
import net.hasor.core.gift.GiftFace;
/**
 * 
 * @version : 2013-9-14
 * @author ������ (zyc@byshell.org)
 */
@Gift
public class ServiceGift implements GiftFace {
    public void loadGift(ApiBinder apiBinder) {
        apiBinder.registerServicesHandler(AbstractService.class, new ServiceHandler());
    }
}