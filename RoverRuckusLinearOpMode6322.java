package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="6322RoverRuckus", group="LinearOpMode")

public abstract class RoverRuckusLinearOpMode6322 extends LinearOpMode{

    //Mechanum 4 wheel drivetrain
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    
    //Intake
    DcMotor intake;
    
    //Storage;
    ColorSensor determine;
    DcMotor storage;
    
    //Shooter
    DcMotor shooter;
    
    //Hang
    CRServo leftBar;
    CRServo rightBar;
    
    //Hang Grab
    Servo grab;
    
    //Sampling
    Servo drop;
    Servo rotate;
    ColorSensor samplingDetectLeft;
    ColorSensor samplaingDetectRight;
    
    
    public void initialize(){
        
        //hardwareMapping drivetrain
        frontLeft = hardwareMap.dcMotor.get("fl");
        frontRight = hardwareMap.dcMotor.get("fr");
        backLeft = hardwareMap.dcMotor.get("bl");
        backRight = hardwareMap.dcMotor.get("br");
        
        //intake
        intake = hardwareMap.dcMotor.get("it");
        storage = hardwareMap.dcMotor.get("st");
        
        //shooter
        shooter = hardwareMap.dcMotor.get("shoot");
        determine = hardwareMap.colorSensor.get("det");
        
        //hang
        grab = hardwareMap.servo.get("grab");
        rightBar = hardwareMap.crservo.get("rB");
        leftBar = hardwareMap.crservo.get("lB");
        
        //sampling
        drop = hardwareMap.servo.get("drop");
        rotate = hardwareMap.servo.get("rotate");
        
        //reverses
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        
    }
    /* VUMARK LICENSE ID:
    AcS3k13/////AAABmVTXxEsz608ShhSf6asFUWUfehYIenUmE7idP72Qml9nWn/9xp2APDGWxm5fbcQbdQWvD4ynn3VKvNdTXJd1zXBFk2wZthkaLI9gn1egVj3YOoWZnH7w5Q1FlMpz+RTMnMvQaMd3aLNamKSCt8K9L44vWKk0xaCLCLslDVhM4SV8ymlcjSGyQRSnIs7Av+Ifj4oIs4D5OL2qRJASpXg9haHrFaZF83inG1ptaHEjAeMNdmpROuwIIIkpWxr7KuqNk18TarCexZsUjr6eIjvJ5/W+Ixa6sx5eO/uwhiw1a09wNwtTFfflCTFRIqopNjDEd8EbpQlAqxW0/7ZHUiaox+PadKwujQ5MIeqeXdx+/Wdc
    */
    
    