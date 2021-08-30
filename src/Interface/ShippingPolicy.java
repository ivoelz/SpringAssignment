package Interface;

import Classes.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
