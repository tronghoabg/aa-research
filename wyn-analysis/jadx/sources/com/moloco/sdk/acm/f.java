package com.moloco.sdk.acm;

import Ef.H;
import Ef.S;
import ef.C2515C;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static S3.i f28408b;

    /* renamed from: c, reason: collision with root package name */
    public static b7.k f28409c;

    /* renamed from: d, reason: collision with root package name */
    public static n f28410d;

    /* renamed from: e, reason: collision with root package name */
    public static m f28411e;

    /* renamed from: g, reason: collision with root package name */
    public static final Kd.a f28413g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReference f28414h;

    /* renamed from: i, reason: collision with root package name */
    public static final CopyOnWriteArrayList f28415i;

    /* renamed from: j, reason: collision with root package name */
    public static final CopyOnWriteArrayList f28416j;
    public static C6.l k;

    /* renamed from: a, reason: collision with root package name */
    public static final f f28407a = new f();

    /* renamed from: f, reason: collision with root package name */
    public static final Nf.d f28412f = Nf.e.a();

    static {
        Lf.e eVar = S.f3698a;
        f28413g = H.c(Lf.d.f7120b.plus(H.f()));
        f28414h = new AtomicReference(o.f28461c);
        f28415i = new CopyOnWriteArrayList();
        f28416j = new CopyOnWriteArrayList();
    }

    public static void a(h hVar) {
        if (f28414h.get() != o.f28459a) {
            f28416j.add(hVar);
            com.moloco.sdk.acm.services.e.c("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        } else {
            H.D(f28413g, null, new c(hVar, null), 3);
        }
    }

    public static void b(l event) {
        AbstractC3340k.e(event, "event");
        if (event.f28450b == 0) {
            event.f28450b = System.currentTimeMillis() - event.f28449a.f28475a.get();
        }
        if (f28414h.get() != o.f28459a) {
            f28415i.add(event);
            com.moloco.sdk.acm.services.e.c("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        } else {
            H.D(f28413g, null, new d(event, null), 3);
        }
    }

    public static Object d(m mVar, AbstractC3464c abstractC3464c) {
        String str = mVar.f28453a;
        n nVar = f28410d;
        if (nVar == null) {
            AbstractC3340k.m("opsConfig");
            throw null;
        }
        nVar.f28456b = str;
        long jLongValue = mVar.f28454b.longValue();
        n nVar2 = f28410d;
        if (nVar2 == null) {
            AbstractC3340k.m("opsConfig");
            throw null;
        }
        nVar2.f28457c = jLongValue;
        C6.l lVar = k;
        if (lVar != null) {
            Object objH = lVar.h(abstractC3464c);
            return objH == kf.a.f39711a ? objH : C2515C.f34653a;
        }
        AbstractC3340k.m("requestScheduler");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r10.b(r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.moloco.sdk.acm.m r9, jf.InterfaceC3103c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.e
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.acm.e r0 = (com.moloco.sdk.acm.e) r0
            int r1 = r0.f28370e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28370e = r1
            goto L18
        L13:
            com.moloco.sdk.acm.e r0 = new com.moloco.sdk.acm.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f28368c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f28370e
            ef.C r3 = ef.C2515C.f34653a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            Fe.e.U(r10)
            return r3
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            Nf.d r9 = r0.f28367b
            com.moloco.sdk.acm.m r0 = r0.f28366a
            Fe.e.U(r10)
            r10 = r9
            r9 = r0
            goto L74
        L3f:
            Fe.e.U(r10)
            java.util.concurrent.atomic.AtomicReference r10 = com.moloco.sdk.acm.f.f28414h
            java.lang.Object r10 = r10.get()
            com.moloco.sdk.acm.o r2 = com.moloco.sdk.acm.o.f28459a
            java.lang.String r7 = "AndroidClientMetrics"
            if (r10 == r2) goto L7f
            Kd.a r10 = com.moloco.sdk.acm.services.e.f28472a
            boolean r10 = com.moloco.sdk.acm.services.e.f28474c
            if (r10 != 0) goto L55
            goto L65
        L55:
            java.lang.String r10 = com.moloco.sdk.acm.services.e.f(r7)
            java.lang.String r2 = "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first."
            java.lang.String r2 = com.moloco.sdk.acm.services.e.a(r2)
            android.util.Log.w(r10, r2, r6)
            com.moloco.sdk.acm.services.e.d(r10, r2)
        L65:
            r0.f28366a = r9
            Nf.d r10 = com.moloco.sdk.acm.f.f28412f
            r0.f28367b = r10
            r0.f28370e = r5
            java.lang.Object r0 = r10.b(r0)
            if (r0 != r1) goto L74
            goto L8c
        L74:
            com.moloco.sdk.acm.f.f28411e = r9     // Catch: java.lang.Throwable -> L7a
            r10.a(r6)
            return r3
        L7a:
            r9 = move-exception
            r10.a(r6)
            throw r9
        L7f:
            java.lang.String r10 = "ACM update called. ACM initialized already, proceeding with update"
            com.moloco.sdk.acm.services.e.g(r7, r10)
            r0.f28370e = r4
            java.lang.Object r9 = d(r9, r0)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.f.c(com.moloco.sdk.acm.m, jf.c):java.lang.Object");
    }
}
