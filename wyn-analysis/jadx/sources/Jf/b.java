package Jf;

import Cd.U;
import Ef.A;
import Ef.C;
import Ef.N;
import Va.M6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3108h;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final H6.g f6097a = new H6.g("CLOSED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final H6.g f6098b = new H6.g("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final H6.g f6099c = new H6.g("REUSABLE_CLAIMED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final H6.g f6100d = new H6.g("NO_THREAD_ELEMENTS", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final U f6101e = new U(5);

    /* renamed from: f, reason: collision with root package name */
    public static final U f6102f = new U(6);

    /* renamed from: g, reason: collision with root package name */
    public static final U f6103g = new U(7);

    public static final void a(int i5) {
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j8, tf.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (rVar.f6136c >= j8 && !rVar.d()) {
                return rVar;
            }
            Object obj = c.f6104a.get(rVar);
            H6.g gVar = f6097a;
            if (obj == gVar) {
                return gVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.invoke(Long.valueOf(rVar.f6136c + 1), rVar);
                do {
                    atomicReferenceFieldUpdater = c.f6104a;
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.d()) {
                            rVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f6097a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(InterfaceC3108h interfaceC3108h, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f6106a.iterator();
        while (it.hasNext()) {
            try {
                ((C) it.next()).handleException(interfaceC3108h, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Fe.b.d(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            Fe.b.d(th, new e(interfaceC3108h));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f6097a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(InterfaceC3108h interfaceC3108h, Object obj) {
        if (obj == f6100d) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objFold = interfaceC3108h.fold(null, f6102f);
            AbstractC3340k.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((u) objFold).a(obj);
            return;
        }
        x xVar = (x) obj;
        u[] uVarArr = xVar.f6147c;
        int length = uVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            u uVar = uVarArr[length];
            AbstractC3340k.b(uVar);
            uVar.a(xVar.f6146b[length]);
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.Object r9, jf.InterfaceC3103c r10) throws Ef.N {
        /*
            boolean r0 = r10 instanceof Jf.f
            if (r0 == 0) goto Lae
            Jf.f r10 = (Jf.f) r10
            java.lang.Throwable r0 = ef.C2530n.a(r9)
            if (r0 != 0) goto Le
            r1 = r9
            goto L14
        Le:
            Ef.x r1 = new Ef.x
            r2 = 0
            r1.<init>(r2, r0)
        L14:
            Ef.A r0 = r10.f6109d
            lf.c r2 = r10.f6110e
            jf.h r3 = r2.getContext()
            boolean r3 = j(r0, r3)
            r4 = 1
            if (r3 == 0) goto L2f
            r10.f6111f = r1
            r10.f3694c = r4
            jf.h r9 = r2.getContext()
            i(r0, r9, r10)
            return
        L2f:
            Ef.c0 r0 = Ef.J0.a()
            long r5 = r0.f3721b
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            r10.f6111f = r1
            r10.f3694c = r4
            r0.B(r10)
            goto La8
        L46:
            r0.J(r4)
            jf.h r1 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            Ef.l0 r3 = Ef.C0499l0.f3748a     // Catch: java.lang.Throwable -> L69
            jf.f r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L69
            Ef.m0 r1 = (Ef.InterfaceC0501m0) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L6b
            boolean r3 = r1.isActive()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r1.getCancellationException()     // Catch: java.lang.Throwable -> L69
            ef.m r9 = Fe.e.z(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r1 = r10.f6112g     // Catch: java.lang.Throwable -> L69
            jf.h r3 = r2.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = n(r3, r1)     // Catch: java.lang.Throwable -> L69
            H6.g r5 = Jf.b.f6100d     // Catch: java.lang.Throwable -> L69
            if (r1 == r5) goto L7e
            Ef.P0 r5 = Ef.H.O(r2, r3, r1)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r2.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.c0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r1)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.Q()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.z(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r2 = r5.c0()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto La3
        La0:
            g(r3, r1)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.h(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.z(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.b.h(java.lang.Object, jf.c):void");
    }

    public static final void i(A a5, InterfaceC3108h interfaceC3108h, Runnable runnable) throws N {
        try {
            a5.i(interfaceC3108h, runnable);
        } catch (Throwable th) {
            throw new N(th, a5, interfaceC3108h);
        }
    }

    public static final boolean j(A a5, InterfaceC3108h interfaceC3108h) throws N {
        try {
            return a5.w(interfaceC3108h);
        } catch (Throwable th) {
            throw new N(th, a5, interfaceC3108h);
        }
    }

    public static final long k(String str, long j8, long j10, long j11) {
        String property;
        int i5 = t.f6138a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j8;
        }
        Long lM0 = Bf.r.m0(property);
        if (lM0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM0.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j10);
        M6.A(sb2, "..", j11, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int l(int i5, int i10, String str) {
        return (int) k(str, i5, 1, (i10 & 8) != 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2097150);
    }

    public static final Object m(InterfaceC3108h interfaceC3108h) {
        Object objFold = interfaceC3108h.fold(0, f6101e);
        AbstractC3340k.b(objFold);
        return objFold;
    }

    public static final Object n(InterfaceC3108h interfaceC3108h, Object obj) {
        if (obj == null) {
            obj = m(interfaceC3108h);
        }
        return obj == 0 ? f6100d : obj instanceof Integer ? interfaceC3108h.fold(new x(((Number) obj).intValue(), interfaceC3108h), f6103g) : ((u) obj).b(interfaceC3108h);
    }
}
