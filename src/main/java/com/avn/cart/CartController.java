package com.avn.cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CartController {

    List<String> cart = new ArrayList<>();
    @PostMapping("/v1/cart")
    public ResponseEntity<String> addToCart(@RequestBody String data){
        System.out.println(">>>>> add to cart called with "+data);
        cart.add(data);
        return ResponseEntity.ok(data+" added to cart");
    }

    @GetMapping("v1/cart")
    public ResponseEntity<List<String>> viewCart(){
        System.out.println(">>>>> view cart called");
        return ResponseEntity.ok(cart);
    }
}
