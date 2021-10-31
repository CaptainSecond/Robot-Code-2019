package org.usfirst.frc.team4972.robot.commands;

// import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetArmPositionPIDCommand extends Command {
  
    // int setPoint;
    // double error, position, sumOfErrors, lastError = 0;
    // double Ku = 0.2;
    // double Tu = 4;

    // // double P = .45*Ku;
    // // double I = .54*Ku/Tu; // .54 * Ku / Tu;

    // double P = 0.02;
    // double I = 0; // .54 * Ku / Tu;

    // double integral, derivative = 0;

    public SetArmPositionPIDCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // integral = 0;
        // derivative = 0;
        // sumOfErrors = 0;
        // lastError = 0;
        // Robot.ArmSub.resetEncoderValue();
    }

    protected void execute() {

        // System.out.println("Encoder Value: " + Robot.ArmSub.getArmEncoderValue());
        // System.out.println("Set Point: " + Robot.ArmSub.getArmSetPoint());



        // error = Robot.ArmSub.getArmSetPoint() - Robot.ArmSub.getArmEncoderValue();
        // integral += (error * .02);
  
        // Robot.ArmSub.setArmMotorSpeed(P * error + I * integral);
        // lastError = error;
        // sumOfErrors = sumOfErrors + error;

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
