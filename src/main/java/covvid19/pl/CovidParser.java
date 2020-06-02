package covvid19.pl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidParser {

    public static final String url = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";
    public String getCovidDate() {
        RestTemplate restTemplate = new RestTemplate();
       String value = restTemplate.getForObject(url, String.class);
       return value;
    }

}

