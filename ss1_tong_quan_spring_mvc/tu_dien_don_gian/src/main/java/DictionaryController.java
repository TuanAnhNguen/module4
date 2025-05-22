

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    public static final Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello", "Xin chao");
        dictionary.put("Bye", "Tam biet");
        dictionary.put("Book", "Sach");
        dictionary.put("Student", "Hoc sinh");
        dictionary.put("Teacher", "Giao vien");
    }

    @GetMapping("/")
    public String showForm(){
        return "index";
    }

    @PostMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model){
        String result = dictionary.get(word.toLowerCase());
        model.addAttribute("word", word);
        model.addAttribute("result", result);
        return "index";
    }
}
