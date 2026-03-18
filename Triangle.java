public class Triangle extends GeometricObject {
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
    public double getArea() {        
        double s = (s1 + s2 + s3)/2.0;
		double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        return area;
    }

    public double getPerimeter() {return s1 + s2 + s3;}


    //ADD GETDATECREATED()
    public String toString() {
        return "The Triangle was created on "  + 
        getDateCreated() +
        ". The sides are: " + s1 + ", " + s2 + ", " + s3 + ". The area = " + getArea();
    }

    public boolean equals(Triangle r){
        return (this.getArea() == r.getArea() &&
                this.getPerimeter() == r.getPerimeter());
    }
    
    /* 
    @Override
    public Triangle clone() throws CloneNotSupportedException {
        Triangle copyT = (Triangle) super.clone();

        if (getDateCreated() != null) {
            copyT.setDateCreated(new java.util.Date(getDateCreated().getTime()));
        }

        return copyT;
    }
    */

}
