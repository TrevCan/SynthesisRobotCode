/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.util.WPILibVersion;
import frc.robot.commands.DefaultDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private PWMTalonSRX leftRearMotor, leftMiddleMotor, leftFrontMotor,
            rightRearMotor, rightMiddleMotor, rightFrontMotor;

    public DriveTrain() {
        leftRearMotor = new PWMTalonSRX(9);
        leftMiddleMotor = new PWMTalonSRX(1);
        leftFrontMotor = new PWMTalonSRX(5);
        rightRearMotor = new PWMTalonSRX(2);
        rightMiddleMotor = new PWMTalonSRX(3);
        rightFrontMotor = new PWMTalonSRX(4);

        /*
        port 0 does not work
        port 1 seems to work and is the rightRear wheel
        port 2 does not work
        port 3 does not work
        port 4 does not work
        port 5 does not work
        port 6 does not work
        port 7 does not work
        port 8 does not work
        port 9 does not work
         */

    }

    public void drive(double x, double y) {
        double leftSpeed = x - y, rightSpeed = -x - y;
        leftRearMotor.set(leftSpeed);
        //leftMiddleMotor.set(leftSpeed);
        //leftFrontMotor.set(leftSpeed);
        //rightRearMotor.set(rightSpeed);
        //rightMiddleMotor.set(rightSpeed);
        //rightFrontMotor.set(rightSpeed);
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DefaultDrive());
    }
}
