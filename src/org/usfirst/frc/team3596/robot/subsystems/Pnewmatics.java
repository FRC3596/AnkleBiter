package org.usfirst.frc.team3596.robot.subsystems;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pnewmatics extends Subsystem {
	AnalogInput pressureSensor = new AnalogInput(3);
	Compressor compressor;

	private static final double kMaxPressure = 2.55;

	public Pnewmatics() {
		if (Robot.isReal()) {
			compressor = new Compressor();
		}

		
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    }
    
    public void start() {
		if (Robot.isReal()) {//.isReal() is when Robot start up
			compressor.start();
		}
	}
   
    public boolean isPressurized() {
		if (Robot.isReal()) {
			return kMaxPressure <= pressureSensor.getVoltage();
		} else {
			return true; // NOTE: Simulation always has full pressure
		}
	}
}

