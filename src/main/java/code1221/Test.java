package code1221;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:/lanqiao/蓝桥视频/2025-12-21/Client.java");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
