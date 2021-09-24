import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpServer {

    public static   void main(String[]args)throws IOException {

        ServerSocket serverSocket =new ServerSocket(1962);

        Socket clientSocket = serverSocket.accept();


        String html ="<p>Hello World</p>";

        String response = "HTTP/1.1 200 Det gikk greit \r\n" +
                    "Content-Length: "+ html.getBytes().length + "\r\n"+
                    "Content-Type: " + cotentType + "\r\n" +
                    "Connection: close\r\n" +
                    "\r\n" +
                    html;

    }
}
