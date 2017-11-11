package org.usfirst.frc.team3596.robot.subsystems;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnewmatics extends Subsystem {
	Compressor compressor;
	Timer timer;
	


	public Pnewmatics() {
		if (Robot.isReal()) {
			compressor = new Compressor(50);
			timer = new Timer();
			
		}
	}

	public void initDefaultCommand() {
	}

	public void start() {
		if (compressor.getPressureSwitchValue()) {
			Timer.delay(30);
			compressor.start();
		}
		else
			compressor.stop();
	}
	public void stop(){
		compressor.stop();
	}
}

