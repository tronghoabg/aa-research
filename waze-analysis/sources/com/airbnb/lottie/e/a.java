package com.airbnb.lottie.e;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f2294a;

    public a(HttpURLConnection httpURLConnection) {
        this.f2294a = httpURLConnection;
    }

    public final InputStream a() {
        return this.f2294a.getInputStream();
    }

    public final String b() {
        return this.f2294a.getContentType();
    }

    public final String c() throws IOException {
        try {
            if (d()) {
                return null;
            }
            HttpURLConnection httpURLConnection = this.f2294a;
            String strValueOf = String.valueOf(httpURLConnection.getURL());
            int responseCode = httpURLConnection.getResponseCode();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            return "Unable to fetch " + strValueOf + ". Failed with " + responseCode + "\n" + sb.toString();
        } catch (IOException e2) {
            com.airbnb.lottie.g.c.b("get error failed ", e2);
            return e2.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2294a.disconnect();
    }

    public final boolean d() {
        return this.f2294a.getResponseCode() / 100 == 2;
    }
}
