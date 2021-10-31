/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot;

public class RobotMap {
	// Drive Base Motors PWM
	public static int leftMotor = 0; // Şase Sol
	public static int RightMotor = 1; // Şase Sağ
	
	// Elevator Motors PWM
	public static int AsansorLeft = 2; 
	

	// Arm Motors & Encoder 
	public static int ArmMotor = 3; // Kol Haraketi PG71  PWM
	//public static int ArmEncoderChannelA = 2; // PG71 Enkoder Kanal a  DIO
	//public static int ArmEncoderChannelB = 3; // PG71 Enkoder Kanal b  DIO
	public static int ArmIntakeMotor = 4; // Kol Bag Motor sol top alma  PWM
	

	// Elevator sensors and switches
	
	public static int AsansorAltSwitch = 1;  //DIO
	
	public static int ArmAltSwitch = 2;  //DIO
	public static int ArmUstSwitch = 3;  //DIO
	
	// Ultrasonic 
	public static int UltrasonicPin = 0;  //Analog Input
	public static int AsansorEnduktif = 3; //DIO
	
	// Pneumatic Pinomatik kontrol modulunden
	public static int RobotFrontSolenoidForward = 0;  
	public static int RobotFrontSolenoidReverse = 1;
	public static int RobotBackSolenoidForward = 2;
	public static int RobotBackSolenoidReverse = 3;
	public static int RobotHatchSelenoid1Forward=4;
	public static int RobotHatchSelenoid1Rewerse=5;
	public static int RobotHatchSelenoid2Forward=6;
	public static int RobotHatchSelenoid2Rewerse=7;
	

}
