package org.usfirst.frc.team3596.robot.subsystems;

import org.usfirst.frc.team3596.robot.RobotMap;
import org.usfirst.frc.team3596.robot.commands.TankDrive_Joystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	CANTalon frontLeftMotor = new CANTalon(RobotMap.frontLeftMotor);
	CANTalon frontRightMotor = new CANTalon(RobotMap.frontRightMotor);
	CANTalon backLeftMotor = new CANTalon(RobotMap.backLeftMotor);
	CANTalon backRightMotor = new CANTalon(RobotMap.backRightMotor);
	RobotDrive drive = new RobotDrive(frontLeftMotor,frontRightMotor,backLeftMotor,backRightMotor);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void drive(Joystick joy) {
		drive.tankDrive(-joy.getY(), -joy.getRawAxis(2));
	}
	public void drive(double left, double right) {
		drive.tankDrive(left, right);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new TankDrive_Joystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

