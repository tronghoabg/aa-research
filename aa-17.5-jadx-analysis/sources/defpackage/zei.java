package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class zei implements InvocationHandler {
    public static final /* synthetic */ int b = 0;
    private static final yfy c;
    public final zeh a;

    static {
        yfu yfuVar = new yfu(4);
        for (Method method : zeh.class.getMethods()) {
            if (method.getDeclaringClass().equals(zeh.class)) {
                try {
                    method.setAccessible(true);
                } catch (RuntimeException e) {
                    if (!e.getClass().getName().equals("java.security.AccessControlException")) {
                        throw e;
                    }
                }
                yfuVar.e(method.getName(), method);
            }
        }
        c = yfuVar.d(false);
    }

    public zei(zeh zehVar) {
        this.a = zehVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Method method2 = (Method) c.get(name);
        if (method2 != null) {
            try {
                return method2.invoke(this.a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
        if (name.equals("getAnnotatedBounds") || name.equals("isAnnotationPresent") || name.startsWith("getAnnotation") || name.startsWith("getDeclaredAnnotation")) {
            throw new UnsupportedOperationException("Annotation methods are not supported on synthetic TypeVariables created during type resolution. The semantics of annotations on resolved types with modified bounds are undefined. Use the original TypeVariable for annotation access. See b/147144588.");
        }
        throw new UnsupportedOperationException(name);
    }
}
