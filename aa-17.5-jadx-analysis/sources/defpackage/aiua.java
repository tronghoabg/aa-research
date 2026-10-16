package defpackage;

import java.io.IOException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public final class aiua {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(afck afckVar) {
        Object objDE;
        if (afckVar instanceof ajca) {
            return ((ajca) afckVar).toString();
        }
        try {
            objDE = afckVar + "@" + b(afckVar);
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
        if (aezw.a(objDE) != null) {
            objDE = afckVar.getClass().getName() + "@" + b(afckVar);
        }
        return (String) objDE;
    }

    public static final ajhu d(SSLSession sSLSession) throws IOException {
        Object objE;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (affa.f(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || affa.f(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        ajhk ajhkVarA = ajhk.t.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (affa.f("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        ajij ajijVar = ajij.a;
        ajij ajijVarB = ahds.b(protocol);
        try {
            objE = ajis.e(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objE = afbe.a;
        }
        return new ajhu(ajijVarB, ajhkVarA, ajis.e(sSLSession.getLocalCertificates()), new tim(objE, 12));
    }
}
