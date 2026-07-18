class Sum_of_even_num
{
    public static void main(String[] args) {
        int num=100;
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}