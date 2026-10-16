package e.a.f.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends l {

    /* renamed from: b, reason: collision with root package name */
    private final Method f47579b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f47580c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f47581d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f47582e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f47583f;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f47579b = method;
        this.f47580c = method2;
        this.f47581d = method3;
        this.f47582e = cls;
        this.f47583f = cls2;
    }

    @Override // e.a.f.a.l
    public final String a(SSLSocket sSLSocket) {
        try {
            k kVar = (k) Proxy.getInvocationHandler(this.f47580c.invoke(null, sSLSocket));
            if (!kVar.f47585b && kVar.f47586c == null) {
                f47587a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (kVar.f47585b) {
                return null;
            }
            return kVar.f47586c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // e.a.f.a.l
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) list.get(i2);
            if (mVar != m.HTTP_1_0) {
                arrayList.add(mVar.toString());
            }
        }
        try {
            this.f47579b.invoke(null, sSLSocket, Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{this.f47582e, this.f47583f}, new k(arrayList)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // e.a.f.a.l
    public final int c() {
        return 1;
    }

    @Override // e.a.f.a.l
    public final void d(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f47581d.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            f47587a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e2);
        }
    }
}
