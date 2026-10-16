package qd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class i extends k {

    /* renamed from: e, reason: collision with root package name */
    public final Method f44233e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f44234f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f44235g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f44236h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f44237i;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.f44233e = method;
        this.f44234f = method2;
        this.f44235g = method3;
        this.f44236h = cls;
        this.f44237i = cls2;
    }

    @Override // qd.k
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f44235g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e7) {
            k.f44241b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e7);
        }
    }

    @Override // qd.k
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            l lVar = (l) list.get(i5);
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f44250a);
            }
        }
        try {
            this.f44233e.invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.f44236h, this.f44237i}, new j(arrayList)));
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // qd.k
    public final String d(SSLSocket sSLSocket) {
        try {
            j jVar = (j) Proxy.getInvocationHandler(this.f44234f.invoke(null, sSLSocket));
            boolean z2 = jVar.f44239b;
            if (!z2 && jVar.f44240c == null) {
                k.f44241b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z2) {
                return null;
            }
            return jVar.f44240c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // qd.k
    public final int e() {
        return 1;
    }
}
