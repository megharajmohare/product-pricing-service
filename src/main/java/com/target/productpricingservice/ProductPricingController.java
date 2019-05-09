package com.target.productpricingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductPricingController {

    @Autowired
    ProductPricingService productPricingService;

    @GetMapping("/{productId}/price")
    public Price getProductPricing(@PathVariable int productId) {
        return productPricingService.getPricingByProductId(productId);
    }

    @PostMapping("/{productId}/price")
    public void updateProductPricing(@PathVariable int productId, @RequestBody Price price) {
        productPricingService.updatePricingByProductId(productId, price);
    }

}
