package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class ajux implements defpackage.ajvf {
    static final java.lang.String[] a;
    private final org.apache.commons.logging.Log b = org.apache.commons.logging.LogFactory.getLog(getClass());

    static {
        java.lang.String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        a = strArr;
        java.util.Arrays.sort(strArr);
    }

    public static int a(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static final void d(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, boolean z) throws javax.net.ssl.SSLException {
        java.util.List<java.lang.String> listAsList = null;
        java.lang.String str2 = strArr != null ? strArr[0] : null;
        if (strArr2 != null && strArr2.length > 0) {
            listAsList = java.util.Arrays.asList(strArr2);
        }
        java.lang.String strB = defpackage.ajvg.b(str) ? defpackage.ajva.b(str.toLowerCase(java.util.Locale.ROOT)) : str;
        if (listAsList == null) {
            if (str2 == null) {
                throw new javax.net.ssl.SSLException(defpackage.a.bp(str, "Certificate subject for <", "> doesn't contain a common name and does not have alternative names"));
            }
            if (!f(strB, defpackage.ajvg.b(str2) ? defpackage.ajva.b(str2) : str2, z)) {
                throw new javax.net.ssl.SSLException(defpackage.a.bL(str2, str, "Certificate for <", "> doesn't match common name of the certificate subject: "));
            }
            return;
        }
        for (java.lang.String strB2 : listAsList) {
            if (defpackage.ajvg.b(strB2)) {
                strB2 = defpackage.ajva.b(strB2);
            }
            if (f(strB, strB2, z)) {
                return;
            }
        }
        throw new javax.net.ssl.SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + listAsList.toString());
    }

    private static boolean f(java.lang.String str, java.lang.String str2, boolean z) {
        boolean zEndsWith;
        if (str == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ROOT);
        java.lang.String[] strArrSplit = lowerCase2.split("\\.");
        int length = strArrSplit.length;
        if (length < 3 || !strArrSplit[0].endsWith("*") || (z && length == 3 && strArrSplit[2].length() == 2 && java.util.Arrays.binarySearch(a, strArrSplit[1]) >= 0)) {
            return lowerCase.equals(lowerCase2);
        }
        java.lang.String str3 = strArrSplit[0];
        if (str3.length() > 1) {
            java.lang.String strSubstring = str3.substring(0, str3.length() - 1);
            zEndsWith = lowerCase.startsWith(strSubstring) && lowerCase.substring(strSubstring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
        }
        if (zEndsWith) {
            return !z || a(lowerCase) == a(lowerCase2);
        }
        return false;
    }

    public final void b(java.lang.String str, java.security.cert.X509Certificate x509Certificate) throws javax.net.ssl.SSLException {
        java.util.List<defpackage.ajve> listC = defpackage.ajva.c(x509Certificate);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (defpackage.ajvg.a(str) || defpackage.ajvg.b(str)) {
            for (defpackage.ajve ajveVar : listC) {
                if (ajveVar.b == 7) {
                    arrayList.add(ajveVar.a);
                }
            }
        } else {
            for (defpackage.ajve ajveVar2 : listC) {
                if (ajveVar2.b == 2) {
                    arrayList.add(ajveVar2.a);
                }
            }
        }
        java.lang.String strA = defpackage.ajva.a(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        e(str, strA != null ? new java.lang.String[]{strA} : null, arrayList.isEmpty() ? null : (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    @Override // defpackage.ajvf
    public final void c(java.lang.String str, javax.net.ssl.SSLSocket sSLSocket) throws java.io.IOException {
        javax.net.ssl.SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        b(str, (java.security.cert.X509Certificate) session.getPeerCertificates()[0]);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        try {
            b(str, (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (javax.net.ssl.SSLException e) {
            org.apache.commons.logging.Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug(e.getMessage(), e);
            }
            return false;
        }
    }
}
