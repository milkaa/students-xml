package milka.milka;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class Xml {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        SaxHandler handler = new SaxHandler();
        saxParser.parse(new FileInputStream("C:\\Users\\github\\students-xml\\students-xml\\xml.xml"), handler);
        Product p = handler.getProduct();
    }
}
