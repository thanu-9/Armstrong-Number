package org.spartaglobal.tk;

public class ArmstrongNumbers {

    public boolean ArmstrongNumber(int number){
        int value =0;
        int a;
        int temp;
        // n=153;//It is the number to check armstrong
        temp=number;
        while(number>0)
        {
            a=number%10;
            number=number/10;
            value=value+(a*a*a);
        }
        if(temp==value){
            return true;}
        else{
            return false;}

    }
}
