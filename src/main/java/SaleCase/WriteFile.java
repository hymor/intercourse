package SaleCase;

import SaleCase.interfaces.WriteInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFile implements WriteInterface {
    public void writeFile(Map<String, Double> data, String saveToFile) {
        try(FileWriter myWriter = new FileWriter(saveToFile)) {
            for (Map.Entry<String, Double> entry : data.entrySet()) {
              String company = entry.getKey();
              Double amount = entry.getValue();
              myWriter.write(company + " - " + amount + "\n");
            }
            System.out.println("Successfull calculation");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
