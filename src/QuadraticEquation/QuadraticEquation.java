package QuadraticEquation;

public class QuadraticEquation {
   private double a,b,c;
    public  QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public double getDiscriminant(){
        return (Math.pow(b,2)-4*a*c);
    }
    public double getRoot1(){
        return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
    }
public void getAnsewr(){
       double delta= this.getDiscriminant();
       if(delta>0){
           System.out.println("Equation has two roots"+this.getRoot1()+""+this.getRoot2());

       }else if(delta==0){
           System.out.println("Equation has one root"+this.getRoot1());
       }
       else {
           System.out.println("Equation has no real roots");
       }
}

}
