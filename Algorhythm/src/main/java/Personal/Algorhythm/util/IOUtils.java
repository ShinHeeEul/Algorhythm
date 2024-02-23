package Personal.Algorhythm.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.Supplier;
import java.util.*;

public class IOUtils {

    private static final String PATH = "src\\main\\resources\\static\\algorithm\\";
    private static final HashMap<Long, String> map = ((Supplier<HashMap<Long, String>>) () -> {
        File folder = new File(PATH);
        HashMap<Long, String> tmp = new HashMap<>();

        if(folder.exists()) {
            File[] files = folder.listFiles();
            long key = 0;
            for(File file : files) tmp.put(key++, file.getName());
        }

        return tmp;
    }).get();

    public static String getJavaFile(String fileName) {
        String url = PATH + fileName + "\\" + fileName + ".java";
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

    public static String getIdToFileName(long id) {
        return map.getOrDefault(id, null);
    }

    public static HashMap<Long, String> getFileList() {
        return map;
    }

    public static String getMdFileUrl(String fileName) {
        return "../static/algorithm/" + fileName + "/" + fileName + ".md";
    }
}
