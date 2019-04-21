package CS_348_SP_2019.CDExercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    @GetMapping("/")
    public String root(Model model) {
        
        model.addAttribute("result0", new EndsWith0() );
	model.addAttribute("result1", new EndsWith1() );
	model.addAttribute("result2", new EndsWith2() );
	model.addAttribute("result3", new EndsWith3() );
	model.addAttribute("result4", new EndsWith4() );
	model.addAttribute("result5", new EndsWith5() );
	model.addAttribute("result6", new EndsWith6() );
	model.addAttribute("result7", new EndsWith7() );
	model.addAttribute("result8", new EndsWith8() );
	model.addAttribute("result9", new EndsWith9() );
					
        return "root";
    }

}
