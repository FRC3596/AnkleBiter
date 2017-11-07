package org.usfirst.frc.team3596.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
//import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cylinder extends Subsystem {

	// Solenoid(CAN ID, PCM channel);
	DoubleSolenoid cylinder = new DoubleSolenoid(50,0,1);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    
    
    
    public void extend() {
    	cylinder.set(Value.kForward);
    }
    public void cylinderOff(){
    	cylinder.set(Value.kOff);//turns off piston after actuated^
    }
    public void retract(){
    	cylinder.set(Value.kReverse);
    }

    
}

