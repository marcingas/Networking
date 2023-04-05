import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI relativeUri = new URI("/catalogue/phones?os=android#samsung");
            URI resolvedUri = baseUri.resolve(relativeUri);
            URL url2 = resolvedUri.toURL();
            System.out.println("URL (From resolved) =" + url2);
            URL url = uri.toURL();
            System.out.println("URL= " + url);

//            System.out.println("Scheme= " + uri.getScheme());
//            System.out.println("Scheme-specific part= " + uri.getSchemeSpecificPart());
//            System.out.println("Authority= " + uri.getAuthority());
//            System.out.println("User-info= " + uri.getUserInfo());
//            System.out.println("host= " + uri.getHost());
//            System.out.println("port= " + uri.getPort());
//            System.out.println("path= " + uri.getPath());
//            System.out.println("query= " + uri.getQuery());
//            System.out.println("fragment= " + uri.getFragment());
        }catch (URISyntaxException e){
            System.out.println("URI Bad Syntax: " + e.getMessage());
        }catch(MalformedURLException e){
            System.out.println("URL MAlfORMED: " + e.getMessage());
        }

    }
}