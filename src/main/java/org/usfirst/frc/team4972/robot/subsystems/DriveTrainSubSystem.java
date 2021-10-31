package org.usfirst.frc.team4972.robot.subsystems;

import org.usfirst.frc.team4972.robot.RobotMap;
import org.usfirst.frc.team4972.robot.commands.DriveTrainCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 *
 */
public class DriveTrainSubSystem extends Subsystem {
	Talon LMotor,RMotor;
	DifferentialDrive drive;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public DriveTrainSubSystem(){
		

		LMotor = new Talon(RobotMap.leftMotor);
		RMotor = new Talon(RobotMap.RightMotor);
	
		drive = new DifferentialDrive(LMotor, RMotor);
	}
	
	public void curvatureDrive(double x,double y){
		drive.curvatureDrive(x, y, true);
	}
	
	public void tankDrive(double left,double right){
		drive.tankDrive(left*0.8, right*0.8);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveTrainCommand());
    }
}

