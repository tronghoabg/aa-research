package nf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: nf.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3619a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f41176a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC3340k.b(methods);
        int length = methods.length;
        int i5 = 0;
        while (true) {
            method = null;
            if (i5 >= length) {
                break;
            }
            Method method2 = methods[i5];
            if (AbstractC3340k.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC3340k.d(parameterTypes, "getParameterTypes(...)");
                if (AbstractC3340k.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i5++;
        }
        f41176a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !AbstractC3340k.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
