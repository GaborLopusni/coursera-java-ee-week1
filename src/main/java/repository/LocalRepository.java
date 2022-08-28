package repository;

import model.Contact;

import java.util.HashMap;
import java.util.Map;

public class LocalRepository {
    private final Map<String, Contact> contacts;

    public LocalRepository() {
        contacts = new HashMap<>();
    }

    public Contact getContact(String id) {
        return contacts.get(id);
    }

    public void addContact(String id, String firstName, String lastName) {
        contacts.put(id, new Contact(1, firstName, lastName));
    }
}
