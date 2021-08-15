import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

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
                    book.editContact();
                    break;
                case 3:
                    book.deleteContact();
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

    public void scan(){

        Scanner sc = new Scanner(System.in);


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
    }

    public void addContact(){

        System.out.println("**** let's create a contact in our contact book ****\n");
        scan();

        arrFirstName.add(firstName);
        arrLastName.add(lastName);
        arraddress.add(address);
        arrCity.add(city);
        arrState.add(state);
        arrZipCode.add(zipCode);
        arrPhoneNumber.add(phoneNumber);
        arrEmail.add(email);

    }

    public void editContact(){
        System.out.println("Enter users's first name :- ");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        for (int i =0 ;i<arrLastName.size(); i++){
            if (name.equals(arrFirstName.get(i))){

                arrFirstName.remove(i);
                arrLastName.remove(i);
                arraddress.remove(i);
                arrCity.remove(i);
                arrState.remove(i);
                arrZipCode.remove(i);
                arrPhoneNumber.remove(i);
                arrEmail.remove(i);

                System.out.println("**** let's edit a contact in our contact book ****\n");
                addContact();
                break;
            }
        }
    }

    public void deleteContact(){

        System.out.println("Enter users's first name to delete from contact book :- ");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        for (int j =0 ;j<arrLastName.size();j++){
            if (name.equals(arrFirstName.get(j))) {

                arrFirstName.remove(j);
                arrLastName.remove(j);
                arraddress.remove(j);
                arrCity.remove(j);
                arrState.remove(j);
                arrZipCode.remove(j);
                arrPhoneNumber.remove(j);
                arrEmail.remove(j);

                System.out.println("Deleted Contact Succesfully");
                break;
            }
        }
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