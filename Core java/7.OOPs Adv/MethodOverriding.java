class dog
{
    void eat()
    {
        System.out.println("this is eating");
    }
}

class cat extends dog{

    void drink()
    {
        System.out.println("this is drinking ");
    }
}

class method extends cat
{
    
        
        void eat()
        {
            System.out.println("i am not eating");
        }

        void bark()
        {
            System.out.println("dog barks");
        }
    }

class MethodOverriding
{
    public static void main(String[] args) {
        
        method m=new method();
        m.eat();
        m.bark();
        m.drink();
    }
}