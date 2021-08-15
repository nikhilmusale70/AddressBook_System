import java.util.ArrayList;
import java.util.Scanner;

public class addressBook {

    public static void main(String[] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        AddressBookLogic book = new AddressBookLogic();

        while(flag==0) {

            System.out.println("****MENU**** \n1. Add a contact\n2. Edit a contact \n3. Delete a contact \n4. Print all the contacts\n5. Exit");
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    book.printAddressBook();
                    break;
                case 5:
                    flag = 1;
                    break;
                default:
                    System.out.println("please enter correct choice");
                    break;

            }
        }
    }
}


class AddressBookLogic {

    ArrayList<String> arrFirstName = new ArrayList();
    ArrayList<String> arrLastName = new ArrayList();
    ArrayList<String> arraddress = new ArrayList();
    ArrayList<String> arrCity = new ArrayList();
    ArrayList<String> arrState = new ArrayList();
    ArrayList<String> arrZipCode = new ArrayList();
    ArrayList<String> arrPhoneNumber = new ArrayList();
    ArrayList<String> arrEmail = new ArrayList();

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zipCode;
    public String phoneNumber;
    public String email;

    public void addContact(){

        Scanner sc = new Scanner(System.in);

        System.out.println("**** let's create a contact in our contact book ****\n");
        System.out.println("Enter your first name :- ");
        firstName = sc.nextLine();
        System.out.println("Enter your last name :- ");
        lastName = sc.nextLine();
        System.out.println("Enter your address :- ");
        address = sc.nextLine();
        System.out.println("Enter your city :- ");
        city = sc.nextLine();
        System.out.println("Enter your state:- ");
        state = sc.nextLine();
        System.out.println("Enter your zip code :- ");
        zipCode = sc.nextLine();
        System.out.println("Enter your phone number :- ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter your email :- ");
        email = sc.nextLine();

        arrFirstName.add(firstName);
        arrLastName.add(lastName);
        arraddress.add(address);
        arrCity.add(city);
        arrState.add(state);
        arrZipCode.add(zipCode);
        arrPhoneNumber.add(phoneNumber);
        arrEmail.add(email);

    }

    public void printAddressBook(){
        for (int i=0; i<arrFirstName.size(); i++){
            System.out.println("\n****Page Number "+ (i+1) + "****\n");
            System.out.println("First name :- " + arrFirstName.get(i));
            System.out.println("Last name :- " + arrLastName.get(i));
            System.out.println("Address :- " + arraddress.get(i));
            System.out.println("City :- " + arrCity.get(i));
            System.out.println("State :- " + arrState.get(i));
            System.out.println("Zip Code :- " + arrZipCode.get(i));
            System.out.println("Phone Number :- " + arrPhoneNumber.get(i));
            System.out.println("Email :- " + arrEmail.get(i));
            System.out.println("\n");
        }
    }

}
