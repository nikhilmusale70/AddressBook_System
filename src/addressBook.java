import java.util.Scanner;

public class addressBook {


    public static void main(String[] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);

        AddressBookLogic abl = new AddressBookLogic();

        while(flag==0) {
            System.out.println("****MENU**** \n1. Add a contact\n2. Edit a contact \n3. Delete a contact \n4. Print all the contacts\n5. Exit");
            int i = sc.nextInt();

            switch (i) {
                case 1:
                    abl.addContact();
                    break;
                case 2:
                    abl.editContact();
                    break;
                case 3:
                    abl.deleteContact();
                    break;
                case 4:
                    abl.printAddressBook();
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

class AddressBookLogic{
    public static AddressBookLogic[] book;


    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zipCode;
    public String phoneNumber;
    public String email;

    public AddressBookLogic(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName =lastName;
        this.address =address;
        this.state =state;
        this.city =city;
        this.email = email ;
        this.phoneNumber =phoneNumber;
        this.zipCode =zipCode;
    }

    public AddressBookLogic() {

    }

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
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of contacts you want to add :- ");
        int numberOfContact = sc.nextInt();
        book = new AddressBookLogic[numberOfContact];

        for (int i=0; i<book.length; i++){
            scan();
            AddressBookLogic ab = new AddressBookLogic(firstName, lastName, address, city, state, zipCode, phoneNumber, email);

            book[i] = ab;
        }
    }

    public void editContact(){
        System.out.println("Enter the First Name to edit:- ");
        Scanner sc = new Scanner(System.in);
        String fN= sc.nextLine();
        for (int i=0; i< book.length; i++){
            if (book[i].firstName.equals(fN)){
                scan();
                AddressBookLogic ab =new AddressBookLogic(firstName, lastName, address, city, state, zipCode, phoneNumber, email);
                book[i]=ab;
            }
        }
    }

    public void deleteContact(){
        System.out.println("Enter first name for deleting the contact");
        Scanner sc =new Scanner(System.in);
        String firstN = sc.nextLine();
        for (int i=0; i<book.length; i++){
            if (book[i].firstName.equals(firstN)){
                AddressBookLogic ab = new AddressBookLogic(null ,null ,null ,null ,null ,null ,null ,null);
                book[i]=ab;
            }
        }
    }

    public void printAddressBook(){
        for (int i=0; i<book.length; i++){
            System.out.println("\n****Page Number "+ (i+1) + "****\n");
            System.out.println("First name :- " + book[i].firstName);
            System.out.println("Last name :- " +  book[i].lastName);
            System.out.println("Address :- " +  book[i].address);
            System.out.println("City :- " +  book[i].city);
            System.out.println("State :- " +  book[i].state);
            System.out.println("Zip Code :- " +  book[i].zipCode);
            System.out.println("Phone Number :- " + book[i].phoneNumber);
            System.out.println("Email :- " + book[i].email);
            System.out.println("\n");
        }
    }
}