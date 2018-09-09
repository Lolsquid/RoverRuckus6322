package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name="Tele6322", group="LinearOpMode")

public abstract class Tele6322 extends RoverRuckusLinearOpMode6322{

        //objects
        int tog1 = 0;
        int tog2 = 0;
        double dett = 0.0;
        int a = 0;
        
        @Override
        public void runOpMode(){
            
            initialize();
        
            float Ly = gamepad1.left_stick_y;
            float Lx = gamepad1.left_stick_x;
            float Rx = gamepad1.right_stick_x;
            
            //make mechanum drive train when mechanical finishes chassis
            //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ^^^^
            frontLeft.setPower(Ly);
            frontRight.setPower(Ly);
            backLeft.setPower(Ly);
            backRight.setPower(Ly);
            
            //toggles
            boolean instor = gamepad1.left_bumper;
            
            if(instor && tog1 == 0){
                
                tog1 = 1;
            }
            else if (!instor && tog1 == 1){
                
                tog1 = 2;
                intake.setPower(1);
                storage.setPower(.5);
                
            }
            else if (instor && tog1 == 2){
                
                tog1 = 3;
                
            }
            else if (!instor && tog1 == 3){
                
                tog1 = 0;
                intake.setPower(0);
                storage.setPower(0);
                
            }
            
            //shooter
            boolean launch = gamepad1.right_bumper;
            
            if(launch && tog2 == 0){
                
                tog2 = 1;
                
            }
            else if(!launch && tog2 == 1){
                
                tog2 = 2;
                shooter.setPower(1 * dett);
                
            }
            else if(launch && tog2 == 2){
                
                tog2 = 3;
                
            }
            else if(!launch && tog2 == 3){
                
                tog2 = 0;
                shooter.setPower(0);
            }
            /*
            fill x in when i know the color values that represent gold block and white ball
            */
        
            /*
            if(determine.red() == x){
                
                dett = 0.5;
                    
            }
            else{
            
                dett = 1;
                    
            }
            if(determine.blue() == x){
                    
                dett = 0.5;
                    
            }
            else{
                    
                dett = 1;
                
            }
            if(determine.green() == x){
                                        
                dett = 0.5;
                    
            }
            else{
                    
                dett = 1;
                
            }
            
            */
            
            
        }
}