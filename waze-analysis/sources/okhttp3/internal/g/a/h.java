package okhttp3.internal.g.a;

import h.g.b.x;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private i f56270a;

    /* renamed from: b, reason: collision with root package name */
    private final e f56271b;

    public h(e eVar) {
        x.f(eVar, "socketAdapterFactory");
        this.f56271b = eVar;
    }

    private final synchronized i e(SSLSocket sSLSocket) {
        if (this.f56270a == null && this.f56271b.a(sSLSocket)) {
            x.f(sSLSocket, "sslSocket");
            int i2 = f.f56260a;
            Class<?> cls = sSLSocket.getClass();
            Class<?> superclass = cls;
            while (superclass != null && !x.n(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    Objects.toString(cls);
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
                }
            }
            x.c(superclass);
            this.f56270a = new f(superclass);
        }
        return this.f56270a;
    }

    @Override // okhttp3.internal.g.a.i
    public final String a(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        i iVarE = e(sSLSocket);
        if (iVarE != null) {
            return iVarE.a(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.g.a.i
    public final void b(SSLSocket sSLSocket, String str, List list) {
        x.f(sSLSocket, "sslSocket");
        x.f(list, "protocols");
        i iVarE = e(sSLSocket);
        if (iVarE != null) {
            iVarE.b(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.g.a.i
    public final boolean c() {
        return true;
    }

    @Override // okhttp3.internal.g.a.i
    public final boolean d(SSLSocket sSLSocket) {
        x.f(sSLSocket, "sslSocket");
        return this.f56271b.a(sSLSocket);
    }
}
