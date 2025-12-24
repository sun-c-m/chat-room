package code1223.MP3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:/Users/孙成孟/Videos/合成.mp4");
        String files[]={
                "C:/Users/孙成孟/Videos/Alan Walker&Iselin Solheim-Faded.mp3",
                "/C://Users//孙成孟//Videos//Dana Winner-Moonlight Shadow.mp3",
                "/C://Users//孙成孟//Videos//百花香.mp3"
        };
        for(int i=0;i<files.length;i++) {
            FileInputStream fis=new FileInputStream(files[i]);
            byte[] buffer=new byte[1024*8];

            int a=0;
            while((a=fis.read(buffer))!=-1) {
                fos.write(buffer,0,a);
            }
            fis.close();
        }
        fos.close();
    }
}
