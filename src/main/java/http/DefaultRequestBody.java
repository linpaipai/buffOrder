package http;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okio.BufferedSink;

import java.io.IOException;
import java.util.List;

public class DefaultRequestBody extends RequestBody {
    public List<String> list;
    @Override
    public MediaType contentType() {
        return MediaType.parse("application/json; charset=utf-8");
    }

    @Override
    public void writeTo(BufferedSink bufferedSink) throws IOException {

    }
}
