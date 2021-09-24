/*package no.kristiania;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.Socket;

public class http {

    public http(String host, int port, String requestTarget) {

    }

    public int getStatusCode() {
        return 0;
    }

    public static void main(String[]args) throws IOException {
        Socket socket= new Socket( "httpbin.org",80);

            socket.getOutputStream().write(
                    ("GET / html HTTP/1.1\r\n" +
                  "Host: httpbin.org\r\n" +
                            "\r\n").getBytes()
            );



    }
}
*/