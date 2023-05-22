public class Main {
    public static void main(String[] args) {

        EmployeeLinkedList ls1 = new EmployeeLinkedList();
        ls1.addEmployee(new Employee(1,"sylvia", 5000, "beni suef", "2003"));
        ls1.addEmployee(new Employee(2,"sylviaa", 5000, "beni suef", "2003" ));
        ls1.addEmployee(new Employee(3,"sylviaaa", 5000, "beni suef", "2003" ));
        System.out.println("the size: " + ls1.getSize());
        System.out.println("Empty? " + ls1.isEmpty());
        ls1.printList();

        System.out.println(ls1.linearSearch(3));
        System.out.println(ls1.binarySearch(3));
    }
}