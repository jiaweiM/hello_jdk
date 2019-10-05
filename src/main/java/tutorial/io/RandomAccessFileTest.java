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
package tutorial.io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import static org.testng.Assert.assertEquals;

/**
 * @author JiaweiM
 * @date Sep 1, 2015 9:08:18 AM
 */
public class RandomAccessFileTest {

    @Test
    public void test2() throws FileNotFoundException {
        String file = "text.dat";
        RandomAccessFile rf = new RandomAccessFile(file, "w");

    }

    @Test
    public void test() throws IOException {
        File file = new File("test");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.writeInt(1);
        raf.writeInt(2);
        raf.writeInt(3);

        assertEquals(raf.getFilePointer(), 12);

        raf.seek(0);
        assertEquals(raf.getFilePointer(), 0);

        int i = raf.readInt();
        assertEquals(i, 1);
        assertEquals(raf.getFilePointer(), 4);

        raf.close();

        file.deleteOnExit();
    }

}
