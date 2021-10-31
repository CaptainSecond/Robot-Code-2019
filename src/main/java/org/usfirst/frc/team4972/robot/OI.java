/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

import org.usfirst.frc.team4972.robot.commands.CargoIntakeCommand;
import org.usfirst.frc.team4972.robot.commands.CompressorAcKapaCommand;
import org.usfirst.frc.team4972.robot.commands.OrtalamaCommand;
import org.usfirst.frc.team4972.robot.commands.OrtalamaCommandGroup;
import org.usfirst.frc.team4972.robot.commands.RobotBackPneumaticCommand;
import org.usfirst.frc.team4972.robot.commands.RobotFrontPneumaticCommand;
import org.usfirst.frc.team4972.robot.commands.RobotHatch1PneumaticCommand;
import org.usfirst.frc.team4972.robot.commands.RobotHatch2PneumaticCommand;
import org.usfirst.frc.team4972.robot.commands.RobotPneumaticGroupCommand;
import org.usfirst.frc.team4972.robot.commands.SetArmManuallyCommand;
//import org.usfirst.frc.team4972.robot.commands.SetArmPositionPIDCommand;
//import org.usfirst.frc.team4972.robot.commands.SetArmSetPointCommand;
import org.usfirst.frc.team4972.robot.commands.SetAsansorCommand;
import org.usfirst.frc.team4972.robot.commands.SetAsansorManuallyCommand;
import org.usfirst.frc.team4972.robot.commands.UltrasonicDriveCommand;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
	// Logitech F310
	public Joystick F310 = new Joystick(0);
	// Custom DriverStation
	public Joystick kol = new Joystick(1);
	
	public Joystick Panel1 = new Joystick(4);
	public Joystick Panel2 = new Joystick(5);
	
	
	public OI() {
		// -----------------------START----------------------- //
		// Arm, Cargo Intake, Hatch Panel Buttons and Commands //

		// Start Arm (PID)
		// Button StartSetArmPosition = new JoystickButton(DriverStation, 8);
		// StartSetArmPosition.whenPressed(new SetArmPositionPIDCommand());
		// StartSetArmPosition.close();
		// // Set Arm SetPoint for Take a Cargo (PID)  Kolu top icin indir
		// Button ArmSetPointTakeCargo = new JoystickButton(DriverStation, 10);
		// ArmSetPointTakeCargo.whileHeld(new SetArmSetPointCommand(-80));
		// ArmSetPointTakeCargo.close();
		// // Set Arm SetPoint for Throw a Cargo (PID)  kolu top icin kaldir
		// Button ArmSetPointThrowCargo = new JoystickButton(DriverStation, 12);
		// ArmSetPointThrowCargo.whileHeld(new SetArmSetPointCommand(0));
		// ArmSetPointThrowCargo.close();
		// // Set Arm SetPoint For Take a Hatch Panel (PID)
		// Button ArmSetPointTakePanel = new JoystickButton(DriverStation, 2);
		// ArmSetPointTakePanel.whileHeld(new SetArmSetPointCommand(0));
		// ArmSetPointTakePanel.close();

		// Run Arm Motor Manually kol manual
		Button ArmUp = new JoystickButton(Panel1, 7);
		ArmUp.whileHeld(new SetArmManuallyCommand(1));
		ArmUp.close();
		Button ArmDown = new JoystickButton(Panel1, 5);
		ArmDown.whileHeld(new SetArmManuallyCommand(-1));
		ArmDown.close();


		// Run Intake Motors for Take a Cargo Top Al At
		Button TakeCargo = new JoystickButton(Panel1, 10);
		TakeCargo.whileHeld(new CargoIntakeCommand(1));
		TakeCargo.close();
		// Run Intake Motors for Throw a Cargo
		Button ThrowCargo = new JoystickButton(Panel1, 9);
		ThrowCargo.whileHeld(new CargoIntakeCommand(-1));
		ThrowCargo.close();

		// // Throw Hatch Panel with Solenoids
		// Button ThrowHatchPanel = new JoystickButton(DriverStation, 3);
		// ThrowHatchPanel.whileHeld(new ThrowHatchPanelCommand());
		// ThrowHatchPanel.close();

		// Arm, Cargo Intake, Hatch Panel Buttons and Commands //
		// ------------------------END------------------------ //

		// ------------------------------------------------------------------------ //

		// ------------START------------ //
		// Elevator Buttons and Commands //

		// Run Elevator Motors Manually  Asansor Manuel
		Button ElevatorUp = new JoystickButton(Panel1, 12);
		ElevatorUp.whileHeld(new SetAsansorManuallyCommand(1));
		ElevatorUp.close();
		Button ElevatorDown = new JoystickButton(Panel1,11 );
		ElevatorDown.whileHeld(new SetAsansorManuallyCommand(-1));
		ElevatorDown.close();

		// Set Elevator defined positions   Asansör Sabit konumlar
		Button SetElevator0 = new JoystickButton(Panel2, 9);
		SetElevator0.whenPressed(new SetAsansorCommand(1));
		SetElevator0.close();
		 Button SetElevator2 = new JoystickButton(Panel2, 6);
		 SetElevator2.whenPressed(new SetAsansorCommand(2));
		 SetElevator2.close();
		 Button SetElevator3 = new JoystickButton(Panel2, 8);
		 SetElevator3.whenPressed(new SetAsansorCommand(3));
		 SetElevator3.close();
		// Button SetElevator3 = new JoystickButton(PanelKizak, 9);
		// SetElevator3.whenPressed(new SetAsansorCommand(3));
		// SetElevator3.close();
		// Button SetElevator4 = new JoystickButton(PanelKizak, 8);
		// SetElevator1.whenPressed(new SetAsansorCommand(4));
		// SetElevator4.close();
		// Button SetElevator5 = new JoystickButton(PanelKizak, 4);
		// SetElevator1.whenPressed(new SetAsansorCommand(5));
		// SetElevator5.close();
		

		// Elevator Buttons and Commands //
		// -------------END------------- //


		// ------------------------------------------------------------------------ //
		
		// -------START------ //
		// Climbing Solenoids //
		 Button HatchPinomatikAc=new JoystickButton(Panel2, 2);
		 HatchPinomatikAc.whileHeld(new RobotHatch1PneumaticCommand(Value.kForward));
	//	 HatchPinomatikAc.whileHeld(new RobotHatch2PneumaticCommand(Value.kForward));
		 HatchPinomatikAc.close();

		 Button HatchPinomatikKapa=new JoystickButton(Panel2, 3);
		 HatchPinomatikKapa.whileHeld(new RobotHatch1PneumaticCommand(Value.kReverse));
	//	 HatchPinomatikKapa.whileHeld(new RobotHatch2PneumaticCommand(Value.kReverse));
		 HatchPinomatikKapa.close();

		 Button HatchPinomatikFirlatIleri=new JoystickButton(Panel2, 4);
		 HatchPinomatikFirlatIleri.whileHeld(new RobotHatch2PneumaticCommand(Value.kForward));
	//	 HatchPinomatikFirlatIleri.whileHeld(new RobotHatch1PneumaticCommand(Value.kForward));
		 HatchPinomatikFirlatIleri.close();

		 Button HatchPinomatikFirlatGeri=new JoystickButton(Panel2, 1);
		 HatchPinomatikFirlatGeri.whileHeld(new RobotHatch2PneumaticCommand(Value.kReverse));
	//	 HatchPinomatikFirlatGeri.whileHeld(new RobotHatch1PneumaticCommand(Value.kReverse));
		 HatchPinomatikFirlatGeri.close();



		// Climbing - 1. Move (Outside Panel Up)  Tırmanma
		Button TogetherForward = new JoystickButton(kol, 10);
		TogetherForward.whileHeld(new RobotPneumaticGroupCommand(Value.kForward, Value.kForward));
		TogetherForward.close();

		// Climbing - 1. Move (Outside Panel Up)  Dış çerçeve indir
		Button TogetherReverse = new JoystickButton(kol, 9);
		TogetherReverse.whileHeld(new RobotPneumaticGroupCommand(Value.kReverse, Value.kReverse));
		TogetherReverse.close(); 


		// Climbing - 2. Move (Inside Front Part Up) On kisim kaldir
		Button FrontSolenoidForward = new JoystickButton(kol, 5);
		FrontSolenoidForward.whileHeld(new RobotFrontPneumaticCommand(Value.kReverse));
		FrontSolenoidForward.close();

		// Climbing - 2. Move (Inside Front Part Up) On kisim kaldir     
		Button FrontSolenoidReverse = new JoystickButton(kol, 7);
		FrontSolenoidReverse.whileHeld(new RobotFrontPneumaticCommand(Value.kForward));
		FrontSolenoidReverse.close();

		// Climbing - 3. Move (Inside Back Part Up)
		Button BackSolenoidForward = new JoystickButton(kol, 6);
		BackSolenoidForward.whileHeld(new RobotBackPneumaticCommand(Value.kReverse));
		BackSolenoidForward.close();

		// Climbing - 3. Move (Inside Back Part Up)
		Button BackSolenoidReverse = new JoystickButton(kol, 8);
		BackSolenoidReverse.whileHeld(new RobotBackPneumaticCommand(Value.kForward));
		BackSolenoidReverse.close();

		// Button OffAll = new JoystickButton(F310, 5);
		// OffAll.whileHeld(new RobotPneumaticGroupCommand(Value.kOff, false));
		// OffAll.close();

		// Climbing Solenoids //
		// --------END------- //
		
		// ------------------------------------------------------------------------ //
		
		// -----------------START----------------- //
		// Center With Pixy and Go Closer Commands //

		  Button CenterAndGoCloser = new JoystickButton(F310, 5);	
		  CenterAndGoCloser.whileActive(new OrtalamaCommandGroup());
		  CenterAndGoCloser.close();
		
		  Button yaklas = new JoystickButton(F310, 6);	
		  yaklas.whileActive(new UltrasonicDriveCommand(12));
		  yaklas.close();

		// Center With Pixy and Go Closer Commands //
		// ------------------END------------------ //

		// -----------------START----------------- //
		// Compressor On Off Commands //

		Button CompressorOff = new JoystickButton(F310, 7);	
		CompressorOff.whileHeld(new CompressorAcKapaCommand(false));
		CompressorOff.close();

		Button CompressorOn = new JoystickButton(F310, 8);	
		CompressorOn.whileHeld(new CompressorAcKapaCommand(true));
		CompressorOn.close();

	  // Center With Pixy and Go Closer Commands //
	  // ------------------END------------------ //
	}	
}
