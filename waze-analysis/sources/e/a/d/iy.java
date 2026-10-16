package e.a.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import j$.util.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class iy implements af {

    /* renamed from: a, reason: collision with root package name */
    static final e.a.ch f47194a = e.a.ch.c("grpc-previous-rpc-attempts", e.a.cm.f46534a);

    /* renamed from: b, reason: collision with root package name */
    static final e.a.ch f47195b = e.a.ch.c("grpc-retry-pushback-ms", e.a.cm.f46534a);

    /* renamed from: g, reason: collision with root package name */
    private static final e.a.ee f47196g = e.a.ee.f47402b.g("Stream thrown away because RetriableStream committed");

    /* renamed from: h, reason: collision with root package name */
    private static final Random f47197h = new Random();

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f47198i;
    private il A;
    private long B;
    private ah C;
    private ii D;
    private ii E;
    private long F;
    private e.a.ee G;
    private boolean H;
    private final ka I;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a.cq f47199c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e.a.h f47200d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e.a.ac f47201e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ et f47202f;

    /* renamed from: j, reason: collision with root package name */
    private final e.a.cq f47203j;

    /* renamed from: k, reason: collision with root package name */
    private final Executor f47204k;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f47205l;
    private final ScheduledExecutorService m;
    private final e.a.cm n;
    private final iz o;
    private final di p;
    private final boolean q;
    private final Object r;
    private final long s;
    private final long t;
    private final ix u;
    private final dn v;
    private volatile in w;
    private final AtomicBoolean x;
    private final AtomicInteger y;
    private final AtomicInteger z;

    static {
        e.a.ch chVar = dh.f46791a;
        f47198i = e.a.dt.j("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    iy(et etVar, e.a.cq cqVar, e.a.cm cmVar, e.a.h hVar, iz izVar, di diVar, e.a.ac acVar) {
        this.f47199c = cqVar;
        this.f47200d = hVar;
        this.f47201e = acVar;
        Objects.requireNonNull(etVar);
        this.f47202f = etVar;
        fp fpVar = etVar.f46898b;
        ka kaVar = fpVar.ai;
        long j2 = fpVar.aa;
        long j3 = fpVar.ab;
        Executor executorL = fp.L(fpVar, hVar);
        ScheduledExecutorService scheduledExecutorServiceC = etVar.f46898b.p.c();
        ix ixVar = etVar.f46897a;
        this.f47205l = new e.a.el(new hw(this));
        this.r = new Object();
        this.v = new dn();
        this.w = new in(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.x = new AtomicBoolean();
        this.y = new AtomicInteger();
        this.z = new AtomicInteger();
        this.f47203j = cqVar;
        this.I = kaVar;
        this.s = j2;
        this.t = j3;
        this.f47204k = executorL;
        this.m = scheduledExecutorServiceC;
        this.n = cmVar;
        this.o = izVar;
        if (izVar != null) {
            this.F = izVar.f47207b;
        }
        this.p = diVar;
        com.google.d.b.an.m(izVar == null || diVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.q = diVar != null;
        this.u = ixVar;
    }

    static /* bridge */ /* synthetic */ void R(iy iyVar, iw iwVar) {
        Runnable runnableAd = iyVar.ad(iwVar);
        if (runnableAd != null) {
            iyVar.f47204k.execute(runnableAd);
        }
    }

    static /* bridge */ /* synthetic */ void U(iy iyVar, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            iyVar.ag();
            return;
        }
        Object obj = iyVar.r;
        synchronized (obj) {
            ii iiVar = iyVar.E;
            if (iiVar == null) {
                return;
            }
            Future futureA = iiVar.a();
            ii iiVar2 = new ii(obj);
            iyVar.E = iiVar2;
            if (futureA != null) {
                futureA.cancel(false);
            }
            iiVar2.b(iyVar.m.schedule(new ik(iyVar, iiVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iw ac(int i2, boolean z, boolean z2) {
        AtomicInteger atomicInteger;
        int i3;
        do {
            atomicInteger = this.z;
            i3 = atomicInteger.get();
            if (i3 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i3, i3 + 1));
        iw iwVar = new iw(i2);
        id idVar = new id(this, new ih(this, iwVar));
        e.a.cm cmVar = this.n;
        e.a.cm cmVar2 = new e.a.cm();
        cmVar2.h(cmVar);
        if (i2 > 0) {
            cmVar2.i(f47194a, String.valueOf(i2));
        }
        e.a.h hVarU = this.f47200d.u(idVar);
        e.a.p[] pVarArrJ = dh.j(hVarU, i2, z, z2);
        e.a.ac acVarA = this.f47201e.a();
        try {
            af afVarB = this.f47202f.f46898b.K.b(this.f47199c, cmVar2, hVarU, pVarArrJ);
            this.f47201e.b(acVarA);
            iwVar.f47186a = afVarB;
            return iwVar;
        } catch (Throwable th) {
            this.f47201e.b(acVarA);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable ad(iw iwVar) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.r) {
            if (this.w.f47168f != null) {
                return null;
            }
            Collection collection = this.w.f47165c;
            in inVar = this.w;
            com.google.d.b.an.v(inVar.f47168f == null, "Already committed");
            List list2 = inVar.f47164b;
            if (inVar.f47165c.contains(iwVar)) {
                list = null;
                collectionSingleton = Collections.singleton(iwVar);
                z = true;
            } else {
                list = list2;
                z = false;
                collectionSingleton = Collections.EMPTY_LIST;
            }
            this.w = new in(list, collectionSingleton, inVar.f47166d, iwVar, inVar.f47169g, z, inVar.f47170h, inVar.f47167e);
            this.I.c(-this.B);
            ii iiVar = this.D;
            boolean z2 = iiVar == null;
            boolean z3 = iiVar != null ? iiVar.f47154c : false;
            boolean z4 = !z2;
            if (z2) {
                future = null;
            } else {
                Future futureA = iiVar.a();
                this.D = null;
                future = futureA;
            }
            ii iiVar2 = this.E;
            if (iiVar2 != null) {
                Future futureA2 = iiVar2.a();
                this.E = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new hy(this, collection, iwVar, z4, future, z3, future2);
        }
    }

    private final void ae(ig igVar) {
        Collection collection;
        synchronized (this.r) {
            if (!this.w.f47163a) {
                this.w.f47164b.add(igVar);
            }
            collection = this.w.f47165c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            igVar.a((iw) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9.f47205l.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r10.f47186a.m(new e.a.d.iv(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        r0 = r10.f47186a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r9.w.f47168f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r9 = r9.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r9 = e.a.d.iy.f47196g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r0.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        r7 = (e.a.d.ig) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof e.a.d.im);
        r7 = r9.w;
        r8 = r7.f47168f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r7.f47169g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void af(e.a.d.iw r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.r
            monitor-enter(r5)
            e.a.d.in r6 = r9.w     // Catch: java.lang.Throwable -> La4
            e.a.d.iw r7 = r6.f47168f     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            goto L34
        L12:
            boolean r7 = r6.f47169g     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            goto L34
        L18:
            java.util.List r7 = r6.f47164b     // Catch: java.lang.Throwable -> La4
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La4
            if (r2 != r8) goto L59
            e.a.d.in r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La4
            r9.w = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            return
        L2e:
            e.a.d.ie r1 = new e.a.d.ie     // Catch: java.lang.Throwable -> La4
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
        L34:
            if (r1 == 0) goto L3c
            java.util.concurrent.Executor r9 = r9.f47205l
            r9.execute(r1)
            return
        L3c:
            if (r4 != 0) goto L48
            e.a.d.af r0 = r10.f47186a
            e.a.d.iv r1 = new e.a.d.iv
            r1.<init>(r9, r10)
            r0.m(r1)
        L48:
            e.a.d.af r0 = r10.f47186a
            e.a.d.in r1 = r9.w
            e.a.d.iw r1 = r1.f47168f
            if (r1 != r10) goto L53
            e.a.ee r9 = r9.G
            goto L55
        L53:
            e.a.ee r9 = e.a.d.iy.f47196g
        L55:
            r0.c(r9)
            return
        L59:
            boolean r6 = r10.f47187b     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            return
        L5f:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La4
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L75
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La4
            goto L7f
        L75:
            r3.clear()     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La4
        L7f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            int r2 = r3.size()
            r5 = r0
        L85:
            if (r5 >= r2) goto La1
            java.lang.Object r7 = r3.get(r5)
            e.a.d.ig r7 = (e.a.d.ig) r7
            r7.a(r10)
            boolean r7 = r7 instanceof e.a.d.im
            r4 = r4 | r7
            e.a.d.in r7 = r9.w
            e.a.d.iw r8 = r7.f47168f
            if (r8 == 0) goto L9b
            if (r8 != r10) goto La1
        L9b:
            boolean r7 = r7.f47169g
            int r5 = r5 + 1
            if (r7 == 0) goto L85
        La1:
            r2 = r6
            goto L5
        La4:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.iy.af(e.a.d.iw):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ag() {
        Future future;
        synchronized (this.r) {
            ii iiVar = this.E;
            future = null;
            if (iiVar != null) {
                Future futureA = iiVar.a();
                this.E = null;
                future = futureA;
            }
            this.w = this.w.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ah(e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        this.A = new il(eeVar, agVar, cmVar);
        if (this.z.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f47205l.execute(new Cif(this, eeVar, agVar, cmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ai(in inVar) {
        return inVar.f47168f == null && inVar.f47167e < this.p.f46803a && !inVar.f47170h;
    }

    public static long t(long j2) {
        return (long) (j2 * (f47198i ? (f47197h.nextDouble() * 0.4d) + 0.8d : f47197h.nextDouble()));
    }

    final void W(Object obj) {
        in inVar = this.w;
        if (inVar.f47163a) {
            inVar.f47168f.f47186a.n(this.f47203j.c(obj));
        } else {
            ae(new ic(this, obj));
        }
    }

    @Override // e.a.d.af
    public final e.a.c a() {
        throw null;
    }

    @Override // e.a.d.af
    public final void b(dn dnVar) {
        in inVar;
        synchronized (this.r) {
            dnVar.b("closed", this.v);
            inVar = this.w;
        }
        iw iwVar = inVar.f47168f;
        if (iwVar != null) {
            dn dnVar2 = new dn();
            iwVar.f47186a.b(dnVar2);
            dnVar.b("committed", dnVar2);
            return;
        }
        dn dnVar3 = new dn();
        for (iw iwVar2 : inVar.f47165c) {
            dn dnVar4 = new dn();
            iwVar2.f47186a.b(dnVar4);
            dnVar3.a(dnVar4);
        }
        dnVar.b(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, dnVar3);
    }

    @Override // e.a.d.af
    public final void c(e.a.ee eeVar) {
        iw iwVar;
        iw iwVar2 = new iw(0);
        iwVar2.f47186a = new gq();
        Runnable runnableAd = ad(iwVar2);
        Object obj = this.r;
        if (runnableAd != null) {
            synchronized (obj) {
                this.w = this.w.c(iwVar2);
            }
            runnableAd.run();
            ah(eeVar, ag.f46605a, new e.a.cm());
            return;
        }
        synchronized (obj) {
            if (this.w.f47165c.contains(this.w.f47168f)) {
                iwVar = this.w.f47168f;
            } else {
                this.G = eeVar;
                iwVar = null;
            }
            in inVar = this.w;
            this.w = new in(inVar.f47164b, inVar.f47165c, inVar.f47166d, inVar.f47168f, true, inVar.f47163a, inVar.f47170h, inVar.f47167e);
        }
        if (iwVar != null) {
            iwVar.f47186a.c(eeVar);
        }
    }

    @Override // e.a.d.ju
    public final void d() {
        in inVar = this.w;
        if (inVar.f47163a) {
            inVar.f47168f.f47186a.d();
        } else {
            ae(new ia(this, 1, (byte[]) null));
        }
    }

    @Override // e.a.d.af
    public final void e() {
        ae(new ia(this, 0));
    }

    @Override // e.a.d.ju
    public final void f() {
        ae(new ia(this, 2, (char[]) null));
    }

    @Override // e.a.d.ju
    public final void g(int i2) {
        in inVar = this.w;
        if (inVar.f47163a) {
            inVar.f47168f.f47186a.g(i2);
        } else {
            ae(new ib(this, i2, 2, (char[]) null));
        }
    }

    @Override // e.a.d.ju
    public final void h(e.a.s sVar) {
        ae(new hz(this, sVar, 1));
    }

    @Override // e.a.d.af
    public final void i(e.a.ad adVar) {
        ae(new hz(this, adVar, 0));
    }

    @Override // e.a.d.af
    public final void j(e.a.ag agVar) {
        ae(new hz(this, agVar, 2));
    }

    @Override // e.a.d.af
    public final void k(int i2) {
        ae(new ib(this, i2, 1, (byte[]) null));
    }

    @Override // e.a.d.af
    public final void l(int i2) {
        ae(new ib(this, i2, 0));
    }

    @Override // e.a.d.af
    public final void m(ah ahVar) {
        e.a.ee eeVar;
        ii iiVar;
        ix ixVar;
        this.C = ahVar;
        fo foVar = this.f47202f.f46898b.L;
        synchronized (foVar.f46940a) {
            eeVar = foVar.f46942c;
            iiVar = null;
            if (eeVar == null) {
                foVar.f46941b.add(this);
                eeVar = null;
            }
        }
        if (eeVar != null) {
            c(eeVar);
            return;
        }
        synchronized (this.r) {
            this.w.f47164b.add(new im(this));
        }
        iw iwVarAc = ac(0, false, false);
        if (iwVarAc == null) {
            return;
        }
        if (this.q) {
            Object obj = this.r;
            synchronized (obj) {
                this.w = this.w.a(iwVarAc);
                if (ai(this.w) && ((ixVar = this.u) == null || ixVar.a())) {
                    iiVar = new ii(obj);
                    this.E = iiVar;
                }
            }
            if (iiVar != null) {
                iiVar.b(this.m.schedule(new ik(this, iiVar), this.p.f46804b, TimeUnit.NANOSECONDS));
            }
        }
        af(iwVarAc);
    }

    @Override // e.a.d.ju
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // e.a.d.ju
    public final boolean o() {
        Iterator it = this.w.f47165c.iterator();
        while (it.hasNext()) {
            if (((iw) it.next()).f47186a.o()) {
                return true;
            }
        }
        return false;
    }
}
