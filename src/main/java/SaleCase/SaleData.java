package SaleCase;

import SaleCase.interfaces.SaleInterface;
import SaleCase.interfaces.SortInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaleData implements SortInterface, SaleInterface {

    @Override
    public void orderSort(List<OrderData> orderData) {
        orderData.sort(Comparator.comparing(order -> order.getOrderDateTime()));
    }

    @Override
    public Map<String, Double> saleApply(List<OrderData> orderData, Integer saleAmount, Double cementPrice, Integer discountStep) {

        Map<String, Double> companyTotals = new HashMap<>();

        for (int i = 0; i < orderData.size(); i++) {
            int currentDiscount = Math.max(0, saleAmount - i * discountStep);
            String company = orderData.get(i).getCompanyName();
            Integer amount = orderData.get(i).getAmount();
            Double price = amount * cementPrice * (1 - currentDiscount/100.0);
            companyTotals.put(company, companyTotals.getOrDefault(company, 0.0) + price);
        }
        return companyTotals;
    }
}