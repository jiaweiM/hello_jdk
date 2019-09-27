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

package tutorial.net;

import org.testng.annotations.Test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.testng.Assert.*;

/**
 * http://blog.csdn.net/u014315849/article/details/48975897
 *
 * @author JiaweiMao
 * @version 1.0.0
 * @date 2016.09.23, 10:32 AM
 */
public class URITest {
    @Test
    public void testPath() {
        // 当前 URITest.class 文件的URI目录
        URL url = URITest.class.getResource("");
        System.out.println(url);

        // 当前classpath的绝对URI路径
        URL url2 = URITest.class.getResource("/");
        System.out.println(url2);

        // 同上
        URL url3 = Thread.currentThread().getContextClassLoader().getResource("");
        System.out.println(url3);

        // 同上
        URL url4 = URITest.class.getClassLoader().getResource("");
        System.out.println(url4);
    }

    @Test
    public void test() throws URISyntaxException {
        File file = new File("I:\\dataset2\\b1906_293T_proteinID_01A_QE3_122212.mzML");
        URI uri = new URI(file.getName());

        uri = file.toURI();
        System.out.println(uri);
        System.out.println(uri.getRawPath());
        System.out.println(uri.getPath());
    }

    @Test
    public void testURI() {
        URI uri = URI.create("https://www.google.com");
        assertEquals(uri.getAuthority(), "www.google.com");
        assertNull(uri.getFragment());
        assertEquals(uri.getHost(), "www.google.com");
        assertEquals(uri.getPath(), "");
        assertEquals(uri.getPort(), -1);
        assertNull(uri.getQuery());
        assertEquals(uri.getScheme(), "https");
        assertEquals(uri.getSchemeSpecificPart(), "//www.google.com");
        assertNull(uri.getUserInfo());
        assertTrue(uri.isAbsolute());
        assertFalse(uri.isOpaque());
    }

    @Test
    public void testNormalize() throws URISyntaxException {
        URI uri = new URI("x/y/../z/./q");
        URI nUri = uri.normalize();
        assertEquals(nUri.toString(), "x/z/q");
    }

    @Test
    public void testResolve() throws URISyntaxException {
        String s = "http://www.somedomain.com/";
        URI baseURI = new URI(s);

        URI relativeURI = new URI("x/../y");

        URI resolvedURI = baseURI.resolve(relativeURI);
        assertEquals(resolvedURI.toString(), "http://www.somedomain.com/y");

        URI newRela = baseURI.relativize(resolvedURI);
        assertEquals(newRela.toString(), "y");
    }

    @Test
    public void testFile() {
        File file = new File("C:\\Program Files\\Adobe\\testfile.pdf");
        URI uri = file.toURI();
        new File(uri).getAbsolutePath();
    }
}
