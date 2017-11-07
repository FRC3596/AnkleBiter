package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CylinderOff extends Command {

	public CylinderOff() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.cylinder);

	}

	// Called just before this Command runs the first time
	protected void initialize() {


	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.cylinder.cylinderOff();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}
}
