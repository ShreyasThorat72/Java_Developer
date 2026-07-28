class Employee
{
    int empid;
    int salary;


    Employee(int id,int sal)
    {
        empid=id;
        salary=sal;
    }

    void display()
    {
        System.out.println(salary);
        System.out.println(empid);
    }





    public static void main(String[] args) {
        
        Employee e=new Employee(23,90000);

        e.display();
    }
}