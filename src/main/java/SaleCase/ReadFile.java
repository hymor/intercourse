package SaleCase;
import SaleCase.interfaces.OrderAdapter;
import SaleCase.interfaces.OrderSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFile implements OrderSource {

    private File orderDataFile;
    private OrderAdapter orderAdapterData ;

    public ReadFile(File orderDataFile, OrderAdapter orderAdapterData) {
        this.orderDataFile = orderDataFile;
        this.orderAdapterData = orderAdapterData;
    }

    @Override
    public List<OrderData> readOrders() {
    List<OrderData> orders = new ArrayList<>();

    try(Scanner myReader = new Scanner(orderDataFile)) {
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            orders.add(orderAdapterData.parseOrder(data));
        }
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred");
    }

    return orders;

    }
}
