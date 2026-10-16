package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
public final class iyi {
    private static final yph b = yph.c("CAR.VALIDATOR");
    public static final ygr a = ygr.p("34df0e7a9f1cf1892e45c056b4973cd81ccf148a4050d11aea4ac5a65f900a42", "0a012131b1bdf9e80ef97d37f3b48362be363a464c8445ecf83627ebe8493a1e");

    public static boolean a(PackageManager packageManager, String str, String str2) {
        try {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            for (Signature signature : signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory()) {
                if (str2.equals(b(signature))) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static String b(Signature signature) {
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
            int i = ysy.a;
            return ysx.a.a(x509Certificate.getEncoded()).toString();
        } catch (CertificateException e) {
            ((ype) ((ype) ((ype) b.h()).p(e)).ai((char) 1631)).u("Missing expected X509 certificate");
            return "";
        }
    }
}
