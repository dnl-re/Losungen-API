package re.dnl.restful_losungen;
/*
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
*/

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

class QueryXMLFile {

    Document doc;

    protected QueryXMLFile(String inputFileName) {
        try {
            File inputFile = new File(inputFileName);
            SAXReader reader = new SAXReader();
            this.doc = reader.read(inputFile);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    protected Losung getLosung(String date) {

        String datum = date + "T00:00:00";
        Losung returnLosung = new Losung("", "", "", "", "", "", "");

        try {
            List<Node> nodes = this.doc.selectNodes("/FreeXml/Losungen/Datum[.='" + datum + "']");
            for (Node node : nodes) {
                Node parent = node.getParent();
                returnLosung = new Losung(
                        parent.selectSingleNode("Datum").getText(),
                        parent.selectSingleNode("Wtag").getText(),
                        parent.selectSingleNode("Sonntag").getText(),
                        parent.selectSingleNode("Losungstext").getText(),
                        parent.selectSingleNode("Losungsvers").getText(),
                        parent.selectSingleNode("Lehrtext").getText(),
                        parent.selectSingleNode("Lehrtextvers").getText()
                );
                //returnLosung.printLosung();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnLosung;
    }
}
