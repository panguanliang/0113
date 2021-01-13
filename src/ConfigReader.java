import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ConfigReader {
    public static String read() throws ClassNotFoundException, DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(Class.forName("ConfigReader").getResourceAsStream("/brank.xml"));
        Element element = (Element) document.selectObject("/animals/animal");
        return element.getStringValue();
    }
}
