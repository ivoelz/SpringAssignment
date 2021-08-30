package Classes;

import Interface.SalesInput;
import Interface.SalesOutput;
//import Interface.SalesReport;
import Interface.ShippingPolicy;

import java.util.List;

public class SaleConsoleOutput {
    private final SalesInput input;
    private final SalesOutput output;
    //private SalesReport salesReport;
    private final ShippingPolicy shippingPolicy;

    public SaleConsoleOutput(SalesInput input, SalesOutput output, ShippingPolicy shippingPolicy) {
        this.input = input;
        this.output = output;
        this.shippingPolicy = shippingPolicy;
    }

    public void getReport() {
        List<Sale> saleList = input.getSales(shippingPolicy);
        for (Sale sale : saleList) {
            this.output.output(sale.toString());
        }
    }
}
