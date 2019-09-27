package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import java.lang.Math;

public class TankDrive extends DifferentialDrive {

	TankDrive() {
		super(new WPI_TalonSRX(RobotMap.MOTOR_FRONT_LEFT), new WPI_TalonSRX(RobotMap.MOTOR_FRONT_RIGHT));
	}

	public void drive(double leftSpeed, double rightSpeed) {
/*		int exponent = 1;
		if (leftSpeed < 0){
			leftSpeed = -Math.pow(leftSpeed, exponent);
		}
		if (rightSpeed < 0){
			rightSpeed = -Math.pow(rightSpeed, exponent);
		}
		if (leftSpeed > 0){
			leftSpeed = Math.pow(leftSpeed, exponent);
		}
		if (rightSpeed > 0){
			rightSpeed = Math.pow(rightSpeed, exponent);
		}*/
		tankDrive(leftSpeed, rightSpeed);
	}
}