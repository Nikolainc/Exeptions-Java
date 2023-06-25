package HW3;

import HW3.Interface.IInput;
import HW3.Interface.IProvider;
import HW3.model.User;

public class DataManager {

    private IInput input;
    private IProvider provider;

    public DataManager() {

        this.input = new InputData();
        this.provider = new DataProvider();

    }

    public void parserData() {

        String[] data = null;
        int phone = -1;

        while(phone == -1) {

            try {

                throw new NumberFormatException("Ошибка парсинга данных");
                
            } catch (NumberFormatException e) {

                data = this.input.inputData();
                phone = Integer.parseInt(data[3]);

            }

        }

        User newUser = new User(data[0], data[1], data[2], Integer.parseInt(data[3]));
        System.out.println(newUser);
        String path = newUser.gLastName() + ".txt";
        this.provider.writeData(newUser, path);

    }
    
}
