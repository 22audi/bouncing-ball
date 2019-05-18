import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Webscrape {
public static void main(String[] args) throws IOException {
    System.out.println("Hello World!");

    Document doc = (Document) Jsoup.connect("https://www.techradar.com/news/mobile-computing/laptops/best-laptops-1304361").get();
    Elements h3Elements = doc.select("h3");

    for (Element element: h3Elements){
        System.out.println(element.text());
        }

        Elements subtitleElements = doc.select("div.subtitle");

        for (Element elements: subtitleElements){
            System.out.println(elements.text());
        }
        for (int i=0; i<subtitleElements.size(); i++){
            System.out.println(h3Elements.get(i).text()+ " - " + subtitleElements.get(i).text());

        }
    }
}
