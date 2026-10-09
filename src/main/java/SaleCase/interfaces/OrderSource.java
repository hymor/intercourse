package SaleCase.interfaces;
import SaleCase.OrderData;

import java.util.List;

public interface OrderSource {
    List<OrderData> readOrders();
}
