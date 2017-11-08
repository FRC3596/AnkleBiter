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
		Robot.cylinder.cylinderOff();

	}

	protected boolean isFinished() {
		return false;
	}
}
