import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HttpServerTest {

    @Test
    void shouldReturn404FroUnkownRequestTarget() throws IOException {
        HttpServer server = new HttpServer(10001)
    }

    @Test
    void shouldGetSuccessfulResponseCode() throws IOException {
        HttpClient client = new HttpClient("httpbin.org", 80, "/html");
        assertEquals(200, client.getStatusCode());
    }

}
