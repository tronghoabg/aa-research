package com.waze.stats.storage;

import com.waze.stats.StatsContract$StatContainer;
import com.waze.stats.aa;
import h.ab;
import h.g.b.x;
import h.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40605a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40606b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f40607c;

    public c(StatsDatabase statsDatabase, aa aaVar, com.waze.shared_infra.i.e eVar) {
        x.f(statsDatabase, "appDatabase");
        x.f(aaVar, "statType");
        x.f(eVar, "logger");
        this.f40605a = statsDatabase;
        this.f40606b = aaVar;
        this.f40607c = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    private final void k(int i2) {
        ?? r2 = this.f40607c;
        r2.a("Successfully deleted " + i2 + " stats from storage");
        if (i2 == 0) {
            r2.g("Couldn't delete stats from storage");
        }
    }

    private final Method l(Class cls) throws NoSuchMethodException, SecurityException {
        Object obj;
        Method methodM = m(cls, (String) this.f40606b, (Class[]) this.f40605a);
        if (methodM != null && (obj = this.f40607c) != null) {
            if (!((Class) obj).isAssignableFrom(methodM.getReturnType())) {
                return null;
            }
        }
        return methodM;
    }

    private static Method m(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.stats.storage.b
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.stats.storage.b r0 = (com.waze.stats.storage.b) r0
            int r1 = r0.f40604c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40604c = r1
            goto L18
        L13:
            com.waze.stats.storage.b r0 = new com.waze.stats.storage.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f40602a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40604c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            r0.f40604c = r3
            java.lang.Object r5 = r4.g()
            if (r5 == r1) goto L79
        L3a:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r0 = r4.f40607c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Deleting all events ("
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " total)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.g(r1)
            r0 = r4
            com.waze.stats.storage.c r0 = (com.waze.stats.storage.c) r0     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r4.f40605a     // Catch: java.lang.Throwable -> L6f
            com.waze.stats.storage.StatsDatabase r0 = (com.waze.stats.storage.StatsDatabase) r0     // Catch: java.lang.Throwable -> L6f
            com.waze.stats.storage.a r0 = r0.eventDao()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L73
            java.lang.Object r4 = r4.f40606b     // Catch: java.lang.Throwable -> L6f
            com.waze.stats.aa r4 = (com.waze.stats.aa) r4     // Catch: java.lang.Throwable -> L6f
            r0.f(r4)     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r4 = move-exception
            e.b.c.a(r4)
        L73:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            return r4
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.stats.storage.c.a(h.c.e):java.lang.Object");
    }

    public final void b(StatsContract$StatContainer statsContract$StatContainer) {
        x.f(statsContract$StatContainer, "stat");
        try {
            c cVar = this;
            a aVarEventDao = ((StatsDatabase) this.f40605a).eventDao();
            if (aVarEventDao != null) {
                aVarEventDao.h(statsContract$StatContainer);
            }
        } catch (Throwable th) {
            e.b.c.a(th);
        }
    }

    public final void c(StatsContract$StatContainer statsContract$StatContainer) {
        Object objA;
        x.f(statsContract$StatContainer, "stat");
        try {
            c cVar = this;
            a aVarEventDao = ((StatsDatabase) this.f40605a).eventDao();
            objA = aVarEventDao != null ? Integer.valueOf(aVarEventDao.c(statsContract$StatContainer)) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Integer num = (Integer) (true != (objA instanceof l) ? objA : null);
        k(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final Object d(List list) {
        Object objA;
        this.f40607c.g("Deleting " + list.size() + " events");
        try {
            c cVar = this;
            a aVarEventDao = ((StatsDatabase) this.f40605a).eventDao();
            objA = aVarEventDao != null ? new Integer(aVarEventDao.d(list)) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Integer num = (Integer) (true != (objA instanceof l) ? objA : null);
        k(num != null ? num.intValue() : 0);
        return ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final Object e(long j2) {
        Object objA;
        this.f40607c.a("Checking for events older than " + j2 + " milliseconds");
        try {
            c cVar = this;
            a aVarEventDao = ((StatsDatabase) this.f40605a).eventDao();
            objA = aVarEventDao != null ? new Integer(aVarEventDao.b((aa) this.f40606b, j2)) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Integer num = (Integer) (true != (objA instanceof l) ? objA : null);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue > 0) {
            this.f40607c.b("Found " + iIntValue + " events older than " + j2 + " milliseconds. Deleting them");
            try {
                c cVar2 = this;
                a aVarEventDao2 = ((StatsDatabase) this.f40605a).eventDao();
                if (aVarEventDao2 != null) {
                    aVarEventDao2.g((aa) this.f40606b, j2);
                }
            } catch (Throwable th2) {
                e.b.c.a(th2);
            }
        }
        return new Integer(iIntValue);
    }

    public final Object f(int i2) {
        Object objA;
        try {
            c cVar = this;
            a aVarEventDao = ((StatsDatabase) this.f40605a).eventDao();
            objA = aVarEventDao != null ? aVarEventDao.e(i2, (aa) this.f40606b) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        List list = (List) (true != (objA instanceof l) ? objA : null);
        return list == null ? h.a.i.h() : list;
    }

    public final Object g() {
        Object objA;
        try {
            c cVar = this;
            a aVarEventDao = ((StatsDatabase) this.f40605a).eventDao();
            objA = aVarEventDao != null ? new Integer(aVarEventDao.a((aa) this.f40606b)) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Integer num = (Integer) (true != (objA instanceof l) ? objA : null);
        return new Integer(num != null ? num.intValue() : 0);
    }

    public final Object h(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method methodL = l(obj.getClass());
            if (methodL != null) {
                try {
                    return methodL.invoke(obj, objArr);
                } catch (IllegalAccessException e2) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodL.toString()));
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            }
            Object obj2 = this.f40606b;
            throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + String.valueOf(obj));
        } catch (InvocationTargetException e3) {
            Throwable targetException = e3.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean i(Object obj) {
        return l(obj.getClass()) != null;
    }

    public final void j(Object obj, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodL = l(obj.getClass());
            if (methodL == null) {
                return;
            }
            try {
                methodL.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public c(Class cls, String str, Class... clsArr) {
        this.f40607c = cls;
        this.f40606b = str;
        this.f40605a = clsArr;
    }
}
