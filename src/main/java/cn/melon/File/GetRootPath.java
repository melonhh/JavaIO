package cn.melon.File;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GetRootPath {
    public static void main(String[] args) {
        GetRootPath getRootPath = new GetRootPath();

        try {
            getRootPath.getUrl();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void getUrl() throws IOException {
        String path;

        // 第一种：获取类加载的根路径
        path = this.getClass().getResource("/").getPath();
        System.out.println(path);

        path = this.getClass().getResource("").getPath();
        System.out.println(path);

        // 第二种：获取项目路径
        File file = new File("");
        path = file.getCanonicalPath();
        System.out.println(path);

        // 第三种：
        URL url = this.getClass().getResource("");
        System.out.println(url);

        // 第四种：
        path = System.getProperty("user.dir");
        System.out.println(path);

        // 第五种：


    }

}
