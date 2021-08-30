package Classes;

import Interface.SalesInput;
import Interface.SalesReport;
import Interface.ShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    SalesInput salesInput() {
        return new SaleConsoleInput();
    }

    @Bean
    SalesReport salesReport() {
        return new ReportSummary();
    }

    @Bean
    ShippingPolicy shippingPolicy() {
        return new ShippingRate();
    }
}
