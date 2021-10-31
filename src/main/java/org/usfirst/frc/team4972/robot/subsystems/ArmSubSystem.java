/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot.subsystems;

import org.usfirst.frc.team4972.robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class ArmSubSystem extends Subsystem {
  Victor ArmMotor = new Victor(RobotMap.ArmMotor); // Pg71
  Encoder ArmEncoder;
  Victor IntakeMotor; // Bag 1
  
  DigitalInput altSwitch;
	DigitalInput ustSwitch;

  
  
  int setPoint = 0;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public ArmSubSystem() {

    ArmMotor.setInverted(true);
    IntakeMotor = new Victor(RobotMap.ArmIntakeMotor); // Bag1 Motor
    
   
   
    ustSwitch = new DigitalInput(RobotMap.ArmUstSwitch);
		altSwitch = new DigitalInput(RobotMap.ArmAltSwitch);
  }

  public void setArmMotorSpeed(double speed) {
    ArmMotor.set(speed);
  }

  public void cargoIntakeSpeed(double speed){
    IntakeMotor.set(speed);
  }

  public void stopCargoIntakeMotors(){
    IntakeMotor.set(0);
  }
  public boolean getAltSwitchStatus(){
		return altSwitch.get();
	}
	public boolean getUstSwitchStatus(){
		return ustSwitch.get();
	}
  

  public void stopArmMotor() {
    ArmMotor.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
