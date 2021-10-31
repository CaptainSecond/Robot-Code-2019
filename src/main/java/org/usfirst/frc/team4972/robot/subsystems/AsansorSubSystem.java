package org.usfirst.frc.team4972.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.Counter;
//import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4972.robot.RobotMap;


/**
 *
 */
public class AsansorSubSystem extends Subsystem {
	Victor AsansorLeft;
	DigitalInput altSwitch;
	DigitalInput ustSwitch;
	AnalogInput enduktif;
	int pozisyon;
	AnalogTrigger trigger;
	public Counter asansorSayac;
	
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public AsansorSubSystem(){
		AsansorLeft = new Victor(RobotMap.AsansorLeft);
		AsansorLeft.setInverted(true);
		enduktif=new AnalogInput(RobotMap.AsansorEnduktif);
		trigger=new AnalogTrigger(enduktif);
		trigger.setLimitsRaw(100, 3000);
		trigger.setLimitsVoltage(1,3);		
		
		asansorSayac=new Counter(trigger);
		asansorSayac.setUpDownCounterMode();
		altSwitch = new DigitalInput(RobotMap.AsansorAltSwitch);
	}

	public int AsansorKonum(){
		return asansorSayac.get();
	}
	public void AsansorReset(){
		asansorSayac.reset();
	}

	public void setPozisyon(int pozisyon){
		this.pozisyon = pozisyon;
	}
	public int getPozisyon(){
		return pozisyon;
	}
	public void AsansorYukari(double speed){
		AsansorLeft.set(speed);
		
	}
	
	public void AsansorAsagi(double speed){
		AsansorLeft.set(-speed);
		
	}

	public void SetAsansorSpeed(double speed){
		AsansorLeft.set(speed);
		
	}
	public void AsansorStop() {
		AsansorLeft.set(0);
	
	}
	
	
	
	public boolean getAltSwitchStatus(){
		return altSwitch.get();
	}
	public boolean getUstSwitchStatus(){
		return ustSwitch.get();
	}
	public int getEnduktifStatus(){
		return 1;
	//	return trigger.getIndex();
	}
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());

    }
}

