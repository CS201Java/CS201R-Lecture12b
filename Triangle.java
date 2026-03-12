public class Triangle {
    private int s1, s2, s3;

    public Triangle(){}
    
    //ADD CALL TO SUPER
    public Triangle (int s1, int s2, int s3){
        this.s1 = s1; 
        this.s2 = s2; 
        this.s3 = s3; 
    }

    //ADD CALL TO SUPER
    public Triangle(int s1, int s2, int s3, String color, boolean filled) {
        this.s1 = s1; 
        this.s2 = s2; 
        this.s3 = s3; 
    }

    //COMPLETE THESE FUNCTIONS
    public double getArea() {return 0;}
    public double getPerimeter() {return 0;}


    //ADD GETDATECREATED()
    public String toString() {
        return " ";
    }

    public boolean equals(Triangle r){
        return (this.getArea() == r.getArea() &&
                this.getPerimeter() == r.getPerimeter());
    }
    
    //ADD COMPARETO LOGIC HERE
    public int compareTo(Triangle other){
    return 0;
    }

}
