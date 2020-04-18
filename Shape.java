package hinhoc;

public class Shape {

    private String color="blue";
    private boolean filled=false;
    public Shape(){
    }

    public Shape(String color ,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A shape with "+getColor()+" color and "+
                (isFilled() ? "fill":"not filled");
    }


}
class Circle extends Shape{
    private double radius=1;
    public Circle(){

    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with "+getColor()+" color and "+
                (isFilled() ? "fill":"not filled")
                + ", which is a subclass of "
                + super.toString();
    }


}
class Rectangle extends Shape{

    private double width;
    private double length;
    public Rectangle(){
    }
    public Rectangle(String color,boolean filled){
        super(color, filled);
    }
    public Rectangle(String color,boolean filled,double width,double height){
        super(color, filled);
        this.length =height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return  this.length*this.width;
    }

    @Override
    public String toString(){
        return "A retangle with "+getColor()+" color and "+
                (isFilled()? "fill":"not filled ")+
                " which subclass of "+super.toString();
    }


}
class Square extends Rectangle{
    private double side;
    public Square(){
    }

    public  Square(double side,String color,boolean filled){
        super( color,filled);
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side=side;
    }

    public double getArea(){
        return  this.side*this.side;
    }
    @Override
    public String toString(){
        return "A Square with side is "+getSide()+
                " and which subclass of "+super.toString();

    }

    public static void main(String[] args) {
        Square square=new Square(10,"orange",true);
        System.out.println(square);
        System.out.println("Area is "+ square.getArea());
    }

}
