package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class TankDrive extends DifferentialDrive {

	TankDrive() {
		super(new WPI_TalonSRX(RobotMap.MOTOR_FRONT_LEFT), new WPI_TalonSRX(RobotMap.MOTOR_FRONT_RIGHT));
	}

	public void drive(double leftSpeed, double rightSpeed) {
		leftSpeed = leftSpeed * leftSpeed;
		rightSpeed = rightSpeed * rightSpeed;
		tankDrive(leftSpeed, rightSpeed);
	}
}