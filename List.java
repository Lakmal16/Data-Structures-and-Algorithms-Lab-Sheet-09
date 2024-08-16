public class List {
    private int maxSize;
    private int position;
    private Customers[] listEntry;

    // Constructor
    public List(int size) {
        this.maxSize = size;
        this.listEntry = new Customers[maxSize];
        this.position = -1;
    }

    // Check if the list is empty
    public boolean isListEmpty() {
        return position == -1;
    }

    // Check if the list is full
    public boolean isListFull() {
        return position == maxSize - 1;
    }

    // Insert an element at the end of the list
    public void insertLast(Customers x) {
        if (isListFull()) {
            System.out.println("Attempt to insert at the end of a full list");
        } else {
            listEntry[++position] = x;
        }
    }

    // Insert an element at a specific position
    public void insertList(int p, Customers element) {
        if (isListFull()) {
            System.out.println("Attempt to insert an entry into a full list");
        } else if (p < 0 || p > listSize()) {
            System.out.println("Attempt to insert at an invalid position");
        } else {
            // Shift elements to make room for the new element
            for (int i = listSize(); i > p; i--) {
                listEntry[i] = listEntry[i - 1];
            }
            listEntry[p] = element;
            position++;
        }
    }

    // Delete an element from a specific position
    public Customers deleteList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Attempt to delete from an invalid position");
            return null;
        } else {
            Customers element = listEntry[p];
            // Shift elements to fill the gap
            for (int i = p; i < listSize() - 1; i++) {
                listEntry[i] = listEntry[i + 1];
            }
            position--;
            return element;
        }
    }

    // Retrieve an element from a specific position
    public Customers retrieveList(int p) {
        if (isListEmpty()) {
            System.out.println("Attempt to retrieve an entry from an empty list");
            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Attempt to retrieve from an invalid position");
            return null;
        } else {
            return listEntry[p];
        }
    }

    // Replace an element at a specific position
    public void replaceList(int p, Customers x) {
        if (isListEmpty()) {
            System.out.println("Attempt to replace an entry in an empty list");
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Attempt to replace at an invalid position");
        } else {
            listEntry[p] = x;
        }
    }

    // Traverse the list and print all elements
    public void traverseList() {
        for (int i = 0; i <= position; i++) {
            System.out.println(listEntry[i]);
        }
    }

    // Get the current size of the list
    public int listSize() {
        return position + 1;
    }
}