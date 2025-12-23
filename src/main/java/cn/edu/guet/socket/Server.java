package cn.edu.guet.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static  void main(String[] args) throws IOException {
        ServerSocket serverSocket= new ServerSocket(8888);
        while(true){
            Socket socket = serverSocket.accept();
            SendMessageThread sendMessageThread = new SendMessageThread(socket);
            sendMessageThread.start();

            GetMessageThread getMessageThread = new GetMessageThread(socket);
            getMessageThread.start();

        }
    }
}
