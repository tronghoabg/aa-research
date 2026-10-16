package t6;

import Va.M6;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import l8.j0;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class s extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public final int f45918e;

    /* renamed from: f, reason: collision with root package name */
    public final int f45919f;

    /* renamed from: g, reason: collision with root package name */
    public final S1.v f45920g;

    /* renamed from: h, reason: collision with root package name */
    public final S1.v f45921h;

    /* renamed from: i, reason: collision with root package name */
    public HttpURLConnection f45922i;

    /* renamed from: j, reason: collision with root package name */
    public InputStream f45923j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f45924l;

    /* renamed from: m, reason: collision with root package name */
    public long f45925m;

    /* renamed from: n, reason: collision with root package name */
    public long f45926n;

    public s(int i5, int i10, S1.v vVar) {
        super(true);
        this.f45918e = i5;
        this.f45919f = i10;
        this.f45920g = vVar;
        this.f45921h = new S1.v(1);
    }

    public static void q(HttpURLConnection httpURLConnection, long j8) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i5;
        if (httpURLConnection == null || (i5 = u6.v.f46721a) < 19 || i5 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j8 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j8 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        try {
            InputStream inputStream = this.f45923j;
            if (inputStream != null) {
                long j8 = this.f45925m;
                long j10 = -1;
                if (j8 != -1) {
                    j10 = j8 - this.f45926n;
                }
                q(this.f45922i, j10);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    int i5 = u6.v.f46721a;
                    throw new x(e7, 2000, 3);
                }
            }
        } finally {
            this.f45923j = null;
            o();
            if (this.k) {
                this.k = false;
                l();
            }
        }
    }

    @Override // t6.AbstractC4138f, t6.InterfaceC4144l
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f45922i;
        if (httpURLConnection == null) {
            return j0.f40119g;
        }
        return new S1.n(1, httpURLConnection.getHeaderFields());
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        HttpURLConnection httpURLConnection = this.f45922i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f45922i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                AbstractC4256a.p("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
            this.f45922i = null;
        }
    }

    public final HttpURLConnection p(URL url, int i5, byte[] bArr, long j8, long j10, boolean z2, boolean z10, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f45918e);
        httpURLConnection.setReadTimeout(this.f45919f);
        HashMap map2 = new HashMap();
        S1.v vVar = this.f45920g;
        if (vVar != null) {
            map2.putAll(vVar.a());
        }
        map2.putAll(this.f45921h.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC4125A.f45807a;
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
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z10);
        httpURLConnection.setDoOutput(bArr != null);
        int i10 = n.f45878h;
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

    public final void r(long j8) throws IOException {
        if (j8 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j8 > 0) {
            int iMin = (int) Math.min(j8, 4096);
            InputStream inputStream = this.f45923j;
            int i5 = u6.v.f46721a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new x(new InterruptedIOException(), 2000, 1);
            }
            if (i10 == -1) {
                throw new x();
            }
            j8 -= i10;
            b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // t6.InterfaceC4141i
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
            long r0 = r6.f45925m     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.f45926n     // Catch: java.io.IOException -> L32
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
            java.io.InputStream r0 = r6.f45923j     // Catch: java.io.IOException -> L32
            int r1 = u6.v.f46721a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.f45926n     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.f45926n = r8     // Catch: java.io.IOException -> L32
            r6.b(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r7 = move-exception
            int r8 = u6.v.f46721a
            r8 = 2
            t6.x r7 = t6.x.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.s.read(byte[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    @Override // t6.InterfaceC4144l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t(t6.n r27) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.s.t(t6.n):long");
    }
}
