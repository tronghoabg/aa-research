package kotlinx.coroutines.i;

import com.google.android.gms.o.t;
import h.c.a.h;
import h.c.e;
import h.g.b.x;
import h.n.o;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import k.k;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    public static final Object a(t tVar, e eVar) throws Exception {
        if (!tVar.j()) {
            l lVar = new l(h.d(eVar), 1);
            lVar.u();
            tVar.n(a.f52051a, new b(lVar));
            Object objJ = lVar.j();
            if (objJ == h.c.a.a.f48038a) {
                h.d.b.c(eVar);
            }
            return objJ;
        }
        Exception excF = tVar.f();
        if (excF != null) {
            throw excF;
        }
        if (!tVar.i()) {
            return tVar.g();
        }
        throw new CancellationException("Task " + tVar + " was cancelled normally.");
    }

    public static final String e(Certificate certificate) {
        x.f(certificate, "certificate");
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        x.f(x509Certificate, "<this>");
        k kVar = k.f50843a;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        x.e(encoded, "getEncoded(...)");
        x.f(encoded, "<this>");
        x.f(encoded, "<this>");
        int length = encoded.length;
        long j2 = length;
        okhttp3.internal.publicsuffix.a.g(j2, 0L, j2);
        return "sha256/".concat(new k(h.a.c.l(encoded, 0, length)).y().g());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okhttp3.e f(okhttp3.z r25) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.i.c.f(okhttp3.z):okhttp3.e");
    }

    private static final int g(String str, String str2, int i2) {
        int length = str.length();
        while (i2 < length) {
            if (o.O(str2, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return str.length();
    }
}
