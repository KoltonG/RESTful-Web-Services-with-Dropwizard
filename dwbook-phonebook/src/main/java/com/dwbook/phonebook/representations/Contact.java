package com.dwbook.phonebook.representations;

/**
 * Representation class for a contact.
 */
public class Contact {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String phone;

    /**
     * Default constructor
     */
    public Contact() {
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.phone = null;
    }

    /**
     * Primary constructor
     * @param id Identifier of the contact
     * @param firstName First name of the contact
     * @param lastName Last name of the contact
     * @param phone Phone number of the contact
     */
    public Contact(int id, String firstName, String lastName, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }
}
