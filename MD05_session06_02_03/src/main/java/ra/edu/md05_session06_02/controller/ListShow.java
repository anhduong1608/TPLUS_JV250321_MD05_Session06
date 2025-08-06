package ra.edu.md05_session06_02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.edu.md05_session06_02.model.entity.Product;
import ra.edu.md05_session06_02.service.ProductService;

import java.util.List;

@Controller
@RequestMapping(value = {"/","/ListShow"})
public class ListShow {
    @Autowired
    private ProductService productService;
    @GetMapping

    public String showProducts(Model model,@RequestParam("action")  String action)
     {

        List<Product> products=productService.findAll();

       model.addAttribute("products",products);
       return "show";
    }
    @PostMapping

         public String addProduct(  @RequestParam("product_name") String name,
                                     @RequestParam("product_price") double price,
                                     @RequestParam("product_description") String description,
                                      @RequestParam("product_image") String image) {
            Product product=new Product();
          product.setProductName(name);
          product.setProductPrice(price);
          product.setProductDescription(description);
          product.setImageUrl(image);
            productService.findAll().add(product);
        return "redirect:/ListShow";

    }



}
