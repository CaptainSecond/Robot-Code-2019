/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetArmManuallyCommand extends Command {
  double speed;
  boolean IsFinished = false;
  
  public SetArmManuallyCommand(double speed) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.speed = speed;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
     

      if(speed > 0){
        if(Robot.ArmSub.getUstSwitchStatus()){
            Robot.ArmSub.setArmMotorSpeed(0.9);
          
        }else{
            IsFinished = true;
        }
     }else if(speed<0){
        if(Robot.ArmSub.getAltSwitchStatus()){
            
          Robot.ArmSub.setArmMotorSpeed(-0.3);
            
        }else{
            IsFinished = true;
        }
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.ArmSub.setArmMotorSpeed(0);
    IsFinished = false;
  }
    
  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.ArmSub.setArmMotorSpeed(0);
  }
}
