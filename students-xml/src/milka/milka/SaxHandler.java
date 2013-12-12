package milka.milka;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Stack;


public class SaxHandler extends DefaultHandler {

    private int place;
    private Product product;
    private Book book;
    private Action action;
    private Param param;
    private Handler handler;
    private Classification classification;
    private Application application;
    private Executable executable;
    private Registry registry;
    private Stack<Rubric> rubricStack = new Stack<>();

    public Product getProduct() {
        return product;
    }

    private void switchPlace(String s) {
        switch (s) {
            default:
                place = 0;
                break;
            case "id":
                place = 1;
                break;
            case "title":
                place = 2;
                break;
            case "copyright":
                place = 3;
                break;
            case "author":
                place = 4;
                break;
            case "date":
                place = 5;
                break;
            case "publisher":
                place = 6;
                break;
            case "educationaltype":
                place = 7;
                break;
            case "keyword":
                place = 8;
                break;
            case "duration":
                place = 9;
                break;
            case "class":
                place = 10;
                break;
            case "description":
                place = 11;
                break;
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "product":
                product = new Product();
                break;
            case "action":
                action = new Action();
                action.setName(attributes.getValue("name"));
                action.setHandler(attributes.getValue("handler"));
                break;
            case "application":
                application = new Application();
                break;
            case "object":
                book = new Book();
                break;
            case "classification":
                classification = new Classification();
                break;
            case "executable":
                executable = new Executable();
                executable.setVersion(attributes.getValue("version"));
                break;
            case "registry":
                registry = new Registry();
                registry.setKey(attributes.getValue("key"));
                registry.setValue(attributes.getValue("value"));
                break;
            case "userhandler":
                handler = new Handler();
                handler.setUuid(attributes.getValue("uuid"));
                handler.setName(attributes.getValue("name"));
                break;
            case "handler":
                handler = new Handler();
                handler.setUuid(attributes.getValue("uuid"));
                handler.setName(attributes.getValue("name"));
                break;
            case "param":
                param = new Param();
                param.setName(attributes.getValue("name"));
                param.setValue(attributes.getValue("value"));
                break;
            case "rubric":
                Rubric r = new Rubric();
                r.setId(attributes.getValue("id"));
                r.setName(attributes.getValue("name"));
                rubricStack.push(r);
                break;
            default:
                switchPlace(qName);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "product":
                break;
            case "action":
                book.setAction(action);
                action = null;
                break;
            case "application":
                handler.setApplication(application);
                application = null;
                break;
            case "object":
                product.addBook(book);
                book = null;
                break;
            case "classification":
                product.setClassification(classification);
                classification = null;
                break;
            case "executable":
                application.setExecutable(executable);
                executable = null;
                break;
            case "registry":
                executable.setRegistryKey(registry);
                registry = null;
                break;
            case "userhandler":
                product.setuHandler(handler);
                handler = null;
                break;
            case "handler":
                product.addHandler(handler);
                handler = null;
                break;
            case "param":
                if (action != null) {
                    action.addParam(param);
                } else {
                    application.addParam(param);
                }
                param = null;
                break;
            case "rubric":
                Rubric top = rubricStack.pop();
                if (rubricStack.isEmpty()) {
                    if (book != null) {
                        book.addRubric(top);
                    } else {
                        classification.setRubric(top);
                    }
                } else {
                    rubricStack.peek().addRubric(top);
                }
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String s = new String(ch, start, length);
        switch (place) {
            case 1:
                if (book != null) {
                    book.setId(s);
                } else {
                    product.setId(s);
                }
                break;
            case 2:
                if (book != null) {
                    book.setTitle(s);
                } else {
                    product.setTitle(s);
                }
                break;
            case 3:
                product.addCopyright(s);
                break;
            case 4:
                if (book != null) {
                    book.addAuthors(s);
                } else {
                    product.addAuthor(s);
                }
                break;
            case 5:
                if (book != null) {
                    book.setDate(Integer.parseInt(s));
                } else {
                    product.setDate(Integer.parseInt(s));
                }
                break;
            case 6:
                if (book != null) {
                    book.addPublisher(s);
                } else {
                    product.addPublisher(s);
                }
                break;
            case 7:
                book.setEducationaltype(s);
                break;
            case 8:
                book.addKeyword(s);
                break;
            case 9:
                book.setDuration(Integer.parseInt(s));
                break;
            case 10:
                book.addClasses(Integer.parseInt(s));
                break;
            case 11:
                handler.setDescription(s);
        }
        place = 0;
    }
}
