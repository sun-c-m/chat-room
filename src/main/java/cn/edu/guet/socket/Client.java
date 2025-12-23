package cn.edu.guet.socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost" +
                "说：",8888);
        //启动线程发送信息
       SendMessageThread sendMessageThread = new SendMessageThread(socket);
       sendMessageThread.start();
       //启动线程收信息
        GetMessageThread getMessageThread=new GetMessageThread(socket);
        getMessageThread.start();
    }
}
