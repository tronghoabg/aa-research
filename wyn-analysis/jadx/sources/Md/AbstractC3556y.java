package md;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* renamed from: md.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3556y {
    public static pd.h c(String str) {
        V v2;
        Logger logger = V.f40601c;
        synchronized (V.class) {
            try {
                if (V.f40602d == null) {
                    List<T> listF = AbstractC3537e.f(T.class, V.b(), T.class.getClassLoader(), new C3542j(7));
                    V.f40602d = new V();
                    for (T t10 : listF) {
                        V.f40601c.fine("Service loader found " + t10);
                        V.f40602d.a(t10);
                    }
                    V.f40602d.d();
                }
                v2 = V.f40602d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v2.c() != null) {
            return new pd.h(str);
        }
        throw new E5.Q("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact", 14);
    }

    public abstract S a();

    public abstract AbstractC3537e b(Dd.c cVar);

    public abstract AbstractC3537e d();

    public abstract ScheduledExecutorService e();

    public abstract String f();

    public abstract n0 g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k(AbstractC3537e abstractC3537e);

    public abstract void l(EnumC3545m enumC3545m, M m10);
}
