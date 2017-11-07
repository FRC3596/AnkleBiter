package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class RetractCylinder extends InstantCommand{

	public RetractCylinder() {
		requires(Robot.cylinder);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.cylinder.retract();
	}
	
	// Called once after isFinished returns true
	protected void end() {
		Robot.cylinder.cylinderOff();
	}

}
