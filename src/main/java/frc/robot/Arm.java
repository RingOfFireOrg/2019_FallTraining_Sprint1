package frc.robot;
import edu.wpi.first.wpilibj.Servo;

public class Arm  {
	
    private Servo actuator;
    private int angle;

    // range of motion in degrees
    public final int RANGE = 180;
    private final double MIDPOINT = RANGE/2;
    
	Arm(int port) {
        angle = 90; // start pointing up
        actuator = new Servo(port);
	}

    // utility function
	private static int joystick_to_degrees(double joystick_reading) {
        /* convert [-1.0,1.0] to [0,180] */;
        double offset_from_midpoint = MIDPOINT * joystick_reading;
        double degrees = MIDPOINT + offset_from_midpoint;
        return (int) degrees;
    }	
    
    public void goToPosition(double joystick_reading) {
        angle = this.joystick_to_degrees(joystick_reading)
        actuator.setAngle(angle);
    }

    public int getAngle() {
        return angle;
    }
}