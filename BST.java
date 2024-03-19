class BST {
    Node root; // Root node of the BST

    
    BST() {
        root = null;
    }

    // Method to add a new record to the BST
    void add(int key, String firstName, String lastName, String streetAddress, String city, String state, int zip, String email, String phoneNumber) {
        root = addRecursive(root, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
    }

    
    Node addRecursive(Node root, int key, String firstName, String lastName, String streetAddress, String city, String state, int zip, String email, String phoneNumber) {
        
        if (root == null) {
            return new Node(key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        }

        
        if (key < root.key) {
            root.left = addRecursive(root.left, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        }
        
        else if (key > root.key) {
            root.right = addRecursive(root.right, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        }

        return root;
    }

    // Method to delete a record from the BST
    void delete(int key) {
        root = deleteRecursive(root, key);
    }

    // Recursive helper method to delete a record from the BST
    Node deleteRecursive(Node root, int key) {
        
        if (root == null) {
            return root;
        }

       
        if (key < root.key) {
            root.left = deleteRecursive(root.left, key);
        }
       
        else if (key > root.key) {
            root.right = deleteRecursive(root.right, key);
        }
        
        else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            
            root.key = minValue(root.right);
            
            root.right = deleteRecursive(root.right, root.key);
        }

        return root;
    }

    // Method to find the minimum value node in a BST
    int minValue(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }

    // Method to perform inorder traversal of the BST
    void inorder() {
        inorderRecursive(root);
    }

    // Recursive helper method to perform inorder traversal of the BST
    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.println("Key: " + root.key + ", Name: " + root.firstName + " " + root.lastName);
            inorderRecursive(root.right);
        }
    }

    // Method to perform preorder traversal of the BST
    void preorder() {
        preorderRecursive(root);
    }

    // Recursive helper method to perform preorder traversal of the BST
    void preorderRecursive(Node root) {
        if (root != null) {
            System.out.println("Key: " + root.key + ", Name: " + root.firstName + " " + root.lastName);
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    // Method to perform postorder traversal of the BST
    void postorder() {
        postorderRecursive(root);
    }

    // Recursive helper method to perform postorder traversal of the BST
    void postorderRecursive(Node root) {
        if (root != null) {
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.println("Key: " + root.key + ", Name: " + root.firstName + " " + root.lastName);
        }
    }

    // Method to count the number of records in the BST
    int countRecords() {
        return countNodes(root);
    }

    // Recursive helper method to count the number of nodes in the BST
    int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Method to update a record in the BST
    void update(int key, String firstName, String lastName, String streetAddress, String city, String state, int zip, String email, String phoneNumber) {
        
        Node nodeToUpdate = search(root, key);
        if (nodeToUpdate != null) {
            
            nodeToUpdate.firstName = firstName;
            nodeToUpdate.lastName = lastName;
            nodeToUpdate.streetAddress = streetAddress;
            nodeToUpdate.city = city;
            nodeToUpdate.state = state;
            nodeToUpdate.zip = zip;
            nodeToUpdate.email = email;
            nodeToUpdate.phoneNumber = phoneNumber;
            System.out.println("Record updated successfully.");
        } else {
            System.out.println("Record with key " + key + " not found.");
        }
    }

    // Method to search for a node with a given key in the BST
    Node search(Node root, int key) {
      
        if (root == null || root.key == key) {
            return root;
        }

       
        if (key < root.key) {
            return search(root.left, key);
        }

        
        return search(root.right, key);
    }
}

