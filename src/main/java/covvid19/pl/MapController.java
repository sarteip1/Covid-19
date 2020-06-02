package covvid19.pl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String getMap(Model model, @RequestParam String x,@RequestParam String y ){
//        model.addAttribute("x",x);
//        model.addAttribute("y",y);
//        return "map";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String getMap(Model model){
        List<Point> points = new ArrayList<>();
        points.add(new Point(51.76,19.48,"Wykryte przypadki: 1"));
        points.add(new Point(50.82,17.14,"Wykryte przypadki: 2"));

        model.addAttribute("points",points);
        return "map";

    }
}
