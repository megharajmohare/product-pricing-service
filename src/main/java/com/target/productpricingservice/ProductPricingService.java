package com.target.productpricingservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductPricingService {

    private List<Price> prices = new ArrayList<>(Arrays.asList(new Price(13860428, 13.49, "USD"),
            new Price(15117729, 15.67, "USD"),
            new Price(16483589, 12.34, "USD")));

    public Price getPricingByProductId(int productId) {
        Price price = new Price();
        Optional<Price> optionalPrice = prices.stream().filter(p -> p.getProductId() == productId).findFirst();
        if (optionalPrice.isPresent())
            price = optionalPrice.get();
        return price;
    }

    public void updatePricingByProductId(int productId, Price price) {
        Optional<Price> optionalPrice = prices.stream().filter(p -> p.getProductId() == productId).findFirst();
        if (optionalPrice.isPresent()){
            optionalPrice.get().setCurrency_code(price.getCurrency_code());
            optionalPrice.get().setProductId(price.getProductId());
            optionalPrice.get().setValue(price.getValue());
        }
    }
}
