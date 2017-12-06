package org.usfirst.frc.team3596.robot.subsystems;

//import org.usfirst.frc.team3596.robot.RobotMap;
import org.usfirst.frc.team3596.robot.commands.TankDrive_Joystick;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	CANTalon frontLeftMotor = new CANTalon(1);
	CANTalon frontRightMotor = new CANTalon(2);
	CANTalon backLeftMotor = new CANTalon(3);
	CANTalon backRightMotor = new CANTalon(4);
	
	
	
	RobotDrive drive = new RobotDrive(frontLeftMotor,frontRightMotor,backLeftMotor,backRightMotor);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void drive(Joystick joy) {
		drive.arcadeDrive(-joy.getY(), -joy.getRawAxis(2));
	}
	public void drive(double left, double right) {
		drive.arcadeDrive(left, right);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new TankDrive_Joystick());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

