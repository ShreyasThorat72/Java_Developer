class Vovels_Consonants
{
    public static void main(String[] args) {
        
        String str=new String("hello");

        int vovCount=0;
        int ConsoCount=0;

        for(int i=str.length()-1;i>0;i--)
        {
      
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')            {
            vovCount++;
            }
            else
            {
                ConsoCount++;
            }
        }
    }
}