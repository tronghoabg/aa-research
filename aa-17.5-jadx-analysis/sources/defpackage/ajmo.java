package defpackage;

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

/* loaded from: classes2.dex */
public final class ajmo implements HostnameVerifier {
    public static final ajmo a = new ajmo();

    public static final List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return afbe.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && affa.f(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return afbe.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(java.lang.String r8, java.security.cert.X509Certificate r9) throws java.security.cert.CertificateParsingException {
        /*
            boolean r0 = defpackage.ajip.b(r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.String r8 = defpackage.ajip.a(r8)
            r0 = 7
            java.util.List r9 = a(r9, r0)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L18
            return r2
        L18:
            java.util.Iterator r9 = r9.iterator()
        L1c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.ajip.a(r0)
            boolean r0 = defpackage.affa.f(r8, r0)
            if (r0 == 0) goto L1c
            return r1
        L33:
            return r2
        L34:
            java.lang.String r8 = d(r8)
            r0 = 2
            java.util.List r9 = a(r9, r0)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L44
            return r2
        L44:
            java.util.Iterator r9 = r9.iterator()
        L48:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lfa
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r8.length()
            if (r3 != 0) goto L5d
        L5a:
            r0 = r2
            goto Lf7
        L5d:
            java.lang.String r3 = "."
            boolean r4 = defpackage.afyh.g(r8, r3, r2)
            if (r4 != 0) goto L5a
            java.lang.String r4 = ".."
            boolean r5 = defpackage.afyh.e(r8, r4, r2)
            if (r5 == 0) goto L6e
            goto L5a
        L6e:
            if (r0 == 0) goto L5a
            int r5 = r0.length()
            if (r5 != 0) goto L77
            goto L5a
        L77:
            boolean r5 = defpackage.afyh.g(r0, r3, r2)
            if (r5 != 0) goto L5a
            boolean r4 = defpackage.afyh.e(r0, r4, r2)
            if (r4 == 0) goto L84
            goto L5a
        L84:
            boolean r4 = defpackage.afyh.e(r8, r3, r2)
            if (r4 != 0) goto L8f
            java.lang.String r4 = r8.concat(r3)
            goto L90
        L8f:
            r4 = r8
        L90:
            boolean r5 = defpackage.afyh.e(r0, r3, r2)
            if (r5 != 0) goto L9a
            java.lang.String r0 = r0.concat(r3)
        L9a:
            java.lang.String r0 = d(r0)
            java.lang.String r3 = "*"
            boolean r3 = defpackage.afyh.u(r0, r3, r2)
            if (r3 != 0) goto Lab
            boolean r0 = defpackage.affa.f(r4, r0)
            goto Lf7
        Lab:
            java.lang.String r3 = "*."
            boolean r5 = defpackage.afyh.g(r0, r3, r2)
            if (r5 == 0) goto L5a
            r5 = 42
            int r5 = defpackage.afyh.D(r0, r5, r1)
            r6 = -1
            if (r5 == r6) goto Lbd
            goto L5a
        Lbd:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto Lc8
            goto L5a
        Lc8:
            boolean r3 = defpackage.affa.f(r3, r0)
            if (r3 == 0) goto Lcf
            goto L5a
        Lcf:
            java.lang.String r0 = r0.substring(r1)
            r0.getClass()
            boolean r3 = defpackage.afyh.e(r4, r0, r2)
            if (r3 != 0) goto Lde
            goto L5a
        Lde:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto Lf6
            int r3 = r3 + (-1)
            r0 = 4
            r5 = 46
            int r0 = defpackage.afyh.E(r4, r5, r3, r0)
            if (r0 == r6) goto Lf6
            goto L5a
        Lf6:
            r0 = r1
        Lf7:
            if (r0 == 0) goto L48
            return r1
        Lfa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmo.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    private static final boolean c(String str) {
        long j;
        int length = str.length();
        if (length > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
        long j2 = 0;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    char cCharAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (cCharAt <= 56319 && cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
                i = i2;
            }
            j2++;
            i = i2;
        }
        return str.length() == ((int) j2);
    }

    private static final String d(String str) {
        if (!c(str)) {
            return str;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (!c(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            certificate.getClass();
            return b(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
