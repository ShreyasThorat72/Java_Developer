class divideByZero
{
    public static void main(String[] args) {
        
        try
        {
        int a=3;
        int b=0;
        int c=a/b;
        System.out.println(c);

        }

        catch(ArithmeticException e)
        {
            System.out.println("Cant be divided by zero");
        }
    }
}