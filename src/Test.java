import org.dom4j.DocumentException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, DocumentException {
        String name=ConfigReader.read();
        Animal animal= (Animal) Class.forName(name).newInstance();
        animal.brank();
    }
}
