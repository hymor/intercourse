package SaleCase;

import SaleCase.interfaces.OrderAdapter;
import SaleCase.interfaces.SortInterface;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaleCase {
    public static void main(String[] args) {
    //объявляем переменные
        Integer saleAmount = 50;
        Double cementPrice = 10.0;
        Integer discountStep = 5;

        //файлы
        File inputFileTxt = new File("src/main/java/SaleCase/data/discount_day.txt");
        File inputFileHash = new File("src/main/java/SaleCase/data/discount_day_without_ext");
        String saveToFile = "src/main/java/SaleCase/data/discount_output.txt";

        //объекты
        OrderAdapter txtAdapter = new TxtAdapter();
        OrderAdapter hashAdapter = new HashAdapter();
        SaleData saleData = new SaleData();
        WriteFile writeData= new WriteFile();
        ReadFile readerFile = new ReadFile(inputFileHash, hashAdapter);

        //читаем данные
        List<OrderData> orderData = readerFile.readOrders();
        //сортируем
        saleData.orderSort(orderData);
        //вычисляем скидки и стоимость
        Map<String, Double> resultData = saleData.saleApply(
                orderData, saleAmount, cementPrice, discountStep
        );
        //Пишем в файл
        writeData.writeFile(resultData,saveToFile);

    }
}
