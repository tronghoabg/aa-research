package S1;

import Va.M6;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import ka.AbstractC3256n;
import l8.j0;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes.dex */
public final class o extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10891e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10892f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10893g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10894h;

    /* renamed from: i, reason: collision with root package name */
    public final v f10895i;

    /* renamed from: j, reason: collision with root package name */
    public final v f10896j;
    public k k;

    /* renamed from: l, reason: collision with root package name */
    public HttpURLConnection f10897l;

    /* renamed from: m, reason: collision with root package name */
    public InputStream f10898m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10899n;

    /* renamed from: o, reason: collision with root package name */
    public int f10900o;

    /* renamed from: p, reason: collision with root package name */
    public long f10901p;

    /* renamed from: q, reason: collision with root package name */
    public long f10902q;

    public o(String str, int i5, int i10, boolean z2, v vVar) {
        super(true);
        this.f10894h = str;
        this.f10892f = i5;
        this.f10893g = i10;
        this.f10891e = z2;
        this.f10895i = vVar;
        this.f10896j = new v(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // S1.h
    public final void close() {
        try {
            InputStream inputStream = this.f10898m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i5 = Q1.x.f9724a;
                    throw new s(e7, 2000, 3);
                }
            }
        } finally {
            this.f10898m = null;
            q();
            if (this.f10899n) {
                this.f10899n = false;
                l();
            }
            this.f10897l = null;
            this.k = null;
        }
    }

    @Override // S1.AbstractC0827c, S1.h
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f10897l;
        return httpURLConnection == null ? j0.f40119g : new n(0, httpURLConnection.getHeaderFields());
    }

    @Override // S1.h
    public final Uri k() {
        HttpURLConnection httpURLConnection = this.f10897l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.k;
        if (kVar != null) {
            return kVar.f10870a;
        }
        return null;
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.f10897l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                Q1.k.l("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
        }
    }

    public final URL r(URL url, String str) throws s {
        if (str == null) {
            throw new s("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new s(R8.v.f("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f10891e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new s("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e7) {
            throw new s(e7, 2001, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f10901p     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.f10902q     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.f10898m     // Catch: java.io.IOException -> L32
            int r1 = Q1.x.f9724a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.f10902q     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.f10902q = r8     // Catch: java.io.IOException -> L32
            r6.b(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = Q1.x.f9724a
            r8 = 2
            S1.s r7 = S1.s.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.read(byte[], int, int):int");
    }

    public final HttpURLConnection s(k kVar) throws IOException {
        HttpURLConnection httpURLConnectionT;
        int i5;
        byte[] bArr;
        URL url = new URL(kVar.f10870a.toString());
        int i10 = 1;
        boolean z2 = (kVar.f10877h & 1) == 1;
        boolean z10 = this.f10891e;
        int i11 = kVar.f10871b;
        byte[] bArr2 = kVar.f10872c;
        long j8 = kVar.f10874e;
        long j10 = kVar.f10875f;
        if (!z10) {
            return t(url, i11, bArr2, j8, j10, z2, true, kVar.f10873d);
        }
        byte[] bArr3 = bArr2;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new s(new NoRouteToHostException(AbstractC3256n.g(i13, "Too many redirects: ")), 2001, 1);
            }
            byte[] bArr4 = bArr3;
            httpURLConnectionT = t(url, i11, bArr4, j8, j10, z2, false, kVar.f10873d);
            int responseCode = httpURLConnectionT.getResponseCode();
            String headerField = httpURLConnectionT.getHeaderField(HttpHeaders.LOCATION);
            if ((i11 == i10 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionT.disconnect();
                url = r(url, headerField);
                i5 = i11;
                bArr = bArr4;
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionT.disconnect();
                url = r(url, headerField);
                bArr = null;
                i5 = 1;
            }
            bArr3 = bArr;
            i11 = i5;
            i12 = i13;
            i10 = 1;
        }
        return httpURLConnectionT;
    }

    public final HttpURLConnection t(URL url, int i5, byte[] bArr, long j8, long j10, boolean z2, boolean z10, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f10892f);
        httpURLConnection.setReadTimeout(this.f10893g);
        HashMap map2 = new HashMap();
        v vVar = this.f10895i;
        if (vVar != null) {
            map2.putAll(vVar.a());
        }
        map2.putAll(this.f10896j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = w.f10912a;
        if (j8 == 0 && j10 == -1) {
            string = null;
        } else {
            StringBuilder sbU = M6.u(j8, "bytes=", "-");
            if (j10 != -1) {
                sbU.append((j8 + j10) - 1);
            }
            string = sbU.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f10894h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        int i10 = k.f10869i;
        if (i5 == 1) {
            str = "GET";
        } else if (i5 == 2) {
            str = "POST";
        } else {
            if (i5 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void u(long j8) throws IOException {
        if (j8 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j8 > 0) {
            int iMin = (int) Math.min(j8, 4096);
            InputStream inputStream = this.f10898m;
            int i5 = Q1.x.f9724a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new s(new InterruptedIOException(), 2000, 1);
            }
            if (i10 == -1) {
                throw new s();
            }
            j8 -= i10;
            b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[Catch: IOException -> 0x0130, TRY_LEAVE, TryCatch #4 {IOException -> 0x0130, blocks: (B:49:0x011d, B:51:0x0125), top: B:108:0x011d }] */
    @Override // S1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(S1.k r28) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.o.y(S1.k):long");
    }
}
