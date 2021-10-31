package org.usfirst.frc.team4972.robot.subsystems;



import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArdunioSubSystem extends Subsystem {
//	public static SerialPort arduinoMXP =  new SerialPort(9600 ,SerialPort.Port.kMXP); // USB needs to be changed
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	float deger;
	SerialPort arduinoMXP =  new SerialPort(9600 ,SerialPort.Port.kMXP);

	public ArdunioSubSystem(){
		
	}
	
	public void Flush(){
		arduinoMXP.flush();
	}
	
	public String getArdunioValue(){
		return arduinoMXP.readString().trim();
	}
	public void setValue(String value){
		String val = value.trim();
		if(!val.isEmpty()){
			try{
				deger = Float.parseFloat(val);	
			}catch(NumberFormatException e){
				//not int
			}
		
			
		}
	}
	
	public float getValue(){
		return deger;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

