package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.net.URLEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
final class qnf extends qmf {
    public static final byte[] a = "\n".getBytes();
    private final String c;
    private final ajzn d;

    public qnf(qmh qmhVar) {
        super(qmhVar);
        this.c = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", qmg.a, Build.VERSION.RELEASE, roc.be(Locale.getDefault()), Build.MODEL, Build.ID);
        this.d = new ajzn((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A(java.net.URL r15, byte[] r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.A(java.net.URL, byte[]):int");
    }

    private final URL v() {
        j();
        String strH = qmu.h();
        j();
        try {
            return new URL(strH.concat((String) qmy.n.f()));
        } catch (MalformedURLException e) {
            super.p(6, "Error trying to parse the hardcoded host url", e, null, null);
            return null;
        }
    }

    private final URL w(qna qnaVar) {
        String strConcat;
        if (qnaVar.f) {
            j();
            String strH = qmu.h();
            j();
            strConcat = strH.concat(qmu.i());
        } else {
            j();
            String strJ = qmu.j();
            j();
            strConcat = strJ.concat(qmu.i());
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e) {
            super.p(6, "Error trying to parse the hardcoded host url", e, null, null);
            return null;
        }
    }

    private final URL x(qna qnaVar, String str) {
        String str2;
        if (qnaVar.f) {
            j();
            String strH = qmu.h();
            j();
            str2 = strH + qmu.i() + "?" + str;
        } else {
            j();
            String strJ = qmu.j();
            j();
            str2 = strJ + qmu.i() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            super.p(6, "Error trying to parse the hardcoded host url", e, null, null);
            return null;
        }
    }

    private final void y(HttpURLConnection httpURLConnection) throws Throwable {
        qnf qnfVar;
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                do {
                } while (inputStream.read(new byte[1024]) > 0);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        super.p(6, "Error closing http connection input stream", e, null, null);
                    }
                }
            } catch (Throwable th2) {
                qnfVar = this;
                th = th2;
                if (inputStream == null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e2) {
                    super.p(6, "Error closing http connection input stream", e2, null, null);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            qnfVar = this;
            th = th3;
            inputStream = null;
        }
    }

    private static final void z(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE));
    }

    final String a(qna qnaVar, boolean z) throws NumberFormatException {
        long j;
        spu.aw(qnaVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : qnaVar.a.entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    z(sb, str, (String) entry.getValue());
                }
            }
            long j2 = qnaVar.d;
            z(sb, "ht", String.valueOf(j2));
            q();
            z(sb, "qt", String.valueOf(System.currentTimeMillis() - j2));
            j();
            if (z) {
                try {
                    j = Long.parseLong(qnaVar.a("_s", CloudRecognizerProtocolStrings.DBG_VALUE));
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                z(sb, "z", j != 0 ? String.valueOf(j) : String.valueOf(qnaVar.c));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            super.p(6, "Failed to encode name or value", e, null, null);
            return null;
        }
    }

    @Override // defpackage.qmf
    protected final void b() {
        super.p(2, "Network initialized. User agent", this.c, null, null);
    }

    final HttpURLConnection c(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        j();
        httpURLConnection.setConnectTimeout(((Integer) qmy.w.f()).intValue());
        j();
        httpURLConnection.setReadTimeout(((Integer) qmy.x.f()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.c);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.util.List r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnf.d(java.util.List):java.util.List");
    }

    public final boolean e() {
        NetworkInfo activeNetworkInfo;
        qlk.b();
        s();
        try {
            activeNetworkInfo = ((ConnectivityManager) f().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        super.p(2, "No network connectivity", null, null, null);
        return false;
    }
}
