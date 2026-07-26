class Rectangle
{
    int radius;
    int area;


   void display()
   {
    area=radius*radius;
    System.out.println(area);
   }





public static void main(String[] args) {
    
    Rectangle r=new Rectangle();

    r.radius=3;

    r.display();
}


}