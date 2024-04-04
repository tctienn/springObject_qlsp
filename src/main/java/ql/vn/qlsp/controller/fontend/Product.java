package ql.vn.qlsp.controller.fontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ql.vn.qlsp.entity.ProductEntity;
import ql.vn.qlsp.repository.BrandsRepository;
import ql.vn.qlsp.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("product")
public class Product {

    @Autowired
     private ProductRepository products ;
    @Autowired
    private BrandsRepository brandsRepository;
    @GetMapping("get-product")
    public List<ProductEntity> getProducts(){

        return products.findAll();



    }
}
