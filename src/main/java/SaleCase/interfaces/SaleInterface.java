package SaleCase.interfaces;

import SaleCase.OrderData;

import java.util.List;
import java.util.Map;

public interface SaleInterface {
    public Map<String, Double> saleApply(List<OrderData> orderData, Integer saleAmount, Double cementPrice, Integer discountStep);
}
