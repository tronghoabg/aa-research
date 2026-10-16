package od;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: od.s1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3723s1 implements InterfaceC3734w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f42089b = Logger.getLogger(C3723s1.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f42090c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f42091d;

    /* renamed from: e, reason: collision with root package name */
    public static final RuntimeException f42092e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object[] f42093f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f42094a;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    static {
        /*
            r0 = 0
            r1 = 1
            java.lang.Class<od.s1> r2 = od.C3723s1.class
            java.lang.String r2 = r2.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            od.C3723s1.f42089b = r2
            r2 = 0
            java.lang.String r3 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "add"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L41
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L41
            r5[r0] = r6     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "sum"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            r3.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()     // Catch: java.lang.Throwable -> L3c
            int r5 = r3.length     // Catch: java.lang.Throwable -> L3c
            r6 = r0
        L2e:
            if (r6 >= r5) goto L3e
            r7 = r3[r6]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r8 = r8.length     // Catch: java.lang.Throwable -> L3c
            if (r8 != 0) goto L3a
            goto L3f
        L3a:
            int r6 = r6 + r1
            goto L2e
        L3c:
            r3 = move-exception
            goto L43
        L3e:
            r7 = r2
        L3f:
            r3 = r2
            goto L4d
        L41:
            r3 = move-exception
            r4 = r2
        L43:
            java.util.logging.Logger r5 = od.C3723s1.f42089b
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            java.lang.String r7 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r5.log(r6, r7, r3)
            r7 = r2
        L4d:
            if (r3 != 0) goto L58
            if (r7 == 0) goto L58
            od.C3723s1.f42090c = r7
            od.C3723s1.f42091d = r4
            od.C3723s1.f42092e = r2
            goto L63
        L58:
            od.C3723s1.f42090c = r2
            od.C3723s1.f42091d = r2
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            od.C3723s1.f42092e = r2
        L63:
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            od.C3723s1.f42093f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od.C3723s1.<clinit>():void");
    }

    public C3723s1() {
        RuntimeException runtimeException = f42092e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f42094a = f42090c.newInstance(new Object[0]);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // od.InterfaceC3734w0
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            f42091d.invoke(this.f42094a, f42093f);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
