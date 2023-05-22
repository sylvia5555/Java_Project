public class EmployeeLinkedList {
    public class Node  {
        public Employee item;
        public Node next;

        //constructor
        public Node(Employee item) {

            this.item = item;
        }
    }
    private Node head, tail;
    private int size;

    // Constructor
    public EmployeeLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Getters and setters
    public int getSize() {

        return size;
    }

    public boolean isEmpty() {

        return head == null;
    }

    // Add an employee to the linked list
    public void addEmployee(Employee employee) {
        Node newNode = new Node (employee);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

        newNode.next = null;

        size++;
    }

    // Remove an employee from the linked list
    public boolean removeEmployee(Employee employee) {
        if (head == null) {
            return false;
        }

        if (head.item.equals(employee)) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;

        while (current.next != null && !current.next.item.equals(employee)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
            return true;
        }

        return false;
    }

    // Print the linked list
    public void printList() {
        Node current = head;

        System.out.print("list : ");

        while (current != null) {
            System.out.print(current.item);
            System.out.println("-> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public boolean linearSearch(int emp_no) {
        Node current = head;
        while (current != null){
            if(current.item.getEmp_no() == emp_no)
                return true;
            else
                current = current.next;
        }
        return false;
    }
/*
    //binare search on linked list has time  O(n)
    public boolean BinarySearch(int emp_no){
        Node start = head,last = tail ;

        //getting the middle node
        while(start != null && start != tail) {

            Node slow = start, fast = start;
            while(fast != last) {
                fast = fast.next;
                if (fast != tail) {
                    slow = slow.next;
                    fast = fast.next;
                }
            } //slow >> mid

            if (slow.item.getEmp_no() == emp_no)
                return true;
            else {
                if (slow.item.getEmp_no() < emp_no)
                    start = slow.next;
                else
                    last = slow.next;
            }

        }
        return false;

    }*/

    private Node mid(Node start, Node last){
        if(start == null)
            return start;
        Node mid = start, fast = start.next;
        while (fast != last)
        {
            fast = fast.next;
            if (fast != last)
            {
                mid = mid.next;
                fast = fast.next;
            }
        }

        return mid;
    }

    public boolean binarySearch(int emp_no){

        Node start = head, last = null;
        do
        {
            // Find middle
            Node mid = mid(start, last);

            // If middle is empty
            if (mid == null)
                return false;

            // If value is present at middle
            if (mid.item.getEmp_no() == emp_no)
                return true;

                // If value is more than mid
            else if (mid.item.getEmp_no() < emp_no)
                start = mid.next;

                // If the value is less than mid.
            else
                last = mid;

        } while (last == null || last != start);

        return false;
    }

}

