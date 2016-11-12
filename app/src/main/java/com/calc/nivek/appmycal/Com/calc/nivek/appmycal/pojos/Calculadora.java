package com.calc.nivek.appmycal.Com.calc.nivek.appmycal.pojos;

/**
 * Created by Nivek on 11/11/2016.
 */

public class Calculadora {

    float Num,Num2;

    public float getNum() {
        return Num;
    }

    public Calculadora(float num, float num2) {
        Num = num;
        Num2 = num2;
    }

    public float f_suma(){

        return(this.Num+this.Num2);
    }
    public float f_resta(){

        return(this.Num-this.Num2);
    }
    public float f_multiplicacion(){

        return(this.Num*this.Num2);
    }
    public float f_division(){

        return(this.Num/this.Num2);
    }

    public void setNum(float num) {
        Num = num;
    }

    public float getNum2() {
        return Num2;
    }

    public void setNum2(float num2) {
        Num2 = num2;
    }
}
