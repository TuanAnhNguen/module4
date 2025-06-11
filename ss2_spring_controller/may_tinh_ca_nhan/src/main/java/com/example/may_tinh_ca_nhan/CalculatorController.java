package com.example.may_tinh_ca_nhan;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showForm(){
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operator") String operator,
                            Model model){
        double result = 0;
        String operation = "";
        switch (operator){
            case "cong":
                result = num1 + num2;
                operation = "Cong";
                break;
            case "tru" :
                result = num1 - num2;
                operation = "Tru";
                break;
            case "nhan":
                result = num1 * num2;
                operation = "Nhan";
                break;
            case "chia" :
                if (num2 != 0){
                    result = num1 / num2;
                    operation = "Chia";
                } else {
                    model.addAttribute("error", "Khong the chia cho 0");
                    return "index";
                }
        }

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        model.addAttribute("operation", operation);
        return "index";
    }
}
