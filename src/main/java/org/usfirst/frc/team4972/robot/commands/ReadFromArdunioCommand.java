package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReadFromArdunioCommand extends Command {
    boolean IsOk = false;
    
    public ReadFromArdunioCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		@SuppressWarnings("unused")
		String clear = Robot.ArdunioSub.getArdunioValue();
    	Robot.ArdunioSub.Flush();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       
        Robot.ArdunioSub.setValue(Robot.ArdunioSub.getArdunioValue());
        System.out.println(Robot.ArdunioSub.getValue());
        //  if(Robot.ArdunioSub.getValue()>155  && Robot.ArdunioSub.getValue()<165 ){
        //      IsOk=true;
        //  }
      
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return IsOk;
    }

    // Called once after isFinished returns true
    protected void end() {
        
        
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
