package view;

import controller.Controller;

public class MockClientView {

    private final Controller controller = new Controller();

    private void displayFirstLast(String id) {
        System.out.println(controller.findAContact(id));
    }

    private void addAContact(String id, String firstName, String lastName) {
        controller.addAContact(id, firstName, lastName);
    }

    public static void main(String args[]) {
        MockClientView mockClientView = new MockClientView();

        mockClientView.addAContact("1", "DummyFirst", "DummyLast");
        mockClientView.addAContact("2", "DummyFirst1", "DummyLast1");
        mockClientView.addAContact("3", "DummyFirst2", "DummyLast2");
        mockClientView.addAContact("4", "DummyFirst3", "DummyLast3");

        mockClientView.displayFirstLast("2");
    }
}
