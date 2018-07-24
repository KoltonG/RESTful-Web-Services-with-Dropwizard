package com.dwbook.phonebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Configuration class for the Phonebook API. This extends the Configuration class which get's it's configuration
 * file location from the command line arguments.
 *
 * Note that this class is a one to one mapping of the config.yml file and that is how we are retreiving the message
 * and messageRepetitions variables from the .yaml file to the application class.
 */
public class PhonebookConfiguration extends Configuration {
    @JsonProperty // Defines a JSON property mapping to an String in the .yaml file
    private String message;

    @JsonProperty
    private int messageRepetitions;

    // Getters for the configuration file
    public String getMessage() {
        return message;
    }

    // Getters for the configuration file
    public int getMessageRepetitions() {
        return messageRepetitions;
    }
}
