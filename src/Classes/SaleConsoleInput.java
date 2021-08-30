package Classes;

import Interface.SalesInput;
import Interface.ShippingPolicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleConsoleInput implements SalesInput {
    private static final List<Sale> saleList = new ArrayList<>();

    public List<Sale> getSales(File myObj) throws FileNotFoundException {
        Scanner scanner = new Scanner(myObj);
        while (scanner.hasNextLine()) {
            String saleInfo = scanner.nextLine();
            String[] array = saleInfo.split(",");

            Sale sale = new Sale(array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3]));
            saleList.add(sale);
        }
        return saleList;
    }

    @Override
    public List<Sale> getSales(ShippingPolicy shippingPolicy) {
        return null;
    }
}
