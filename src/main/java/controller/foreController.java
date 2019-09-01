package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalService;
import service.MsgService;

@Controller
@RequestMapping("")
public class foreController {
    @Autowired
    CalService calService;
    @Autowired
    MsgService msgService;
    @RequestMapping("forehome")
    public String forehome(){
        return "forehome";
    }
    @RequestMapping("forecal")
    public String forecal(@RequestParam("name") String name, Model model){
        name=name.trim();
        int score=calService.score(name);
        String msg=msgService.getmessage(score);
        model.addAttribute("score",score);
        model.addAttribute("name",name);
        model.addAttribute("msg",msg);
        return "forecal";
    }
}
