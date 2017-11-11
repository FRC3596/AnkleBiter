package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class compressorControl extends Command {

    public compressorControl() {
       requires(Robot.compressor);
    }


    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.compressor.start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.compressor.stop();
    }

}
