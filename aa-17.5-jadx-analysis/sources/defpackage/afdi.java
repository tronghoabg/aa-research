package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class afdi {
    public static final Method a;
    public static final Method b;

    static {
        int length;
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int i = 0;
        int i2 = 0;
        while (true) {
            length = methods.length;
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (affa.f(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (affa.f(woy.cZ(parameterTypes), Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        a = method2;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method3 = methods[i];
            if (affa.f(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        b = method;
    }
}
