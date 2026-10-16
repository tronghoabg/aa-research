package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
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

/* loaded from: classes.dex */
public final class adyg implements adsh {
    static final adlx a;
    static final adlx b;
    public static final adnq c;
    public static final Random d;
    public static final boolean e;
    public boolean A;
    final /* synthetic */ admf B;
    final /* synthetic */ adiw C;
    final /* synthetic */ adjq D;
    final /* synthetic */ advh E;
    public zre F;
    public final sm G;
    private final admc H;
    private adnq I;
    public final admf f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final adyh j;
    public final aduf k;
    public final boolean l;
    public final Object m;
    public final long n;
    public final long o;
    public final adyf p;
    public final aduk q;
    public volatile adyb r;
    public final AtomicBoolean s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public long v;
    public adsj w;
    public adxy x;
    public adxy y;
    public long z;

    static {
        adlu adluVar = admc.b;
        int i = adlx.d;
        a = new adlt("grpc-previous-rpc-attempts", adluVar);
        b = new adlt("grpc-retry-pushback-ms", admc.b);
        c = adnq.c.e("Stream thrown away because RetriableStream committed");
        d = new Random();
        Charset charset = adue.a;
        e = adjw.a("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public adyg(advh advhVar, admf admfVar, admc admcVar, adiw adiwVar, adyh adyhVar, aduf adufVar, adjq adjqVar) {
        this.B = admfVar;
        this.C = adiwVar;
        this.D = adjqVar;
        this.E = advhVar;
        advv advvVar = advhVar.b;
        sm smVar = advvVar.U;
        long j = advvVar.M;
        long j2 = advvVar.N;
        Executor executorF = advvVar.f(adiwVar);
        ScheduledExecutorService scheduledExecutorServiceC = advvVar.i.c();
        adyf adyfVar = advhVar.a;
        this.h = new adnw(new adxp());
        this.m = new Object();
        this.q = new aduk();
        this.r = new adyb(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.t = new AtomicInteger();
        this.u = new AtomicInteger();
        this.f = admfVar;
        this.G = smVar;
        this.n = j;
        this.o = j2;
        this.g = executorF;
        this.i = scheduledExecutorServiceC;
        this.H = admcVar;
        this.j = adyhVar;
        if (adyhVar != null) {
            this.z = adyhVar.b;
        }
        this.k = adufVar;
        woy.O(adyhVar == null || adufVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = adufVar != null;
        this.p = adyfVar;
    }

    @Override // defpackage.adsh
    public final adis a() {
        throw null;
    }

    @Override // defpackage.adsh
    public final void b(aduk adukVar) {
        adyb adybVar;
        synchronized (this.m) {
            adukVar.b("closed", this.q);
            adybVar = this.r;
        }
        adye adyeVar = adybVar.f;
        if (adyeVar != null) {
            aduk adukVar2 = new aduk();
            adyeVar.a.b(adukVar2);
            adukVar.b("committed", adukVar2);
            return;
        }
        aduk adukVar3 = new aduk();
        for (adye adyeVar2 : adybVar.c) {
            aduk adukVar4 = new aduk();
            adyeVar2.a.b(adukVar4);
            adukVar3.a(adukVar4);
        }
        adukVar.b("open", adukVar3);
    }

    @Override // defpackage.adsh
    public final void c(adnq adnqVar) {
        adye adyeVar;
        adye adyeVar2 = new adye(0);
        adyeVar2.a = new adws();
        Runnable runnableQ = q(adyeVar2);
        Object obj = this.m;
        if (runnableQ != null) {
            synchronized (obj) {
                this.r = this.r.c(adyeVar2);
            }
            runnableQ.run();
            v(adnqVar, adsi.a, new admc());
            return;
        }
        synchronized (obj) {
            if (this.r.c.contains(this.r.f)) {
                adyeVar = this.r.f;
            } else {
                this.I = adnqVar;
                adyeVar = null;
            }
            adyb adybVar = this.r;
            this.r = new adyb(adybVar.b, adybVar.c, adybVar.d, adybVar.f, true, adybVar.a, adybVar.h, adybVar.e);
        }
        if (adyeVar != null) {
            adyeVar.a.c(adnqVar);
        }
    }

    @Override // defpackage.adzw
    public final void d() {
        adyb adybVar = this.r;
        if (adybVar.a) {
            adybVar.f.a.d();
        } else {
            s(new adxs(1));
        }
    }

    @Override // defpackage.adsh
    public final void e() {
        s(new adxs(0));
    }

    @Override // defpackage.adzw
    public final void f() {
        s(new adxs(2));
    }

    @Override // defpackage.adzw
    public final void g(int i) {
        adyb adybVar = this.r;
        if (adybVar.a) {
            adybVar.f.a.g(i);
        } else {
            s(new adxt(i, 2));
        }
    }

    @Override // defpackage.adzw
    public final void h(adje adjeVar) {
        s(new adxr(adjeVar, 1));
    }

    @Override // defpackage.adsh
    public final void i(adjr adjrVar) {
        s(new adxr(adjrVar, 0));
    }

    @Override // defpackage.adsh
    public final void j(adjt adjtVar) {
        s(new adxr(adjtVar, 2));
    }

    @Override // defpackage.adsh
    public final void k(int i) {
        s(new adxt(i, 1));
    }

    @Override // defpackage.adsh
    public final void l(int i) {
        s(new adxt(i, 0));
    }

    @Override // defpackage.adsh
    public final void m(adsj adsjVar) {
        adnq adnqVar;
        adxy adxyVar;
        adyf adyfVar;
        this.w = adsjVar;
        advu advuVar = this.E.b.y;
        synchronized (advuVar.a) {
            adnqVar = advuVar.c;
            adxyVar = null;
            if (adnqVar == null) {
                advuVar.b.add(this);
                adnqVar = null;
            }
        }
        if (adnqVar != null) {
            c(adnqVar);
            return;
        }
        synchronized (this.m) {
            this.r.b.add(new adya(this));
        }
        adye adyeVarP = p(0, false, false);
        if (adyeVarP == null) {
            return;
        }
        if (this.l) {
            Object obj = this.m;
            synchronized (obj) {
                this.r = this.r.a(adyeVarP);
                if (w(this.r) && ((adyfVar = this.p) == null || adyfVar.a())) {
                    adxyVar = new adxy(obj);
                    this.y = adxyVar;
                }
            }
            if (adxyVar != null) {
                adxyVar.b(this.i.schedule(new adxz(this, adxyVar), this.k.b, TimeUnit.NANOSECONDS));
            }
        }
        t(adyeVarP);
    }

    @Override // defpackage.adzw
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.adzw
    public final boolean o() {
        Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((adye) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final adye p(int i, boolean z, boolean z2) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.u;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        adye adyeVar = new adye(i);
        adxv adxvVar = new adxv(new adxx(this, adyeVar));
        admc admcVar = this.H;
        admc admcVar2 = new admc();
        admcVar2.e(admcVar);
        if (i > 0) {
            admcVar2.f(a, String.valueOf(i));
        }
        adiw adiwVarI = this.C.i(adxvVar);
        adjb[] adjbVarArrK = adue.k(adiwVarI);
        adjq adjqVarA = this.D.a();
        try {
            adsh adshVarB = this.E.b.x.b(this.B, admcVar2, adiwVarI, adjbVarArrK);
            this.D.f(adjqVarA);
            adyeVar.a = adshVarB;
            return adyeVar;
        } catch (Throwable th) {
            this.D.f(adjqVarA);
            throw th;
        }
    }

    public final Runnable q(adye adyeVar) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection = this.r.c;
            adyb adybVar = this.r;
            woy.aa(adybVar.f == null, "Already committed");
            List list2 = adybVar.b;
            if (adybVar.c.contains(adyeVar)) {
                list = null;
                collectionSingleton = Collections.singleton(adyeVar);
                z = true;
            } else {
                list = list2;
                z = false;
                collectionSingleton = Collections.EMPTY_LIST;
            }
            this.r = new adyb(list, collectionSingleton, adybVar.d, adyeVar, adybVar.g, z, adybVar.h, adybVar.e);
            this.G.B(-this.v);
            adxy adxyVar = this.x;
            boolean z2 = adxyVar == null;
            boolean z3 = adxyVar != null ? adxyVar.c : false;
            boolean z4 = !z2;
            if (z2) {
                future = null;
            } else {
                Future futureA = adxyVar.a();
                this.x = null;
                future = futureA;
            }
            adxy adxyVar2 = this.y;
            if (adxyVar2 != null) {
                Future futureA2 = adxyVar2.a();
                this.y = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new adxq(this, collection, adyeVar, z4, future, z3, future2);
        }
    }

    public final void r(adye adyeVar) {
        Runnable runnableQ = q(adyeVar);
        if (runnableQ != null) {
            this.g.execute(runnableQ);
        }
    }

    public final void s(adxw adxwVar) {
        Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(adxwVar);
            }
            collection = this.r.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            adxwVar.a((adye) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        r9.h.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        r10.a.m(new defpackage.adyd(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r9.r.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r9 = r9.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        r9 = defpackage.adyg.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        r0.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r7 = (defpackage.adxw) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.adya);
        r7 = r9.r;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        if (r7.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.adye r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.m
            monitor-enter(r5)
            adyb r6 = r9.r     // Catch: java.lang.Throwable -> La6
            adye r7 = r6.f     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            goto L36
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La6
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            goto L36
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La6
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La6
            if (r2 != r8) goto L5b
            adyb r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La6
            r9.r = r0     // Catch: java.lang.Throwable -> La6
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            return
        L2e:
            aduy r1 = new aduy     // Catch: java.lang.Throwable -> La6
            r0 = 19
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r9 = r9.h
            r9.execute(r1)
            return
        L3e:
            if (r4 != 0) goto L4a
            adsh r0 = r10.a
            adyd r1 = new adyd
            r1.<init>(r9, r10)
            r0.m(r1)
        L4a:
            adsh r0 = r10.a
            adyb r1 = r9.r
            adye r1 = r1.f
            if (r1 != r10) goto L55
            adnq r9 = r9.I
            goto L57
        L55:
            adnq r9 = defpackage.adyg.c
        L57:
            r0.c(r9)
            return
        L5b:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La6
            if (r6 == 0) goto L61
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            return
        L61:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La6
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La6
            if (r3 != 0) goto L77
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La6
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La6
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La6
            goto L81
        L77:
            r3.clear()     // Catch: java.lang.Throwable -> La6
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La6
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La6
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            int r2 = r3.size()
            r5 = r0
        L87:
            if (r5 >= r2) goto La3
            java.lang.Object r7 = r3.get(r5)
            adxw r7 = (defpackage.adxw) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.adya
            r4 = r4 | r7
            adyb r7 = r9.r
            adye r8 = r7.f
            if (r8 == 0) goto L9d
            if (r8 != r10) goto La3
        L9d:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L87
        La3:
            r2 = r6
            goto L5
        La6:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La6
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adyg.t(adye):void");
    }

    public final void u() {
        Future future;
        synchronized (this.m) {
            adxy adxyVar = this.y;
            future = null;
            if (adxyVar != null) {
                Future futureA = adxyVar.a();
                this.y = null;
                future = futureA;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void v(adnq adnqVar, adsi adsiVar, admc admcVar) {
        this.F = new zre(adnqVar, adsiVar, admcVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new adtg(this, adnqVar, adsiVar, admcVar, 2));
        }
    }

    public final boolean w(adyb adybVar) {
        return adybVar.f == null && adybVar.e < this.k.a && !adybVar.h;
    }
}
