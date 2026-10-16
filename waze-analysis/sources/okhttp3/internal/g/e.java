package okhttp3.internal.g;

import h.g.b.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56280a = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Method f56281c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f56282d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f56283e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f56284f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f56285g;

    public e(Method method, Method method2, Method method3, Class cls, Class cls2) {
        x.f(method, "putMethod");
        x.f(method2, "getMethod");
        x.f(method3, "removeMethod");
        x.f(cls, "clientProviderClass");
        x.f(cls2, "serverProviderClass");
        this.f56281c = method;
        this.f56282d = method2;
        this.f56283e = method3;
        this.f56284f = cls;
        this.f56285g = cls2;
    }

    @Override // okhttp3.internal.g.g
    public final String a(SSLSocket sSLSocket) throws IllegalArgumentException {
        x.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f56282d.invoke(null, sSLSocket));
            x.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            d dVar = (d) invocationHandler;
            if (!dVar.b() && dVar.a() == null) {
                g.n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (dVar.b()) {
                return null;
            }
            return dVar.a();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }

    @Override // okhttp3.internal.g.g
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(sSLSocket, "sslSocket");
        x.f(list, "protocols");
        try {
            this.f56281c.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.f56284f, this.f56285g}, new d(com.waze.ce.x.f(list))));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // okhttp3.internal.g.g
    public final void p(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(sSLSocket, "sslSocket");
        try {
            this.f56283e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }
}
