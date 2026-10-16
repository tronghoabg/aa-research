package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.b.t f3480a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3481b;

    /* renamed from: c, reason: collision with root package name */
    private HttpURLConnection f3482c;

    /* renamed from: d, reason: collision with root package name */
    private InputStream f3483d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3484e;

    public n(com.bumptech.glide.load.b.t tVar, int i2) {
        this.f3480a = tVar;
        this.f3481b = i2;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    private final InputStream e(URL url, int i2, URL url2, Map map) throws IOException {
        if (i2 >= 5) {
            throw new com.bumptech.glide.load.c("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new com.bumptech.glide.load.c("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i3 = this.f3481b;
            httpURLConnection.setConnectTimeout(i3);
            httpURLConnection.setReadTimeout(i3);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f3482c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f3483d = this.f3482c.getInputStream();
                if (this.f3484e) {
                    return null;
                }
                int iB = b(this.f3482c);
                int i4 = iB / 100;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (iB == -1) {
                            throw new com.bumptech.glide.load.c("Http request failed", -1);
                        }
                        try {
                            throw new com.bumptech.glide.load.c(this.f3482c.getResponseMessage(), iB);
                        } catch (IOException e2) {
                            throw new com.bumptech.glide.load.c("Failed to get a response message", iB, e2);
                        }
                    }
                    String headerField = this.f3482c.getHeaderField("Location");
                    if (TextUtils.isEmpty(headerField)) {
                        throw new com.bumptech.glide.load.c("Received empty or null redirect url", iB);
                    }
                    try {
                        URL url3 = new URL(url, headerField);
                        d();
                        return e(url3, i2 + 1, url, map);
                    } catch (MalformedURLException e3) {
                        throw new com.bumptech.glide.load.c("Bad redirect url: ".concat(String.valueOf(headerField)), iB, e3);
                    }
                }
                HttpURLConnection httpURLConnection2 = this.f3482c;
                try {
                    if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                        InputStream inputStreamA = com.bumptech.glide.g.e.a(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        this.f3483d = inputStreamA;
                        return inputStreamA;
                    }
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                    }
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    this.f3483d = inputStream;
                    return inputStream;
                } catch (IOException e4) {
                    throw new com.bumptech.glide.load.c("Failed to obtain InputStream", b(httpURLConnection2), e4);
                }
            } catch (IOException e5) {
                throw new com.bumptech.glide.load.c("Failed to connect or obtain data", b(this.f3482c), e5);
            }
        } catch (IOException e6) {
            throw new com.bumptech.glide.load.c("URL.openConnection threw", 0, e6);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
        this.f3484e = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() throws IOException {
        InputStream inputStream = this.f3483d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3482c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3482c = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, d dVar) {
        int i2 = com.bumptech.glide.g.k.f2906a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                com.bumptech.glide.load.b.t tVar = this.f3480a;
                dVar.b(e(tVar.c(), 0, null, tVar.d()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                dVar.e(e2);
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + com.bumptech.glide.g.k.a(jElapsedRealtimeNanos));
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + com.bumptech.glide.g.k.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 2;
    }
}
