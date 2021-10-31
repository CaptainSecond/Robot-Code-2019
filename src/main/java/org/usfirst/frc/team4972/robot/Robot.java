/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;


import org.usfirst.frc.team4972.robot.subsystems.AsansorSubSystem;
import org.usfirst.frc.team4972.robot.subsystems.DriveTrainSubSystem;
import org.usfirst.frc.team4972.robot.subsystems.PneumaticsSubSystem;
import org.usfirst.frc.team4972.robot.subsystems.UltrasonicSubSystem;
import org.usfirst.frc.team4972.robot.subsystems.ArdunioSubSystem;
import org.usfirst.frc.team4972.robot.subsystems.ArmSubSystem;


public class Robot extends TimedRobot {
	// Subsystem Imports
	public static final DriveTrainSubSystem DriveTrainSub = new DriveTrainSubSystem();
	public static final PneumaticsSubSystem PneumaticSub = new PneumaticsSubSystem();
	public static final AsansorSubSystem AsansorSub = new AsansorSubSystem();
	public static final ArmSubSystem ArmSub = new ArmSubSystem();
	public static final ArdunioSubSystem ArdunioSub = new ArdunioSubSystem();
	public static final UltrasonicSubSystem UltrasonicSub = new UltrasonicSubSystem();
	
	// OI Import
	public static OI oi;
	
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();
	@Override
	public void robotInit() {
		// Define OI
		oi = new OI();
		UsbCamera camera=CameraServer.getInstance().startAutomaticCapture();
		camera.setResolution(320, 240);
		camera.setFPS(20);
	}
	@Override
	public void disabledInit() {

	}
	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
	@Override
	public void autonomousInit() {
		m_autonomousCommand = m_chooser.getSelected();
		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}
	@Override
	public void teleopInit() {
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
			
		}
	}
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
		
	}
	@Override
	public void testPeriodic() {
		
	}
}
