package okhttp3;

import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class as {
    public static final at a(k.j jVar) {
        h.g.b.x.f(jVar, "<this>");
        return new ar(jVar);
    }

    public static final ao b(File file, ae aeVar) {
        h.g.b.x.f(file, "<this>");
        return new am(aeVar, file);
    }

    public static /* synthetic */ ao c(byte[] bArr, ae aeVar, int i2) {
        int length = bArr.length;
        h.g.b.x.f(bArr, "<this>");
        long j2 = length;
        okhttp3.internal.b.D(j2, j2);
        if (1 == (i2 & 1)) {
            aeVar = null;
        }
        return new an(aeVar, length, bArr);
    }

    public static final z f(String... strArr) {
        h.g.b.x.f(strArr, "namesAndValues");
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            String str = strArr2[i3];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i3] = h.n.o.v(str).toString();
        }
        int iD = h.e.b.d(0, strArr2.length - 1, 2);
        if (iD >= 0) {
            while (true) {
                String str2 = strArr2[i2];
                String str3 = strArr2[i2 + 1];
                h(str2);
                i(str3, str2);
                if (i2 == iD) {
                    break;
                }
                i2 += 2;
            }
        }
        return new z(strArr2);
    }

    public static final y g(SSLSession sSLSession) throws IOException {
        List listH;
        h.g.b.x.f(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (h.g.b.x.n(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || h.g.b.x.n(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        m mVarI = m.q.i(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (h.g.b.x.n("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        av avVar = av.f55925a;
        av avVarE = kotlinx.b.d.aa.e(protocol);
        try {
            listH = j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listH = h.a.i.h();
        }
        return new y(avVarE, mVarI, j(sSLSession.getLocalCertificates()), new com.waze.uid.state_impl.email.n(listH, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(String str) {
        String str2 = str;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt >= 127) {
                throw new IllegalArgumentException(okhttp3.internal.b.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && (cCharAt < ' ' || cCharAt >= 127)) {
                throw new IllegalArgumentException(String.valueOf(okhttp3.internal.b.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2)).concat(okhttp3.internal.b.y(str2) ? "" : ": ".concat(String.valueOf(str))));
            }
        }
    }

    private static final List j(Certificate[] certificateArr) {
        return certificateArr != null ? okhttp3.internal.b.o(Arrays.copyOf(certificateArr, certificateArr.length)) : h.a.i.h();
    }
}
