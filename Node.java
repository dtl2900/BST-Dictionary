public class Node {
    int key;
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    int zip;
    String email;
    String phoneNumber;
    Node left, right;

    public Node(int key, String firstName, String lastName, String streetAddress, String city, String state, int zip, String email, String phoneNumber) {
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
        left = right = null;
    }
}
