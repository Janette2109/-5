
public class Calculator {
    public static void main(String[] args) {

            java.util.Scanner sc = new java.util.Scanner(System.in);

            System.out.println("Введите логин:");
            String Login = sc.nextLine();

            System.out.println("Введите пароль");
            String Password = sc.nextLine();

            if (Password.length() < 8 || Password.length() > 15) {
                System.out.println("Введеный пароль должен содержать от 8 до 15 символов");
                do {System.out.println("Введите пароль");
                    Password = sc.nextLine();

                } while (Password.length() < 8 || Password.length() > 15);
                System.out.println("Введенный вами логин:" + Login + " Введенный вами пароль:" + Password);
            }

            else {
                System.out.println("Введенный вами логин:" + Login + " Введенный вами пароль:" + Password);
            }


    }
}



/*public class Calculator {
    public static void main(String[] args) {
        String commandString = "C";
        while (!commandString.equals("S")){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Введите число 1:");
        int number1 = sc.nextInt();

        System.out.println("Введите операцию (+,-,*,/):");
        char operation = sc.next().charAt(0);

        System.out.println("Введите число 2:");
        int number2 = sc.nextInt();

        String OperationString = Character.toString(operation); //Преобразование переменной типа char в тип String
        int Result = 0;
        if (OperationString.equals("*")) { Result = number1 * number2; System.out.println("Результат = " + Result); }
            else if (OperationString.equals("+")) { Result = number1 + number2; System.out.println("Результат = " + Result);}
                else if (OperationString.equals("-")) { Result = number1 - number2; System.out.println("Результат = " + Result);}
                    else if (OperationString.equals("/")) { Result = number1 / number2; System.out.println("Результат = " + Result);}
                        else {System.out.println("ВЫ ввели не верный оператор");}

        System.out.println("Введите следующую операцию (+,-,*,/):");
        char operation1 = sc.next().charAt(0);


        System.out.println("Введите число 3:");
        int number3 = sc.nextInt();

        String Operation1String = Character.toString(operation1); //Преобразование переменной типа char в тип String
        int Result1;
        if (Operation1String.equals("*")) { Result1 = Result * number3; System.out.println("Результат = " + Result1); }
            else if (Operation1String.equals("+")) { Result1 = Result + number3; System.out.println("Результат = " + Result1);}
                else if (Operation1String.equals("-")) { Result1 = Result - number3; System.out.println("Результат = " + Result1);}
                    else if (Operation1String.equals("/")) { Result1 = Result / number3; System.out.println("Результат = " + Result1);}
                        else {System.out.println("ВЫ ввели не верный оператор");}

        commandString="";
        while (!commandString.equals("S") && !commandString.equals("C")){
            System.out.println("Введите C - для сброса предыдущих вычислений, или S - для завершения работы ");
            char command = sc.next().charAt(0);
            commandString = Character.toString(command);
            }
        }
    }
}*/

