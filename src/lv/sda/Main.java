package lv.sda;

public class Main {

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double answer;

        firstNumber = 22;
        secondNumber = 7;
        String operator = "/";

        System.out.println(doArithmetic(firstNumber, secondNumber, operator));



    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator){
        double answer;
        answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
                answer = firstNumber - secondNumber;
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
                return answer;
            default:
                System.out.println("Enter a valid operator");
                break;

        }

        return answer;
    }
}
