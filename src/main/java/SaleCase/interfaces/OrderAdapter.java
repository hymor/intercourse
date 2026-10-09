package SaleCase.interfaces;

import SaleCase.OrderData;

public interface OrderAdapter {
    OrderData parseOrder(String importedLine);
}
