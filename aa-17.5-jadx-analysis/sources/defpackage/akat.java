package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.net.ssl.SSLContext;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class akat {
    public akat() throws LogConfigurationException {
        LogFactory.getLog(getClass());
        new HashMap();
    }

    public static String a(akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        String str = (String) akasVar.a("http.protocol.element-charset");
        return str == null ? akaz.b.name() : str;
    }

    public static ajpt b(akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        Object objA = akasVar.a("http.protocol.version");
        return objA == null ? ajpm.c : (ajpt) objA;
    }

    public static int c(akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        return akasVar.c("http.connection.timeout", 0);
    }

    public static int d(akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        return akasVar.c("http.socket.timeout", 0);
    }

    public static SSLContext e() throws NoSuchAlgorithmException, KeyManagementException, ajub {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e) {
            throw new ajub(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new ajub(e2.getMessage(), e2);
        }
    }

    public static boolean f(akas akasVar) {
        ahgm.e(akasVar, "HTTP parameters");
        return akasVar.d("http.protocol.handle-authentication", true);
    }
}
