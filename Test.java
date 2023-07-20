import javax.swing.*;


public class Test {
    public static void main(String[] args){
        AddressBook aB = new AddressBook();
        String input;
        String s;
        int ch;

        while (true) {
            input = JOptionPane.showInputDialog("" +
                    "1. Add an Entry \n" +
                    "2. Delete an entry\n " +
                    "3. Search for an entry \n " +
                    "4. Print the contents of address book\n " +
                    "5. Delete the contents of address book\n " +
                    "6. Exit");
            ch = Integer.parseInt(input);


            switch (ch) {
                case 1:
                    aB.addPerson();
                    break;

                case 2:
                    s = JOptionPane.showInputDialog("Enter First Name to delete");
                    aB.deletePerson(s);
                    break;
                case 3:
                    s = JOptionPane.showInputDialog("Enter First Name to search:");
                    aB.searchPerson(s);
                    break;
                case 4:
                    s = JOptionPane.showInputDialog("Enter Y to continue with printing all content: ");
                    aB.printAllPerson(p);
                    break;
                case 5:
                    s = JOptionPane.showInputDialog("Enter Y to continue with deleting all content:");
                    aB.removeAllPerson(p);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}