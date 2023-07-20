import javax.swing.*;
import java.util.ArrayList;

public class PersonInfo {
    String firstName;
    String lastName;
    String phoneNumber;
    String emailAddress;

    PersonInfo(String fN,String lN, String pN, String eA){
        firstName = fN;
        lastName = lN;
        phoneNumber = pN;
        emailAddress = eA;
    }

    //display on GUI
    void display(){
        JOptionPane.showMessageDialog(null, "First Name:" + firstName + "Last Name" +lastName + "Phone Number:" + phoneNumber + "Email Address:" + emailAddress);
    }
}

class AddressBook {
    ArrayList persons;

    //constructor
    AddressBook(){
        persons = new ArrayList();
    }

    //adding
    void addPerson(){
        String fN = JOptionPane.showInputDialog("Enter First Name:");
        String lN = JOptionPane.showInputDialog("Enter Last Name:");
        String pN = JOptionPane.showInputDialog("Enter Phone Number:");
        String eA = JOptionPane.showInputDialog("Enter Email Address:");
        //creating a personInfo object
        PersonInfo p = new PersonInfo(fN, lN, pN, eA);
        persons.add(p);
    }

    //deleting
    void deletePerson(String fN){
        for (int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo) persons.get(i);
            if (fN.equals(p.firstName)){
                persons.remove(i);
            }
        }
    }

    //searching
    void searchPerson(String fN){
        for (int i = 0; i < persons.size(); i++){
            PersonInfo p = (PersonInfo) persons.get(i);
            if (fN.equals(p.firstName)){
                p.display();
            }
        }
    }

    //printing all content
    void printAllPerson(String[] args){
        for (int i = 0; i < persons.size(); i++){
            System.out.println(persons.get(i) + "");
        }
    }


    //removing all content
    void removeAllPerson(String[] args){
        ArrayList<String> persons = new ArrayList();
        PersonInfo p = new PersonInfo(fN, lN, pN, eA);

        persons.removeAll(persons);
        System.out.println("Entries after removeAll(): " + persons);

    }
}
