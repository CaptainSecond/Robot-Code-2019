package org.usfirst.frc.team4972.robot.subsystems;

import org.usfirst.frc.team4972.robot.RobotMap;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class UltrasonicSubSystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	AnalogInput Ultrasonic;
	
	public UltrasonicSubSystem(){
		Ultrasonic = new AnalogInput(RobotMap.UltrasonicPin);
	}
	
	public double getUltrasonicValue(){
		return (Ultrasonic.getValue() / 21.05);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

