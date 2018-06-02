package coldwarm.spring.helloworld;

import java.util.Map;
import java.util.Properties;

public class HelloWorld {
    private String message;
    private String[] args;
    private Map<Integer,String> map;
    private Properties properties;

    public void printAll(){
       getArgs();
       getMap();
       getMessage();
       getProperties();
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getProperties() {
        for (String key : properties.stringPropertyNames()){
            System.out.println(key + " = " + properties.getProperty(key));
        }
    }

    public void getMap() {
        for (Map.Entry<Integer,String> en :map.entrySet()){
            System.out.println("The key is " + en.getKey() + " and value is " + en.getValue());
        }
    }
    public void getArgs(){
        for (String s : args){
            System.out.println(s);
        }
    }
    public void getMessage(){
        System.out.println("Your Message is " + message);
    }
}
