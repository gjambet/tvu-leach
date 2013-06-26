package net.guillaume.commons.io;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

public final class Wget {

    private Wget() {
    }

    public static String getPage(String url) throws IOException {

        URI uri = null;

        try {
            uri = new URI(url);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }

        HttpGet httpget = new HttpGet(uri);

        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response = httpclient.execute(httpget);
        InputStream content = response.getEntity().getContent();

        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024 * 1024);

        try {
            IOUtils.copy(content, baos);
        } finally {
            content.close();
        }

        return new String(baos.toByteArray());
    }
}