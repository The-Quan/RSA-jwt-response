package org.example.demorsaopenssl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @GetMapping("/list")
    List<String> productList(){
        List<String> productList = new ArrayList<>();
        productList.add("iphone 15");
        productList.add("iphone 16");
        productList.add("iphone 17");
        return productList;
    }
}
