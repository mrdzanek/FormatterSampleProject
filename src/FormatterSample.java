/*
* Excercising reading files and text formatting.
* Answer for excercise from www.samouczekprogramisty.pl
* */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FormatterSample {
    private static String line;

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        try {
            FileReader fr = new FileReader("out/production/FormatterSampleProject/data.csv");
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String[]> content = new ArrayList();
        while ((line = br.readLine()) != null) {
            content.add(line.split(","));
        }

        for (String[] line : content) {
            System.out.format("|%-8s|%-8.2f|%-13s|%n", line[0], Double.valueOf(line[1]), line[2]);
        }

    }
}
