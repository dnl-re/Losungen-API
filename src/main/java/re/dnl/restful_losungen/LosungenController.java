package re.dnl.restful_losungen;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LosungenController {

    QueryXMLFile q = new QueryXMLFile("src/main/res/Losungen Free 2016.xml");

    @RequestMapping(value="/losung", method= RequestMethod.GET)
    public Losung get_roman_numeral(@RequestParam(value="date", defaultValue="2016-01-01") String date) {
        return q.getLosung(date);
    }


}
