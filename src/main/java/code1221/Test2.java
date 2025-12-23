package code1221;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:/lanqiao/蓝桥视频/2025-12-21/guet.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("a");
        bw.newLine();
        bw.write("b");
        bw.flush();
    }
}
