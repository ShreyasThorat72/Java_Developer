class Book
{
    void getters()
    {
        System.out.println("got a book");
    }

    void setters()
    {
        System.out.println("set a book");


    }


    public static void main(String[] args) {
        
        Book b=new Book();


        b.getters();
        b.setters();
    }
}