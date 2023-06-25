package HW3;

import java.util.Scanner;
import HW3.Interface.IInput;

public class InputData implements IInput{

    @Override
    public String[] inputData() {

        Scanner iScanner = new Scanner(System.in);

        while (true){

            System.out.println("Введите одной строкой через ПРОБЕЛ 'Имя' 'Фамилия' 'Отчество' 'Номер телефона'");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");

            if (arrayData.length == 4) {
                
                if(isParsable(arrayData[3])){

                    return arrayData;

                }

                else 

                {

                    System.out.println("Не удается спарсить телефон");

                }

            }
            
            else if (arrayData.length < 6){

                System.out.println("Вы ввели не все данные, проверьте еще раз.");

            } 
            
            else {

                System.out.println("Вы ввели слишком много, проверьте нет ли лишнего пробела.");

            }

        }

    }

    private boolean isParsable(String input) {
    try {
        Integer.parseInt(input);
        return true;
    } catch (final NumberFormatException e) {
        return false;
    }
}

}
