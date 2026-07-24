class reverseString
{
    public static void main(String[] args) {
        
        String str=new String("Comeback");
        String reversed ="";
        System.out.println(str);

        for (int i = str.length()-1; i > 0; i--) {

            reversed=reversed+str.charAt(i);
            
        }

        System.out.println(reversed);


    }
}