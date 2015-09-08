package org.l2x6.maven.srcdeps.itest.api;

import org.junit.Assert;
import org.l2x6.maven.srcdeps.itest.api.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public void testAppMessage() {
        Assert.assertEquals("Hello World!", new App().getMessage());
    }
}
