package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Deprecated
/* loaded from: classes2.dex */
final class ajwg implements InvocationHandler {
    private static final Constructor a;
    private final ajpj b;

    static {
        try {
            a = Proxy.getProxyClass(ajwg.class.getClassLoader(), ajrn.class).getConstructor(InvocationHandler.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    public ajwg(ajpj ajpjVar) {
        this.b = ajpjVar;
    }

    public static ajrn a(ajpj ajpjVar) {
        try {
            return (ajrn) a.newInstance(new ajwg(ajpjVar));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        boolean zEquals = method.getName().equals("close");
        ajpj ajpjVar = this.b;
        if (zEquals) {
            ahkt.a(ajpjVar.a());
            return null;
        }
        try {
            return method.invoke(ajpjVar, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }
}
