package Classes;

import Interface.SalesReport;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportSummary implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("Report Summary:");
        System.out.println("Country      Amount     Tax      Shipping");
        for (Sale sale : salesList) {
            System.out.println(sale.getCountry() + "     " + sale.getAmount() + "     " + sale.getTax() + "     " + sale.getShipping());
        }
    }

}
