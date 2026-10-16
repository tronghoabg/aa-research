package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.applovin.shadow.okio.Segment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ka.AbstractC3256n;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f20491a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f20492b;

    /* renamed from: c, reason: collision with root package name */
    private String f20493c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20494d;

    /* renamed from: e, reason: collision with root package name */
    private f f20495e;

    /* renamed from: f, reason: collision with root package name */
    private k f20496f;

    public i(String str, String str2, boolean z2) throws IOException {
        this.f20493c = str2;
        this.f20494d = z2;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f20491a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f20492b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f20492b.setDoOutput(true);
        this.f20492b.setDoInput(true);
        this.f20492b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f20492b);
        }
        this.f20492b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z2) {
            this.f20495e = new f(this.f20492b.getOutputStream());
        } else {
            this.f20492b.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
            this.f20496f = new k(this.f20492b.getOutputStream());
        }
    }

    public final void a(String str, String str2) throws IOException {
        b(str, str2);
    }

    public final void b(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder("--");
        AbstractC3256n.p(sb2, this.f20491a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f20493c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f20494d) {
                this.f20496f.write(sb2.toString().getBytes());
            } else {
                this.f20495e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f20494d) {
                this.f20496f.write(bytes);
                this.f20496f.write("\r\n".getBytes());
            } else {
                this.f20495e.write(bytes);
                this.f20495e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws Throwable {
        StringBuilder sb2 = new StringBuilder("--");
        AbstractC3256n.p(sb2, this.f20491a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f20494d) {
            this.f20496f.write(sb2.toString().getBytes());
        } else {
            this.f20495e.write(sb2.toString().getBytes());
        }
        if (this.f20494d) {
            com.apm.insight.l.f.a(this.f20496f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f20495e, fileArr);
        }
        if (this.f20494d) {
            this.f20496f.write("\r\n".getBytes());
        } else {
            this.f20495e.write("\r\n".getBytes());
            this.f20495e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder("--");
        AbstractC3256n.p(sb2, this.f20491a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f20494d) {
            this.f20496f.write(sb2.toString().getBytes());
        } else {
            this.f20495e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i5 = fileInputStream.read(bArr);
            if (i5 == -1) {
                break;
            } else if (this.f20494d) {
                this.f20496f.write(bArr, 0, i5);
            } else {
                this.f20495e.write(bArr, 0, i5);
            }
        }
        fileInputStream.close();
        if (this.f20494d) {
            this.f20496f.write("\r\n".getBytes());
        } else {
            this.f20495e.write("\r\n".getBytes());
            this.f20495e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f20491a + "--\r\n").getBytes();
        if (this.f20494d) {
            this.f20496f.write(bytes);
            this.f20496f.b();
            this.f20496f.a();
        } else {
            this.f20495e.write(bytes);
            this.f20495e.flush();
            this.f20495e.a();
        }
        int responseCode = this.f20492b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f20492b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f20492b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
