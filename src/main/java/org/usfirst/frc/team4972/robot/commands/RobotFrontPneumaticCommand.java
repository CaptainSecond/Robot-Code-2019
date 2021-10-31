package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RobotFrontPneumaticCommand extends Command {
	Value Direction;
    public RobotFrontPneumaticCommand(Value GetDirection) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	Direction = GetDirection;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.PneumaticSub.RobotFront(Direction);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
