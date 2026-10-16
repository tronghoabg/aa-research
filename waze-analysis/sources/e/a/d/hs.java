package e.a.d;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hs implements en {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47111a = Logger.getLogger(hs.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Constructor f47112b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f47113c;

    /* renamed from: d, reason: collision with root package name */
    private static final RuntimeException f47114d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f47115e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f47116f;

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    static {
        /*
            java.lang.Class<e.a.d.hs> r0 = e.a.d.hs.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            e.a.d.hs.f47111a = r0
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r0 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "add"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L42
            r5[r1] = r6     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = "sum"
            r0.getMethod(r5, r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()     // Catch: java.lang.Throwable -> L3e
            int r5 = r0.length     // Catch: java.lang.Throwable -> L3e
            r6 = r1
        L2c:
            if (r6 >= r5) goto L3b
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L3e
            int r8 = r8.length     // Catch: java.lang.Throwable -> L3e
            if (r8 != 0) goto L38
            goto L3c
        L38:
            int r6 = r6 + 1
            goto L2c
        L3b:
            r7 = r3
        L3c:
            r9 = r3
            goto L54
        L3e:
            r0 = move-exception
            r9 = r0
            r0 = r4
            goto L45
        L42:
            r0 = move-exception
            r9 = r0
            r0 = r3
        L45:
            java.util.logging.Logger r4 = e.a.d.hs.f47111a
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r7 = "<clinit>"
            java.lang.String r8 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            java.lang.String r6 = "io.grpc.internal.ReflectionLongAdderCounter"
            r4.logp(r5, r6, r7, r8, r9)
            r4 = r0
            r7 = r3
        L54:
            if (r9 != 0) goto L5f
            if (r7 == 0) goto L5f
            e.a.d.hs.f47112b = r7
            e.a.d.hs.f47113c = r4
            e.a.d.hs.f47114d = r3
            goto L6a
        L5f:
            e.a.d.hs.f47112b = r3
            e.a.d.hs.f47113c = r3
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r9)
            e.a.d.hs.f47114d = r0
        L6a:
            r3 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            e.a.d.hs.f47115e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.hs.<clinit>():void");
    }

    hs() {
        RuntimeException runtimeException = f47114d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f47116f = f47112b.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    static boolean b() {
        return f47114d == null;
    }

    @Override // e.a.d.en
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            f47113c.invoke(this.f47116f, f47115e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
