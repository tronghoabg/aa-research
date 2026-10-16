package okhttp3.internal.g.a;

import h.g.b.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Method f56267a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f56268b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f56269c;

    public g(Method method, Method method2, Method method3) {
        this.f56267a = method;
        this.f56268b = method2;
        this.f56269c = method3;
    }

    public final boolean a(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj != null) {
            try {
                Method method = this.f56269c;
                x.c(method);
                method.invoke(obj, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final Object b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f("response.body().close()", "closer");
        Method method = this.f56267a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f56268b;
                x.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
