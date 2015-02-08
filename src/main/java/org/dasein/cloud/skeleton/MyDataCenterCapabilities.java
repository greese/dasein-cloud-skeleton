/**
 * Copyright (C) 2012-2015 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.dasein.cloud.skeleton;

import org.dasein.cloud.AbstractCapabilities;
import org.dasein.cloud.dc.DataCenterCapabilities;

import java.util.Locale;

/**
 * Unimplemented skeleton class
 * @author INSERT NAME HERE
 * @version 2013.01 initial version
 * @since 2013.01
 */
public class MyDataCenterCapabilities extends AbstractCapabilities<MyCloud> implements DataCenterCapabilities {

    MyDataCenterCapabilities(MyCloud provider) {
        super(provider);
    }

    @Override
    public String getProviderTermForDataCenter(Locale locale) {
        return "data center"; // TODO: return provider specific term
    }

    @Override
    public String getProviderTermForRegion(Locale locale) {
        return "region"; // TODO: return provider specific term
    }

    @Override public boolean supportsAffinityGroups() {
        return false;
    }

    @Override public boolean supportsResourcePools() {
        return false;
    }

    @Override public boolean supportsStoragePools() {
        return false;
    }

    @Override public boolean supportsFolders() {
        return false;
    }
}
