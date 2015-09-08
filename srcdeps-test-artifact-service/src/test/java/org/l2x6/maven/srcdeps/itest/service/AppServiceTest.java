package org.l2x6.maven.srcdeps.itest.service;

import org.junit.Assert;
import org.l2x6.maven.srcdeps.itest.service.AppService;

/**
 * Unit test for simple App.
 */
public class AppServiceTest {
    public void testAppMessage() {
        Assert.assertEquals("Hello World!", new AppService().getApp().getMessage());
    }
}
