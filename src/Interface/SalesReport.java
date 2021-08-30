package Interface;

import Classes.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
