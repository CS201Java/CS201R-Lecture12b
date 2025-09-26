
//COMPLETE THIS CLASS
//EXTEND GEOMETRICOBJECT 
//IMPLEMENT COMPARABLE

public class Rectangle{
    private int width;
    private int height;

    public Rectangle(){}

    //ADD CALL TO SUPER
    public Rectangle (int w, int h){
        width = w; 
        height = h;
    }

    //ADD CALL TO SUPER
    public Rectangle(int w, int h,String color, boolean filled) {

        width = w; 
        height = h;
    }

    //GETTERS AND SETTERS ARE DONE FOR YOU
    public int getWidth() {return width;}
    public int getheight() {return height;}
    public void   setWidth(int w) {this.width = w;}
    public void   setheight(int h) {this.height = h;}

    //COMPLETE THESE FUNCTIONS
    public double getArea() {return 0;}
    public double getPerimeter() {return 0;}

    //ADD GETDATECREATED()
    public String toString() {
        return "The rectangle is created "  + ". The width is " + width + " and the height is " + height + ". The area = " + getArea();
    }

    public boolean equals(Rectangle r){
        return this.width == r.width && this.height == r.height;
    }

    //ADD COMPARETO LOGIC HERE
    public int compareTo(Rectangle other){
        return 0;
    }
}
