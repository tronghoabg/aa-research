package okhttp3.internal.g;

import h.g.b.x;
import h.n.o;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f56286a;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numF = property != null ? o.f(property) : null;
        boolean z = true;
        if (numF == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numF.intValue() < 9) {
            z = false;
        }
        f56286a = z;
    }

    @Override // okhttp3.internal.g.g
    public final String a(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!x.n(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // okhttp3.internal.g.g
    public final void c(SSLSocket sSLSocket, String str, List list) {
        x.f(sSLSocket, "sslSocket");
        x.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) com.waze.ce.x.f(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
