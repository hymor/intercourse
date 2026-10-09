package SaleCase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SaleDataTest {
    private static SaleData saleData;

    @BeforeAll
    public static void setUp() {
        saleData = new SaleData();
    }

    @Test
    public void testDiscountCalculation() {

        List<OrderData> orders = List.of(
                new OrderData(
                        "Industrial",
                        100,
                        LocalDateTime.of(2026, 10, 9, 10, 0)
                )
        );

        Map<String, Double> result = saleData.saleApply(orders, 50, 10.0, 5);

        assertEquals(500.0, result.get("Industrial"), 0.001);
    }

    @Test
    public void testMultipleOrders() {
        List<OrderData> orders = List.of(
                new OrderData(
                        "Industrial",
                        100,
                        LocalDateTime.of(2026, 10, 9, 10, 0)
                ),

                new OrderData(
                        "Industrial",
                        200,
                        LocalDateTime.of(2026, 11, 9, 11, 0)
                )
        );

        Map<String, Double> result = saleData.saleApply(orders, 50, 10.0, 5);

        assertEquals(1600.0, result.get("Industrial"), 0.001);

    }

    @Test
    public void testSaleToZeroOrders() {
        List<OrderData> orders = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            orders.add((new OrderData(
                            "Industrial",
                            100,
                            LocalDateTime.of(2026, 10, 9, 10, 0).plusMinutes(i)
                    ))
            );
        }

        Map<String, Double> result = saleData.saleApply(orders, 50, 10.0, 5);

        assertEquals(9250.0, result.get("Industrial"), 0.001);


    }

}