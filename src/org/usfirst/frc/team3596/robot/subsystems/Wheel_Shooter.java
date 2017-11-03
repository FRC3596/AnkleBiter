package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Wheel_Shooter extends Subsystem {
	Spark left_wheel = new Spark(0);
	Spark right_wheel = new Spark(1);
	Relay loader = new Relay(0);

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
	}
	public void enable(){
		left_wheel.set(.5);
		right_wheel.set(-.5);
		
		// if (left_wheel.equals(.5) && (right_wheel.equals(-.5))) {
		loader.set(Value.kOn);
		// }
	}
	
	public void stop(){
		// Sets the motors and relays to zero.
		left_wheel.set(0);
		right_wheel.set(0);
		loader.set(Value.kOff);
	}
	
} 

