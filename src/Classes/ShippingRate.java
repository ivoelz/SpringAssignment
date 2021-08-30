package Classes;

import Interface.ShippingPolicy;

public class ShippingRate implements ShippingPolicy {

//    public double getShippingCost(double shipping) {
//        double cost = 0;
//        return cost;
//    }

    @Override
    public double getShippingCost(Sale sale) {
        return 0;
    }
}
