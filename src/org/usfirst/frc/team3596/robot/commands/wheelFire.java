package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;


/**
 *
 */
public class wheelFire extends TimedCommand {

	public wheelFire() {
		super(1);
		requires(Robot.wheelShooter);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}
	

	// Called once after isFinished returns true
	protected void end() {
		Robot.wheelShooter.forward();
	}
}
