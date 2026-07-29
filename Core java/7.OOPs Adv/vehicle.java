class vehicleee
{
    void type()
    {
        System.out.println("this is a vehicle");
    }
}

class car extends vehicle{

    void type()
    {
        System.out.println("this is a car");
    }
}

class electricCar extends car{
    void type()
    {
        System.out.println("this is a electric car");
    }
}

class vehicle
{
    public static void main(String[] args) {
        vehicleee v =new vehicleee();
        v.type();

        car c=new car();
        c.type();

        electricCar e=new electricCar();
        e.type();

    }
}