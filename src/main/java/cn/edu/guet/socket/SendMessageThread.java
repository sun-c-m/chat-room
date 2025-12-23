package cn.edu.guet.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendMessageThread extends Thread {
    Socket socket;
    public SendMessageThread(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        OutputStream outputStream= null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter printWriter=new PrintWriter(outputStream,true);
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("发送的消息");
            String msg=scanner.nextLine();
            printWriter.println(msg);
            printWriter.flush();
            //printWriter.close();
        }
    }
}
