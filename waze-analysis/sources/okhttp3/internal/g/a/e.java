package okhttp3.internal.g.a;

import h.g.b.x;
import h.n.o;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f56259a = "com.google.android.gms.org.conscrypt";

    e() {
    }

    public final boolean a(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        x.e(name, "getName(...)");
        return o.ah(name, this.f56259a.concat("."));
    }
}
