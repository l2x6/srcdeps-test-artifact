package org.l2x6.maven.srcdeps.itest.service;

import org.l2x6.maven.srcdeps.itest.api.App;

/**
 * Hello world!
 *
 */
public class AppService {

    private final App app = new App();

    public App getApp() {
        return app;
    }

}
