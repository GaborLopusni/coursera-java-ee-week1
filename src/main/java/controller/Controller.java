package controller;

import repository.LocalRepository;

public class Controller {

    private final LocalRepository repository;

    public Controller() {
        this.repository = new LocalRepository();
    }

    public void addAContact(String id, String firstName, String lastName) {
        repository.addContact(id, firstName, lastName);
    }

    public String findAContact(String id) {
        return repository.getContact(id).toString();
    }
}
