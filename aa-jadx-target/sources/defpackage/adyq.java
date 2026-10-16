package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adyq implements adwc {
    public static final java.lang.RuntimeException a;
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.adyq.class.getName());
    private static final java.lang.reflect.Constructor c;
    private static final java.lang.reflect.Method d;
    private static final java.lang.Object[] e;
    private final java.lang.Object f;

    static {
        java.lang.Throwable th;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Constructor<?> constructor;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", java.lang.Long.TYPE);
            try {
                cls.getMethod("sum", null);
                java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                method = method2;
                b.logp(java.util.logging.Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                method2 = method;
                constructor = null;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            method = null;
        }
        if (th != null || constructor == null) {
            c = null;
            d = null;
            a = new java.lang.RuntimeException(th);
        } else {
            c = constructor;
            d = method2;
            a = null;
        }
        e = new java.lang.Object[]{1L};
    }

    public adyq() {
        java.lang.RuntimeException runtimeException = a;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f = c.newInstance(null);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.InstantiationException e3) {
            throw new java.lang.RuntimeException(e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException(e4);
        }
    }

    public final void a() {
        try {
            d.invoke(this.f, e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
