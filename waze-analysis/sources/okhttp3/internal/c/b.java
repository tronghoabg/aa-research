package okhttp3.internal.c;

import h.g.b.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f55984a;

    /* renamed from: b, reason: collision with root package name */
    private int f55985b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55987d;

    public b(List list) {
        x.f(list, "connectionSpecs");
        this.f55984a = list;
    }

    public final okhttp3.o a(SSLSocket sSLSocket) throws UnknownServiceException {
        okhttp3.o oVar;
        boolean z;
        x.f(sSLSocket, "sslSocket");
        List list = this.f55984a;
        int i2 = this.f55985b;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                oVar = null;
                break;
            }
            int i3 = i2 + 1;
            oVar = (okhttp3.o) list.get(i2);
            if (oVar.d(sSLSocket)) {
                this.f55985b = i3;
                break;
            }
            i2 = i3;
        }
        if (oVar != null) {
            int i4 = this.f55985b;
            int size2 = list.size();
            while (true) {
                if (i4 >= size2) {
                    z = false;
                    break;
                }
                if (((okhttp3.o) list.get(i4)).d(sSLSocket)) {
                    z = true;
                    break;
                }
                i4++;
            }
            this.f55986c = z;
            oVar.c(sSLSocket, this.f55987d);
            return oVar;
        }
        boolean z2 = this.f55987d;
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        x.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        x.e(string, "toString(...)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z2 + ", modes=" + list + ", supported protocols=" + string);
    }

    public final boolean b(IOException iOException) {
        x.f(iOException, "e");
        this.f55987d = true;
        if (!this.f55986c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
