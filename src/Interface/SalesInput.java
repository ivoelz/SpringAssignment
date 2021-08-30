package Interface;

import Classes.Sale;

import java.util.List;

public interface SalesInput {
    List<Sale> getSales(ShippingPolicy shippingPolicy);
}
