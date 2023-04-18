import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TestDependencyManagement {
    public static void main(String[] args) {
        File src = new File("");
        File dest = new File("");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
