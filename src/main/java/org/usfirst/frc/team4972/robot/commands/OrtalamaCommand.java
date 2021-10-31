package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OrtalamaCommand extends Command {
	boolean IsOk = false;
	float Kp = 0.1f;
	float min_command = 0.05f;

	double left_command = 0;
	double right_command = 0;
	 // USB needs to be changed
	float tx;
    public OrtalamaCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	tx  = Robot.ArdunioSub.getValue();
        System.out.println("Konum="+tx);
        if(tx > 175){
			Robot.DriveTrainSub.tankDrive(+0.8, -0.70);
			IsOk = false;
		}else if(tx < 165){
			Robot.DriveTrainSub.tankDrive(-0.80, +0.70);
			IsOk = false;
		}else{
			IsOk = true;
		}
  		
  		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return IsOk;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.DriveTrainSub.tankDrive(0, 0);
        IsOk=false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
