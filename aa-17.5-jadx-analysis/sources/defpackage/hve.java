package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hve implements huv {
    private final hyx a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public hve(hyx hyxVar, int i) {
        this.a = hyxVar;
        this.b = i;
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    private final InputStream g(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new hua("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new hua("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iF = f(this.c);
                int i3 = iF / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new ifn(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new hua("Failed to obtain InputStream", f(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iF == -1) {
                        throw new hua("Http request failed", -1, null);
                    }
                    try {
                        throw new hua(this.c.getResponseMessage(), iF, null);
                    } catch (IOException e2) {
                        throw new hua("Failed to get a response message", iF, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new hua("Received empty or null redirect url", iF, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    c();
                    return g(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new hua("Bad redirect url: ".concat(String.valueOf(headerField)), iF, e3);
                }
            } catch (IOException e4) {
                throw new hua("Failed to connect or obtain data", f(this.c), e4);
            }
        } catch (IOException e5) {
            throw new hua("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.huv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.huv
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.huv
    public final void c() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        int i = ift.a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                hyx hyxVar = this.a;
                if (hyxVar.f == null) {
                    if (TextUtils.isEmpty(hyxVar.e)) {
                        String string = hyxVar.d;
                        if (TextUtils.isEmpty(string)) {
                            URL url = hyxVar.c;
                            a.al(url, "Argument must not be null");
                            string = url.toString();
                        }
                        hyxVar.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
                    }
                    hyxVar.f = new URL(hyxVar.e);
                }
                URL url2 = hyxVar.f;
                hyy hyyVar = hyxVar.b;
                if (((hzb) hyyVar).c == null) {
                    synchronized (hyyVar) {
                        if (((hzb) hyyVar).c == null) {
                            HashMap map = new HashMap();
                            for (Map.Entry entry : ((hzb) hyyVar).b.entrySet()) {
                                List list = (List) entry.getValue();
                                StringBuilder sb = new StringBuilder();
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    String str = ((hza) list.get(i2)).a;
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append(str);
                                        if (i2 != list.size() - 1) {
                                            sb.append(',');
                                        }
                                    }
                                }
                                String string2 = sb.toString();
                                if (!TextUtils.isEmpty(string2)) {
                                    map.put((String) entry.getKey(), string2);
                                }
                            }
                            ((hzb) hyyVar).c = DesugarCollections.unmodifiableMap(map);
                        }
                    }
                }
                huuVar.f(g(url2, 0, null, ((hzb) hyyVar).c));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                huuVar.g(e);
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + ift.a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 2;
    }
}
