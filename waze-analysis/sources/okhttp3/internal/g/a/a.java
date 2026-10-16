package okhttp3.internal.g.a;

import android.net.ssl.SSLSockets;
import h.g.b.x;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a implements i {
    @Override // okhttp3.internal.g.a.i
    public final String a(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || x.n(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.g.a.i
    public final void b(SSLSocket sSLSocket, String str, List list) throws IOException {
        x.f(sSLSocket, "sslSocket");
        x.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            int i2 = okhttp3.internal.g.g.f56288b;
            sSLParameters.setApplicationProtocols((String[]) com.waze.ce.x.f(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }

    @Override // okhttp3.internal.g.a.i
    public final boolean c() {
        return com.waze.ce.x.e();
    }

    @Override // okhttp3.internal.g.a.i
    public final boolean d(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }
}
