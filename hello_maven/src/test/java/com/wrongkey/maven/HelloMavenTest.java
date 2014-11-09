package com.wrongkey.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *@author wrongkey
 *@description Test
 *@date 2014/11/9
 *@version v1.0
 *
 */
public class HelloMavenTest {
    @Test
    public void testHelloMaven(){
        String result = HelloMaven.sayHello();
        assertEquals("Hello Maven!", result);
    }
}
