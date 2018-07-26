package com.dwbook.phonebook;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Max;

/**
 * Configuration class for the Phonebook API. This extends the Configuration class which get's it's configuration
 * file location from the command line arguments.
 *
 * Note that this class is a one to one mapping of the config.yml file and that is how we are retreiving the message
 * and messageRepetitions variables from the .yaml file to the application class.
 */
public class PhonebookConfiguration extends Configuration {
    // This is a variable declaration with a default value in case that key is not in the configuration file.
    @JsonProperty
    private String additionalMessage = "This is optional";

    @JsonProperty // Defines a JSON property mapping to an String in the .yml file
    @NotEmpty
    private String message;

    @JsonProperty // Defining that this is a JSON property in the .yml file
    @Max(10) // Using teh validation library, we can make sure that our configuration file does not have a
    // messageRepetition greater than 10.
    private int messageRepetitions;

    // Getter for additionalMessage
    public String getAdditionalMessage() {
        return additionalMessage;
    }

    // Getters for the configuration file
    public String getMessage() {
        return message;
    }

    // Getters for the configuration file
    public int getMessageRepetitions() {
        return messageRepetitions;
    }
}
