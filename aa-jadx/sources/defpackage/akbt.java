package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class akbt {
    public akbt() {
        org.apache.commons.logging.LogFactory.getLog(getClass());
        new java.util.HashMap();
    }

    public static java.lang.String a(defpackage.akbs akbsVar) {
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        java.lang.String str = (java.lang.String) akbsVar.a("http.protocol.element-charset");
        return str == null ? defpackage.akbz.b.name() : str;
    }

    public static defpackage.ajqt b(defpackage.akbs akbsVar) {
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        java.lang.Object objA = akbsVar.a("http.protocol.version");
        return objA == null ? defpackage.ajqm.c : (defpackage.ajqt) objA;
    }

    public static int c(defpackage.akbs akbsVar) {
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        return akbsVar.c("http.connection.timeout", 0);
    }

    public static int d(defpackage.akbs akbsVar) {
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        return akbsVar.c("http.socket.timeout", 0);
    }

    public static javax.net.ssl.SSLContext e() throws defpackage.ajvb {
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (java.security.KeyManagementException e) {
            throw new defpackage.ajvb(e.getMessage(), e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new defpackage.ajvb(e2.getMessage(), e2);
        }
    }

    public static boolean f(defpackage.akbs akbsVar) {
        defpackage.aguw.e(akbsVar, "HTTP parameters");
        return akbsVar.d("http.protocol.handle-authentication", true);
    }
}
