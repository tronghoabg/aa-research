package C4;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import io.ktor.utils.io.T;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import ka.AbstractC3256n;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final I4.f f1799a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1800b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f1801c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f1802d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1803e;

    public l(I4.f fVar, int i5) {
        this.f1799a = fVar;
        this.f1800b = i5;
    }

    @Override // C4.e
    public final void a() throws IOException {
        InputStream inputStream = this.f1802d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f1801c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f1801c = null;
    }

    @Override // C4.e
    public final Class b() {
        return InputStream.class;
    }

    public final InputStream c(URL url, int i5, URL url2, Map map) throws IOException {
        if (i5 >= 5) {
            throw new T("Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new T("In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f1801c = (HttpURLConnection) url.openConnection();
        for (Map.Entry entry : map.entrySet()) {
            this.f1801c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.f1801c.setConnectTimeout(this.f1800b);
        this.f1801c.setReadTimeout(this.f1800b);
        this.f1801c.setUseCaches(false);
        this.f1801c.setDoInput(true);
        this.f1801c.setInstanceFollowRedirects(false);
        this.f1801c.connect();
        this.f1802d = this.f1801c.getInputStream();
        if (this.f1803e) {
            return null;
        }
        int responseCode = this.f1801c.getResponseCode();
        int i10 = responseCode / 100;
        if (i10 == 2) {
            HttpURLConnection httpURLConnection = this.f1801c;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f1802d = new Y4.e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f1802d = httpURLConnection.getInputStream();
            }
            return this.f1802d;
        }
        if (i10 != 3) {
            if (responseCode == -1) {
                throw new T(AbstractC3256n.g(responseCode, "Http request failed with status code: "), null);
            }
            throw new T(this.f1801c.getResponseMessage(), null);
        }
        String headerField = this.f1801c.getHeaderField(HttpHeaders.LOCATION);
        if (TextUtils.isEmpty(headerField)) {
            throw new T("Received empty or null redirect url", null);
        }
        URL url3 = new URL(url, headerField);
        a();
        return c(url3, i5 + 1, url, map);
    }

    @Override // C4.e
    public final void cancel() {
        this.f1803e = true;
    }

    @Override // C4.e
    public final int d() {
        return 2;
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, d dVar2) {
        I4.f fVar = this.f1799a;
        int i5 = Y4.i.f16694b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar2.i(c(fVar.d(), 0, null, fVar.f5332b.b()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y4.i.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e7) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e7);
                }
                dVar2.c(e7);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y4.i.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y4.i.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
