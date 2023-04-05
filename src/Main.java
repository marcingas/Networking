import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI uriu = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            URL url = uriu.toURL();
            System.out.println("URL= " + url);

//            System.out.println("Scheme= " + uriu.getScheme());
//            System.out.println("Scheme-specific part= " + uriu.getSchemeSpecificPart());
//            System.out.println("Authority= " + uriu.getAuthority());
//            System.out.println("User-info= " + uriu.getUserInfo());
//            System.out.println("host= " + uriu.getHost());
//            System.out.println("port= " + uriu.getPort());
//            System.out.println("path= " + uriu.getPath());
//            System.out.println("query= " + uriu.getQuery());
//            System.out.println("fragment= " + uriu.getFragment());
        }catch (URISyntaxException e){
            System.out.println("URI Bad Syntax: " + e.getMessage());
        }catch(MalformedURLException e){
            System.out.println("URL MAlfORMED: " + e.getMessage());
        }

    }
}