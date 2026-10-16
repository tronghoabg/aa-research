package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;
import org.apache.tika.mime.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class am {

    /* renamed from: a, reason: collision with root package name */
    public static String f32517a;

    /* renamed from: c, reason: collision with root package name */
    private Context f32519c;

    /* renamed from: d, reason: collision with root package name */
    private int f32520d;

    /* renamed from: e, reason: collision with root package name */
    private int f32521e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f32522f;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f32518b = null;

    /* renamed from: g, reason: collision with root package name */
    private int f32523g = -1;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f32524h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f32525i = 10000;

    /* renamed from: j, reason: collision with root package name */
    private int f32526j = 0;
    private int k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f32527l = true;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f32528m = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.f32526j == 0) {
                an.c();
            }
            if (am.this.c() || am.this.f32526j >= am.this.k) {
                return;
            }
            am.b(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f32519c = context;
    }

    public static /* synthetic */ int b(am amVar) {
        int i5 = amVar.f32526j;
        amVar.f32526j = i5 + 1;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[EXC_TOP_SPLITTER, PHI: r0
  0x00db: PHI (r0v3 java.io.InputStream) = (r0v2 java.io.InputStream), (r0v17 java.io.InputStream) binds: [B:44:0x00d8, B:38:0x00cb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            r7 = this;
            java.lang.String r0 = "https://"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r7.f32519c     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = com.pgl.ssdk.an.a(r3)     // Catch: java.lang.Throwable -> Lce
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lce
            if (r4 == 0) goto L1f
            android.content.Context r0 = r7.f32519c     // Catch: java.lang.Throwable -> Lce
            com.pgl.ssdk.an.b(r0)     // Catch: java.lang.Throwable -> Lce
            java.net.HttpURLConnection r0 = r7.f32518b
            if (r0 == 0) goto L1e
            r0.disconnect()
            r7.f32518b = r2
        L1e:
            return r1
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r4.<init>()     // Catch: java.lang.Throwable -> Lce
            r4.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r7.a()     // Catch: java.lang.Throwable -> Lce
            r4.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lce
            boolean r4 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Lce
            if (r4 != 0) goto L44
            java.lang.String r4 = "http://"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> Lce
            if (r4 != 0) goto L44
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> Lce
        L44:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lce
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lce
            boolean r3 = r7.f32527l     // Catch: java.lang.Throwable -> Lce
            if (r3 == 0) goto L56
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Throwable -> Lce
            java.net.URLConnection r0 = r0.openConnection(r3)     // Catch: java.lang.Throwable -> Lce
        L53:
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lce
            goto L5b
        L56:
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lce
            goto L53
        L5b:
            r7.f32518b = r0     // Catch: java.lang.Throwable -> Lce
            int r3 = r7.f32525i     // Catch: java.lang.Throwable -> Lce
            r0.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> Lce
            java.net.HttpURLConnection r0 = r7.f32518b     // Catch: java.lang.Throwable -> Lce
            int r3 = r7.f32525i     // Catch: java.lang.Throwable -> Lce
            r0.setReadTimeout(r3)     // Catch: java.lang.Throwable -> Lce
            int r0 = r7.f32520d     // Catch: java.lang.Throwable -> Lce
            r7.a(r0)     // Catch: java.lang.Throwable -> Lce
            int r0 = r7.f32521e     // Catch: java.lang.Throwable -> Lce
            r7.b(r0)     // Catch: java.lang.Throwable -> Lce
            byte[] r0 = r7.f32522f     // Catch: java.lang.Throwable -> Lce
            r3 = 1
            if (r0 == 0) goto L91
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lce
            if (r0 <= 0) goto L91
            java.net.HttpURLConnection r0 = r7.f32518b     // Catch: java.lang.Throwable -> Lce
            r0.setDoOutput(r3)     // Catch: java.lang.Throwable -> Lce
            java.net.HttpURLConnection r0 = r7.f32518b     // Catch: java.lang.Throwable -> Lce
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.lang.Throwable -> Lce
            byte[] r4 = r7.f32522f     // Catch: java.lang.Throwable -> Lce
            r0.write(r4)     // Catch: java.lang.Throwable -> Lce
            r0.flush()     // Catch: java.lang.Throwable -> Lce
            r0.close()     // Catch: java.lang.Throwable -> Lce
        L91:
            java.net.HttpURLConnection r0 = r7.f32518b     // Catch: java.lang.Throwable -> Lce
            r0.connect()     // Catch: java.lang.Throwable -> Lce
            java.net.HttpURLConnection r0 = r7.f32518b     // Catch: java.lang.Throwable -> Lce
            int r0 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Lce
            r7.f32523g = r0     // Catch: java.lang.Throwable -> Lce
            java.net.HttpURLConnection r0 = r7.f32518b     // Catch: java.lang.Throwable -> Lce
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> Lce
            byte[] r4 = r7.a(r0)     // Catch: java.lang.Throwable -> Lcf
            r7.f32524h = r4     // Catch: java.lang.Throwable -> Lcf
            int r5 = r7.f32523g     // Catch: java.lang.Throwable -> Lcf
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto Lc2
            r7.a(r5, r4)     // Catch: java.lang.Throwable -> Lcf
            java.net.HttpURLConnection r1 = r7.f32518b
            if (r1 == 0) goto Lbc
            r1.disconnect()
            r7.f32518b = r2
        Lbc:
            if (r0 == 0) goto Lc1
            r0.close()     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            return r3
        Lc2:
            java.net.HttpURLConnection r3 = r7.f32518b
            if (r3 == 0) goto Lcb
            r3.disconnect()
            r7.f32518b = r2
        Lcb:
            if (r0 == 0) goto Lde
            goto Ldb
        Lce:
            r0 = r2
        Lcf:
            java.net.HttpURLConnection r3 = r7.f32518b
            if (r3 == 0) goto Ld8
            r3.disconnect()
            r7.f32518b = r2
        Ld8:
            if (r0 != 0) goto Ldb
            goto Lde
        Ldb:
            r0.close()     // Catch: java.lang.Throwable -> Lde
        Lde:
            android.content.Context r0 = r7.f32519c
            com.pgl.ssdk.an.b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.am.c():boolean");
    }

    public abstract String a();

    public abstract void a(int i5, byte[] bArr);

    private void a(int i5) throws ProtocolException {
        this.f32518b.setRequestMethod(i5 != 1 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? i5 != 6 ? "GET" : "TRACE" : "HEAD" : "DELETE" : "PUT" : "POST");
    }

    private void b() throws JSONException {
        Object obj;
        if (this.f32518b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f32517a)) {
                jSONObject.put("ipv6", f32517a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.c())) {
                jSONObject.put("gaid", com.pgl.ssdk.ces.b.c());
            }
            jSONObject.put("region", an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f32518b.addRequestProperty("cypher", String.valueOf(obj));
            this.f32518b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    private void b(int i5) throws JSONException {
        HttpURLConnection httpURLConnection;
        StringBuilder sb2;
        String str;
        String str2 = i5 != 1 ? i5 != 2 ? "" : MimeTypes.OCTET_STREAM : "application/json; charset=utf-8";
        if (!str2.isEmpty()) {
            this.f32518b.addRequestProperty("Content-Type", str2);
        }
        String strB = an.b();
        if (strB != null) {
            this.f32518b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                httpURLConnection = this.f32518b;
                sb2 = new StringBuilder();
                sb2.append(Locale.getDefault().toString());
                sb2.append(",");
                sb2.append(language);
                str = ";q=0.9";
            } else {
                httpURLConnection = this.f32518b;
                sb2 = new StringBuilder();
                sb2.append(Locale.getDefault().toString());
                sb2.append(",");
                sb2.append(language);
                str = ";q=0.9,en-US;q=0.6,en;q=0.4";
            }
            sb2.append(str);
            httpURLConnection.addRequestProperty("Accept-Language", sb2.toString());
        } catch (Throwable unused) {
        }
    }

    public void a(int i5, int i10, byte[] bArr) {
        b(i5, i10, bArr);
        ar.a(this.f32528m);
    }

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f32517a)) {
            f32517a = str;
        }
    }

    private void b(int i5, int i10, byte[] bArr) {
        this.f32520d = i5;
        this.f32521e = i10;
        this.f32522f = bArr;
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SHARE_MINIMUM];
        while (true) {
            int i5 = inputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
            if (i5 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i5);
        }
    }
}
