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

package trail.generic;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private final Map<String, Object> values = new HashMap<>();

    public <T> void put(String key, T value, Class<T> valueType) {
        values.put(key, value);
    }

    public <T> T get(String key, Class<T> valueType){
        return (T)values.get(key);
    }

    public Object get(String key) {
        return values.get(key);
    }

    public static void main(String[] args) {
        Context context = new Context();
    }

}