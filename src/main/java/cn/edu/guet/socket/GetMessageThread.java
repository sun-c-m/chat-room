package cn.edu.guet.socket;

import java.io.*;
import java.net.Socket;

public class GetMessageThread extends Thread {
    Socket socket;
    public GetMessageThread(Socket socket) {
        this.socket=socket;
    }
    public void run(){
        try {
            OutputStream outputStream=socket.getOutputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String ipAddress = socket.getRemoteSocketAddress().toString();
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = null;
        while (true) {
            try {
                if (!((str = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(ipAddress + "说：" + str);
        }
    }
}
