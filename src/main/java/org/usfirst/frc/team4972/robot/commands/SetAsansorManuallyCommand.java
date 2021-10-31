/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetAsansorManuallyCommand extends Command {
  double speed;
  boolean IsFinished = false;
  public SetAsansorManuallyCommand(double speed) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.speed = speed;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   // Robot.AsansorSub.SetAsansorSpeed(speed);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
   
    //   if(speed > 0){
    //     if(Robot.AsansorSub.getUstSwitchStatus()){
    //         Robot.AsansorSub.SetAsansorSpeed(1);
          
    //     }else{
    //         IsFinished = true;
    //     //    Robot.AsansorSub.setPozisyon(3);
    //     }
    // }else if(speed<0){
    //     if(Robot.AsansorSub.getAltSwitchStatus()){
            
    //       Robot.AsansorSub.SetAsansorSpeed(-1);
            
    //     }else{
    //         IsFinished = true;
    //       // Robot.AsansorSub.setPozisyon(1);
    //     }
    // }
 //   System.out.println(Robot.AsansorSub.AsansorKonum());
    if(speed > 0){
  //    Robot.AsansorSub.asansorSayac.setReverseDirection(false);
    //  System.out.println(Robot.AsansorSub.AsansorKonum());
      Robot.AsansorSub.SetAsansorSpeed(1);
    }else if(speed<0){
        if(Robot.AsansorSub.getAltSwitchStatus()){
       //   Robot.AsansorSub.asansorSayac.setReverseDirection(true);
       //   System.out.println(Robot.AsansorSub.asansorSayac.getDirection());
              Robot.AsansorSub.SetAsansorSpeed(-0.4);
                
        }else{
          IsFinished = true;
          Robot.AsansorSub.AsansorReset();
          }
    }else{
        IsFinished = true;
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
    Robot.AsansorSub.AsansorStop();
    
    
    IsFinished = false;
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.AsansorSub.AsansorStop();
  }
}
