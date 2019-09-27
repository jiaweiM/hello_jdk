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

package tutorial;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 01 May 2018, 7:50 PM
 */
public class ClassA
{
    private int field;

    public ClassA(int field)
    {
        this.field = field;
    }

    public int getField()
    {
        return field;
    }

    @Override
    public String toString()
    {
        return field + "";
    }
}
