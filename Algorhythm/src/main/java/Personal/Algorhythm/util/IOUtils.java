package Personal.Algorhythm.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IOUtils {

    public static String getFile(String url) {
        StringBuilder code = new StringBuilder();

        try (FileInputStream input = new FileInputStream(url)) {
            InputStreamReader reader = new InputStreamReader(input, "utf-8");
            BufferedReader in = new BufferedReader(reader);

            int ch;
            while((ch = in.read()) != -1) {
                code.append((char) ch);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return code.toString();
    }
}
