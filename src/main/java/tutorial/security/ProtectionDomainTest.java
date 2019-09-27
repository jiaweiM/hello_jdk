/*
 * Copyright 2017 JiaweiMao jiaweiM_philo@hotmail.com
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
package tutorial.security;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.security.CodeSource;
import java.security.ProtectionDomain;


/**
 * @author JiaweiMao
 * @date Mar 12, 2016 4:26:05 PM
 */
public class ProtectionDomainTest
{

    ProtectionDomain pd;

    @BeforeClass
    public void setup()
    {
        pd = getClass().getProtectionDomain();
    }

    @Test
    public void testGetCodeSource()
    {

        CodeSource cs = pd.getCodeSource();
        System.out.println(cs.getLocation().getPath());
    }
}
