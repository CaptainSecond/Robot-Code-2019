package org.usfirst.frc.team4972.robot.commands;


import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainCommand extends Command {
	
    public DriveTrainCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.DriveTrainSub);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.DriveTrainSub.curvatureDrive(Robot.oi.F310.getRawAxis(1) * -0.8, Robot.oi.F310.getRawAxis(4) * 1);
      // System.out.println(Robot.ArdunioSub.getValue());
       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
