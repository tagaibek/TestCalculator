import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String result = new Main().run();
        System.out.println(result);
    }

    private String run() throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] inputStr = sc.nextLine().split(" ");

        if (inputStr.length != 3) {
            throw new Exception("Wrong input");
        }
        String operation = inputStr[1];

        if (!(operation.equals("+") || operation.equals("-" )|| operation.equals("*") || operation.equals("/")))  {
            throw new Exception("There is no operation such : " + operation);
        }

        try {
            return  getResult(inputStr, operation ,new Arabic() );
        }
        catch (NumberFormatException ignored){
        }
        return getResult(inputStr, operation ,new Roman() );
    }

    private String getResult(String[] inputStr, String operation, Number number) throws NumberFormatException{

        int a = number.parse(inputStr[0]);
        int b = number.parse(inputStr[2]);
        switch (operation) {
            case "+":
                return number.convert(a + b);
            case "-":
                return number.convert(a - b);
            case "/":
                return number.convert(a / b);
            default:
                return number.convert(a * b);
        }
    }
}

