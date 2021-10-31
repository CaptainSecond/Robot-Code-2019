package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetAsansorCommand extends Command {
    int SetPoint = 0;
    double Speed = 1;
    boolean IsFinished = false;
    

    public SetAsansorCommand(int setPoint) {
       this.SetPoint = setPoint;
    //   System.out.println("Seviye "+SetPoint+" basıldı");
      

    }

    // Called just before this Command runs the first time
    protected void initialize() {
       
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       System.out.println("Seviye="+Robot.AsansorSub.AsansorKonum()+"Setpoint="+SetPoint);
    //    if(Robot.AsansorSub.AsansorKonum()>SetPoint){
       
    //         this.Speed=-0.3;
    //         Robot.AsansorSub.asansorSayac.setReverseDirection(true);
    //     }else{

    //         Robot.AsansorSub.asansorSayac.setReverseDirection(false);
    
    //     } 
         if(Robot.AsansorSub.AsansorKonum()!=SetPoint){
            
              Robot.AsansorSub.SetAsansorSpeed(Speed);        
        

         }else{
                 IsFinished = true;
                 Robot.AsansorSub.AsansorReset();
               
           
         }
       
        //  if(Robot.AsansorSub.getAltSwitchStatus()!=true){
        //     Robot.AsansorSub.SetAsansorSpeed(speed);
        //  }else{
        //      IsFinished = true;
        //  }


       
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return IsFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.AsansorSub.AsansorStop();
      //  Robot.AsansorSub.setPozisyon(this.SetPoint);
      //  Robot.AsansorSub.AsansorReset();
        IsFinished = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Robot.AsansorSub.AsansorStop();
    }
}
