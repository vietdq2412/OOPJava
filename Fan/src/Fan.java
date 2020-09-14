
public class Fan {
    static final int FAST = 3;
    static final int MEDIUM = 2;
    static final int SLOW = 1;

    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
        this.speed = SLOW;
        this.isOn = false;
        this.radius = 5;
        this.color = "blue";
    }

    public String toString(){
        if (this.isOn){
            return "Speed: "+ this.speed + " - color: "+ this.color+ " - Fan is on!";
        }else {
            return "Fan is off!";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
