package SaleCase;
import SaleCase.interfaces.OrderAdapter;

import java.time.LocalDateTime;

public class HashAdapter implements OrderAdapter {
    @Override
    public OrderData parseOrder(String importedLine) {
        String[] parts = importedLine.split("#");
        return new OrderData(
                parts[1],
                Integer.parseInt(parts[2]),
                LocalDateTime.parse(parts[0])
        );
    }
}
