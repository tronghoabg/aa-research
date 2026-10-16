package h.e;

import h.g.b.x;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f48066a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f48067b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        x.c(methods);
        int length = methods.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i3];
            if (x.n(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                x.e(parameterTypes, "getParameterTypes(...)");
                if (x.n(h.a.c.P(parameterTypes), Throwable.class)) {
                    break;
                }
            }
            i3++;
        }
        f48066a = method2;
        int length2 = methods.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Method method3 = methods[i2];
            if (x.n(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i2++;
        }
        f48067b = method;
    }
}
