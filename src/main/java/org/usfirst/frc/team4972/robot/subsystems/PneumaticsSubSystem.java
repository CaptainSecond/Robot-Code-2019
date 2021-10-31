package org.usfirst.frc.team4972.robot.subsystems;

import org.usfirst.frc.team4972.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
/**
 *
 */
public class PneumaticsSubSystem extends Subsystem {

    // Put methods for controlling this subsystem
	// here. Call these from Commands. şuan birşey yok gibi
	// çalışmaması için bir sebep de yok bende öyle diom ama  2. pine taksınlar bi
	DoubleSolenoid FrontSolenoid;
	DoubleSolenoid BackSolenoid;
	DoubleSolenoid HatchSolenoid1;
	DoubleSolenoid HatchSolenoid2;
	Compressor Compressor;
	public PneumaticsSubSystem(){
		Compressor = new Compressor();
		FrontSolenoid = new DoubleSolenoid(RobotMap.RobotFrontSolenoidForward, RobotMap.RobotFrontSolenoidReverse);
		BackSolenoid = new DoubleSolenoid(RobotMap.RobotBackSolenoidForward, RobotMap.RobotBackSolenoidReverse);
		HatchSolenoid1 = new DoubleSolenoid(RobotMap.RobotHatchSelenoid1Forward, RobotMap.RobotHatchSelenoid1Rewerse);
		HatchSolenoid2=new DoubleSolenoid(RobotMap.RobotHatchSelenoid2Forward,RobotMap.RobotHatchSelenoid2Rewerse);
	}
	public void RobotHach1(Value ForwardOrReverse){
		HatchSolenoid1.set(ForwardOrReverse);
	}
	public void RobotHach2(Value ForwardOrReverse){
		HatchSolenoid2.set(ForwardOrReverse);
	}
	public void RobotFront(Value ForwardOrReverse){
		FrontSolenoid.set(ForwardOrReverse);
	}
	
	public void RobotBack(Value ForwardOrReverse){
		BackSolenoid.set(ForwardOrReverse);
	}

	public void CompressorSet(Boolean deger){
		if(deger){
			Compressor.start();
		}else{
			Compressor.stop();
		}
		
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

