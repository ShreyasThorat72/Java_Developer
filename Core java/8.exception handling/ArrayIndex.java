 class ArrayIndex
 {
    public static void main(String args[])
    {
        try{
            int arr[]={10,20,30};
            System.out.println(arr[6]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bound ");
        }
    }
 }