package controller;

import hochberger.utilities.application.ApplicationProperties;
import hochberger.utilities.application.BasicLoggedApplication;
import hochberger.utilities.application.session.BasicSession;
import hochberger.utilities.eventbus.SimpleEventBus;

public class CourseAdministrationApplication extends BasicLoggedApplication {

    private final BasicSession session;

    public static void main(final String... args) {
        setUpLoggingServices(CourseAdministrationApplication.class);
        try {
            final ApplicationProperties applicationProperties = new ApplicationProperties();
            final CourseAdministrationApplication application = new CourseAdministrationApplication(applicationProperties);
            application.start();
        } catch (final Exception e) {
            getLogger().fatal("Error while starting application. Shutting down.", e);
            System.exit(0);
        }
    }

    public CourseAdministrationApplication(final ApplicationProperties applicationProperties) {
        this.session = new BasicSession(applicationProperties, new SimpleEventBus(), getLogger());
    }

}
