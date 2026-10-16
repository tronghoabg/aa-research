package defpackage;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ajtx implements ajuf {
    static final String[] a;
    private final Log b = LogFactory.getLog(getClass());

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        a = strArr;
        Arrays.sort(strArr);
    }

    public static int a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    public static final void d(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        List<String> listAsList = null;
        String str2 = strArr != null ? strArr[0] : null;
        if (strArr2 != null && strArr2.length > 0) {
            listAsList = Arrays.asList(strArr2);
        }
        String strB = ajug.b(str) ? ajua.b(str.toLowerCase(Locale.ROOT)) : str;
        if (listAsList == null) {
            if (str2 == null) {
                throw new SSLException(a.bq(str, "Certificate subject for <", "> doesn't contain a common name and does not have alternative names"));
            }
            if (!f(strB, ajug.b(str2) ? ajua.b(str2) : str2, z)) {
                throw new SSLException(a.bM(str2, str, "Certificate for <", "> doesn't match common name of the certificate subject: "));
            }
            return;
        }
        for (String strB2 : listAsList) {
            if (ajug.b(strB2)) {
                strB2 = ajua.b(strB2);
            }
            if (f(strB, strB2, z)) {
                return;
            }
        }
        throw new SSLException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + listAsList.toString());
    }

    private static boolean f(String str, String str2, boolean z) {
        boolean zEndsWith;
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        String[] strArrSplit = lowerCase2.split("\\.");
        int length = strArrSplit.length;
        if (length < 3 || !strArrSplit[0].endsWith("*") || (z && length == 3 && strArrSplit[2].length() == 2 && Arrays.binarySearch(a, strArrSplit[1]) >= 0)) {
            return lowerCase.equals(lowerCase2);
        }
        String str3 = strArrSplit[0];
        if (str3.length() > 1) {
            String strSubstring = str3.substring(0, str3.length() - 1);
            zEndsWith = lowerCase.startsWith(strSubstring) && lowerCase.substring(strSubstring.length()).endsWith(lowerCase2.substring(str3.length()));
        } else {
            zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
        }
        if (zEndsWith) {
            return !z || a(lowerCase) == a(lowerCase2);
        }
        return false;
    }

    public final void b(String str, X509Certificate x509Certificate) throws SSLException, CertificateParsingException {
        List<ajue> listC = ajua.c(x509Certificate);
        ArrayList arrayList = new ArrayList();
        if (ajug.a(str) || ajug.b(str)) {
            for (ajue ajueVar : listC) {
                if (ajueVar.b == 7) {
                    arrayList.add(ajueVar.a);
                }
            }
        } else {
            for (ajue ajueVar2 : listC) {
                if (ajueVar2.b == 2) {
                    arrayList.add(ajueVar2.a);
                }
            }
        }
        String strA = ajua.a(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        e(str, strA != null ? new String[]{strA} : null, arrayList.isEmpty() ? null : (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // defpackage.ajuf
    public final void c(String str, SSLSocket sSLSocket) throws CertificateParsingException, IOException {
        SSLSession session = sSLSocket.getSession();
        if (session == null) {
            sSLSocket.getInputStream().available();
            session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.startHandshake();
                session = sSLSocket.getSession();
            }
        }
        b(str, (X509Certificate) session.getPeerCertificates()[0]);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        try {
            b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug(e.getMessage(), e);
            }
            return false;
        }
    }
}
