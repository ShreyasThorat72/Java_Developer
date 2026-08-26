class Try_catch_finally
{
    public static void main(String args[])
    {
        try{
            int num=10/0;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("this will exectue every time ");
        }
    }
}