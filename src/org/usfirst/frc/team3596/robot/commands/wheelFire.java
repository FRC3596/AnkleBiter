package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class wheelFire extends Command {

	public wheelFire() {
		requires(Robot.wheelShooter);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.wheelShooter.enable();
		
	}

	protected boolean isFinished(){
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.wheelShooter.stop();
	}
}
