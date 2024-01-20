package com.productService.productService.controllers;


import com.productService.productService.repositories.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/details")
    public Product getProductDetails(@RequestParam("user_id") Long userId,
                                     @RequestParam("product_id") Long productId) {
        RestTemplate restTemplate = new RestTemplate();
        String userServiceUrl = "http://localhost:8081/users/id";
        ResponseEntity<String> response
                = restTemplate.getForEntity(userServiceUrl , String.class);
        System.out.println(response);
        return null;
    }
}
