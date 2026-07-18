class Reverse_digits
{
    public static void main(String[] args) {
        int num=8734;
       int rem=0;
        for(int i=1;i<=4;i++)
        {
         int temp=rem;
         rem=num%10;
       
         num=num/10;   
        }
        System.out.println(rem);
    }
}