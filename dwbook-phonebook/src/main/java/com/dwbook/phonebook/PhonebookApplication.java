package com.dwbook.phonebook;

import com.dwbook.phonebook.resources.ContactsResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Phonebook application class which extends the Dropwizard Configuration class through the PhonebookConfiguration
 * class.
 *
 * The run method is where all the work is being conducted.
 *
 * The initialize method is being called before the run method, place any startup tasks in here.
 */
public class PhonebookApplication extends Application<PhonebookConfiguration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PhonebookApplication.class);

    public static void main(String[] args) throws Exception {
        new PhonebookApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<PhonebookConfiguration> b) {
    }

    /**
     * All config.yml keys are available through the configuration file only if
     * it has been initialized/defined and a getter method has been created.
     * @param c Configuration file
     * @param e Environment file
     * @throws Exception
     */
    @Override
    public void run(PhonebookConfiguration c, Environment e) throws Exception {
        // Add the contacts resource to the environment
        e.jersey().register(new ContactsResource());
    }
}
