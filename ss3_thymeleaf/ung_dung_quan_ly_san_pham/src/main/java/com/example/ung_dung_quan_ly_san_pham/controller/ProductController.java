package com.example.ung_dung_quan_ly_san_pham.controller;

import com.example.ung_dung_quan_ly_san_pham.model.Product;
import com.example.ung_dung_quan_ly_san_pham.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String showHome() {
        return "redirect:/product/list";
    }

    @GetMapping("/product/list")
    public String showListProduct(Model model) {
        model.addAttribute("productList", productService.getAllProducts());
        return "list";
    }

    @GetMapping("/product/add")
    public String showFormAddProduct(Model model) {
        model.addAttribute("product", new Product());
        return "add";
    }

    @PostMapping("/product/add")
    public String addProduct(Product product) {
        product.setId(productService.getAllProducts().size() + 1);
        productService.addProduct(product);
        return "redirect:/product/list";
    }

    @GetMapping(".product/edit")
    public String showFormEditProduct(Model model, int id) {
        model.addAttribute("product", productService.getProductById(id));
        return "edit";
    }

    @PostMapping("product/edit")
    public String editProduct(Product product) {
        productService.updateProduct(product);
        return "redirect:/product/list";
    }

    @GetMapping("product/view")
    public String showViewProduct(Model model, @RequestParam int id) {
        model.addAttribute("product", productService.getProductById(id));
        return "view";
    }

    @GetMapping("/product/delete")
    public String showFormDeleteProduct(Model model, @RequestParam int id) {
        model.addAttribute("product", productService.getProductById(id));
        return "delete";
    }

    @PostMapping("product/delete")
    public String deleteProduct(@RequestParam int id) {
        productService.deleteProduct(id);
        return "redirect:/product/list";
    }
}
