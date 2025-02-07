package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException (int dividend, int divisor) throws DivisionByZeroException{
        if (divisor == 0){
            throw new DivisionByZeroException("El divisor no puede ser 0");
        }
        return dividend / divisor;

    }

    public static void main(String[] args) {
        try{
            double result = Exercise30.divisionWithCustomException(20, 0);
            System.out.println("Resultado: " + result);
        }catch (DivisionByZeroException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
