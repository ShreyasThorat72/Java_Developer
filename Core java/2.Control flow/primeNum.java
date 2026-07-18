class primeNum
{
    public static void main(String[] args) {
        int num=9;

        if(num%1==0 && num%num==0)
        {
            System.out.println("number entered is prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}