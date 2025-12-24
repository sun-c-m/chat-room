package code1223;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:/Users/孙成孟/Videos/2025-04-15-16-33-14.mp4");
        FileOutputStream fos=new FileOutputStream("C:/Users/孙成孟/Videos/2025-04-16-16-33-14.mp4");
        byte[] buffer=new byte[1024*8];//8kb,1024*8默认标准写法，但采用这种方法会有多余，满8k才读一次，不满时有空内容读进去，最后会多余。

        int a=0;
        while((a=fis.read(buffer))!=-1) {
            fos.write(buffer,0,a);//[0,a]是控制最后一次读取的有效字节
        }
        fis.close();
        fos.close();
    }
}
