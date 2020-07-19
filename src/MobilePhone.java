import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contact> contacts;
    private Scanner scanner;
    private boolean isOn;

    public MobilePhone() {
        this.contacts = new ArrayList<>();
        this.scanner = new Scanner(System.in);

    }

    public void startPhone (){
        this.isOn = true;
        System.out.println("Phone started....");
        while (isOn){
            System.out.println("OPTIONS\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to get all contacts list \n" +
                    "Press 3 to update a contact\n" +
                    "Press 4 to remove a contact\n" +
                    "Press 5 to find/search a contact\n" +
                    "Press 6 to quit");
            String action = scanner.nextLine();
            switch (action){
                case "1": addContact(); break;

                case "2": getAllContacts(); break;

                case "3": updateContact(); break;

                case "4": removeContact(); break;

                case "5": findContact(); break;

                case "6": quit(); break;

                default:
                    System.out.println("Invalid Option");
                    System.out.println();
                    break;

            }
        }
    }

    private void addContact (){
        System.out.println("Write the name: ");
        String name = scanner.nextLine();
        System.out.println("Write the number: ");
        String number = scanner.nextLine();

        Contact newContact = Contact.newContact(name, number);
        this.contacts.add(newContact);
        System.out.println("Contact added");
        System.out.println();


    }

    private void getAllContacts (){

        for (Contact contact : contacts){
            System.out.println("Name: " + contact.getName());
            System.out.println("Number: " + contact.getNumber());
            System.out.println();
        }

    }

    private void updateContact(){
        System.out.println("Contact name: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                System.out.println("OPTIONS\n" +
                        "Press 1 to update the name\n" +
                        "Press 2 to update the number\n");
                String actions = scanner.nextLine();
                switch (actions){
                    case "1": updateName(contact); break;

                    case "2": updateNumber(contact); break;

                    default:
                        System.out.println("invalid Entry");
                        System.out.println();
                        break;

                }
            }

        }
    }

    private void removeContact (){
        Contact contact = findContact();
        if (contact != null){
            contacts.remove(contact);
            System.out.println("Removing contact....");
            System.out.println();
        }
    }

    private  Contact findContact (){

        System.out.println("Contact name: ");
        String name = scanner.nextLine();
        Contact myContact = null;
        for (Contact contact : contacts){
            if (contact.getName().equals(name)){
                myContact = contact;
            }
            else System.out.println("Contact not found\n");
        }
        if (myContact != null){
            System.out.println("Name: " + myContact.getName());
            System.out.println("Number: " + myContact.getNumber());
            System.out.println();

        }
        return myContact;
    }


    private void quit (){
        System.out.println("Exiting...");
        isOn = false;
    }

    private void updateName (Contact contact){
        System.out.println("New Contact name: ");
        String name = scanner.nextLine();
        contact.setName(name);
        System.out.println();
    }

    private void updateNumber (Contact contact){
        System.out.println("New Contact number: ");
        String number = scanner.nextLine();
        contact.setNumber(number);
        System.out.println();
    }

}
