class Student {
    // Attributes
    int rollNo;
    String name;
    int age;

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating Student object
        Student s1 = new Student();

        // Assigning values
        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.age = 20;

        // Displaying details
        s1.display();
    }
}