package controller;

import model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SettingController {
    private static Setting currentSetting = new Setting();

    static {
        currentSetting.setLanguage("English");
        currentSetting.setPageSize(10);
        currentSetting.setSpamFilterEnabled(false);
        currentSetting.setSignature("Peter Paul");
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("setting", currentSetting);
        return "index";
    }

    @PostMapping("/save-settings")
    public String updateSettings(@ModelAttribute("setting") Setting settings, Model model) {
        currentSetting = settings;
        model.addAttribute("setting", currentSetting);
        return "result";
    }
}
