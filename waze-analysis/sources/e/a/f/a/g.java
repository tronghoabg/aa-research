package e.a.f.a;

import androidx.webkit.ProxyConfig;
import com.google.d.b.an;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final g f47570a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f47571b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private static List a(X509Certificate x509Certificate, int i2) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strK = an.K(str2);
            if (!strK.contains(ProxyConfig.MATCH_ALL_SCHEMES)) {
                return str.equals(strK);
            }
            if (!strK.startsWith("*.") || strK.indexOf(42, 1) != -1 || str.length() < strK.length() || "*.".equals(strK)) {
                return false;
            }
            String strSubstring = strK.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        String strA;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                int i4 = 0;
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i4 += (127 - cCharAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) == cCharAt2) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + i2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i4;
            }
        }
        if (i3 < length) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
        }
        if (i3 == str.length()) {
            try {
                X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
                if (f47571b.matcher(str).matches()) {
                    List listA = a(x509Certificate, 7);
                    int size = listA.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (str.equalsIgnoreCase((String) listA.get(i5))) {
                            return true;
                        }
                    }
                    return false;
                }
                String strK = an.K(str);
                List listA2 = a(x509Certificate, 2);
                int size2 = listA2.size();
                int i6 = 0;
                boolean z = false;
                while (i6 < size2) {
                    if (b(strK, (String) listA2.get(i6))) {
                        return true;
                    }
                    i6++;
                    z = true;
                }
                if (!z && (strA = new d(x509Certificate.getSubjectX500Principal()).a()) != null) {
                    return b(strK, strA);
                }
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
