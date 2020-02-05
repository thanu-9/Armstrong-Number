package org.spartaglobal.tk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();

    @Test
    public void checkIfArmstrongNumber153True() {
       Assertions.assertTrue(armstrongNumbers.ArmstrongNumber(153));
        }

    @Test
    public void checkIfArmstrongNumber152NotTrue() {
        Assertions.assertFalse(armstrongNumbers.ArmstrongNumber(152));
    }
    @Test
    public void checkIfArmstrongNumber371True() {
        Assertions.assertTrue(armstrongNumbers.ArmstrongNumber(371));
    }

    @Test
    public void checkIfArmstrongNumber8208True() {
        Assertions.assertTrue(armstrongNumbers.ArmstrongNumber(407));
    }
    @Test
    public void checkIfArmstrongNumber8209NotTrue() {
        Assertions.assertFalse(armstrongNumbers.ArmstrongNumber(8209));
    }
}


