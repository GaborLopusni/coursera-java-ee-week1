package repository;

import model.Contact;

import java.util.HashMap;
import java.util.Map;

public class LocalRepository {
    private final Map<Long, Contact> contacts;

    public LocalRepository() {
        contacts = new HashMap<>();
    }

    public Contact getContact(String id) {
        return contacts.get(Long.parseLong(id));
    }

    public void addContact(String id, String firstName, String lastName) {
        Contact contact = new Contact(Long.parseLong(id), firstName, lastName);
        contacts.put(contact.getId(), contact);
    }
}
