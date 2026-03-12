import java.util.Date;

public abstract class GeometricObject{
    private String color;
    private boolean filled;
    private Date dateCreated;

     protected GeometricObject(){
        color = "green";
        filled = false;
        dateCreated = new java.util.Date();
     }
     protected GeometricObject(String c, boolean f){
        color = c;
        filled = f;
        dateCreated = new java.util.Date();
     }
     
     public String getColor() {return color;}
     public void setColor(String c) {color = c;}
     public boolean isFilled(){return filled;}
     public void setFilled(boolean f) {filled = f;}
     public Date getDateCreated() {return dateCreated;}
     public String toString(){return "created on: " + dateCreated + "\ncolor: " + color + " and filled: " + filled;}

     public abstract double getArea();
     public abstract double getPerimeter();

}