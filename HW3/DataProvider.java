package HW3;

import java.io.FileWriter;
import java.io.IOException;

import HW3.Interface.IProvider;
import HW3.model.User;

public class DataProvider implements IProvider{

    @Override
    public void writeData(User data, String path) {

        System.out.println(path);

        try(FileWriter fw = new FileWriter(path, true)) {

            fw.append(data.toString());
            fw.append("\n");

        } catch (IOException e) {

            e.printStackTrace();

        }
        
    }
    
}
