// Programmer Daniel Torres Larreta
// Purpose: This program will create a dictionary using a BTS to do a customer lookup

import java.util.Scanner;

// Class to manage dictionary
public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST(); // Creates a bts to manage records

        // Main loop to display menu and perform operations
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a record");
            System.out.println("2. Delete a record");
            System.out.println("3. Lookup records");
            System.out.println("4. Modify a record");
            System.out.println("5. List number of records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            
            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected: Add a record.");

                    
                    System.out.print("Enter key: ");
                    int key = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter street address: ");
                    String streetAddress = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter ZIP: ");
                    int zip = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    // Add record to BST
                    bst.add(key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
                    System.out.println("Record added successfully.");
                    break;
                case 2:
                    System.out.println("Option 2 selected: Delete a record.");

                   
                    System.out.print("Enter key of record to delete: ");
                    int keyToDelete = scanner.nextInt();
                    scanner.nextLine(); 

                    // Delete record from BST
                    bst.delete(keyToDelete);
                    System.out.println("Record deleted successfully.");
                    break;
                case 3:
                    System.out.println("Option 3 selected: Lookup records.");

                    // Perform lookup operation and display records
                    System.out.println("Choose order for lookup:");
                    System.out.println("1. Pre-order");
                    System.out.println("2. In-order");
                    System.out.println("3. Post-order");
                    int lookupChoice = scanner.nextInt();
                    scanner.nextLine(); 
                    switch (lookupChoice) {
                        case 1:
                            System.out.println("Records in Pre-order:");
                            bst.preorder();
                            break;
                        case 2:
                            System.out.println("Records in In-order:");
                            bst.inorder();
                            break;
                        case 3:
                            System.out.println("Records in Post-order:");
                            bst.postorder();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 4:
                    System.out.println("Option 4 selected: Modify a record.");

                    
                    System.out.print("Enter key of record to modify: ");
                    int keyToModify = scanner.nextInt();
                    scanner.nextLine(); 

                    // Prompt user for updated record information
                    System.out.print("Enter first name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String newLastName = scanner.nextLine();
                    System.out.print("Enter street address: ");
                    String newStreetAddress = scanner.nextLine();
                    System.out.print("Enter city: ");
                    String newCity = scanner.nextLine();
                    System.out.print("Enter state: ");
                    String newState = scanner.nextLine();
                    System.out.print("Enter ZIP: ");
                    int newZip = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String newPhoneNumber = scanner.nextLine();

                    // Update record in BST
                    bst.update(keyToModify, newFirstName, newLastName, newStreetAddress, newCity, newState, newZip, newEmail, newPhoneNumber);
                    break;
                case 5:
                    System.out.println("Option 5 selected: List number of records.");
                    System.out.println("Number of records: " + bst.countRecords());
                    break;
                case 6:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
    }
}
