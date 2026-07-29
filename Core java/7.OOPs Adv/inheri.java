class Animal
{
    void sound()
    {
        System.out.println("Sound of animal");
    }
}

class dog extends Animal{

    void sound()
    {
        System.out.println("dog barks");
    }
}

class inheri
{
    public static void main(String[] args) {
        
        dog d=new dog();
        d.sound();

        
    }
}