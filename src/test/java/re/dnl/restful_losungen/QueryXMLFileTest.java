package re.dnl.restful_losungen;

import org.junit.Before;
import org.junit.Test;


public class QueryXMLFileTest {

    QueryXMLFile q;

    @Before
    public void setUp() throws Exception {
        this.q = new QueryXMLFile("src/main/res/Losungen Free 2016.xml");
    }

    @Test
    public void getLosung() throws Exception {
        this.q.getLosung("2016-01-01");
    }

}