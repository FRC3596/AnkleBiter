package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
//import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cylinder extends Subsystem {

	// Solenoid(CAN ID, PCM channel);
	Solenoid extend = new Solenoid(50, 0);
	Solenoid retract = new Solenoid(50, 1);
	

    public void initDefaultCommand() {

    }
    
    
    
    
    public void extend() {
    	extend.set(true);
    }
    public void cylinderOff(){
    	extend.set(false);//turns off piston after actuated^
    	retract.set(false);
    }
    public void retract(){
    	retract.set(true);
    }

    
}

