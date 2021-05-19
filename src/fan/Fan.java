package fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }

    int getSpeed() {
        return speed;
    }
    boolean getOn() {
        return on;
    }
    double getRadius() {
        return radius;
    }
    String getColor() {
        return color;
    }
    void setSpeed(int changeSpeed) {
        speed = changeSpeed;
    }
    void setOn(boolean changeOn) {
        on = changeOn;
    }
    void setRadius(double changeRadius) {
        radius = changeRadius;
    }
    void setColor(String changeColor) {
        color = changeColor;
    }
    public String toString() {
        System.out.println();
        if (on) {
            return "Fan is on (Speed: " + this.speed + " ,radius: " + this.radius + " ,color: " + this.color + ")";
        } else {
            return "Fan is off (Radius: " + this.radius + " ,color: " + this.color + ")";
        }

    }
}
