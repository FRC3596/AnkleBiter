package org.usfirst.frc.team3596.robot;

import org.usfirst.frc.team3596.robot.commands.ExtendCylinder;
import org.usfirst.frc.team3596.robot.commands.RetractCylinder;
import org.usfirst.frc.team3596.robot.commands.wheelFire;
import org.usfirst.frc.team3596.robot.subsystems.Wheel_Shooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick joy = new Joystick(0);

	public OI(){
		
		JoystickButton lb = new JoystickButton(joy, 4);
		JoystickButton rb = new JoystickButton(joy, 5);
		JoystickButton x = new JoystickButton(joy, 1);
		JoystickButton b = new JoystickButton(joy, 3);

		lb.whenPressed(new ExtendCylinder());
		rb.whenPressed(new RetractCylinder());
		x.toggleWhenPressed(new wheelFire());


	}

	public Joystick getJoystick() {
		return joy;
	}




}
