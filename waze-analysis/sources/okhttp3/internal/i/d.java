package okhttp3.internal.i;

import h.a.i;
import h.g.b.x;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f56293a = new d();

    public static final List a(X509Certificate x509Certificate) throws CertificateParsingException {
        x.f(x509Certificate, "certificate");
        return i.af(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(java.lang.String r9, java.security.cert.X509Certificate r10) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.i.d.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    private static final List c(X509Certificate x509Certificate, int i2) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return i.h();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && x.n(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return i.h();
        }
    }

    private static final boolean d(String str) {
        long j2;
        int length = str.length();
        int length2 = str.length();
        x.f(str, "<this>");
        if (length2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + length2 + " > " + str.length());
        }
        long j3 = 0;
        int i2 = 0;
        while (i2 < length2) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 128) {
                if (cCharAt < 2048) {
                    j2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j2 = 3;
                } else {
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt <= 56319 && cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                        j3 += 4;
                        i2 += 2;
                    }
                }
                j3 += j2;
                i2 = i3;
            }
            j3++;
            i2 = i3;
        }
        return length == ((int) j3);
    }

    private static final String e(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        x.e(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        x.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        x.f(str, "host");
        x.f(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            x.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return b(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
