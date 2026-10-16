package od;

import A7.RunnableC0285r1;
import E5.C0441b;
import R8.C0805a;
import Va.Y7;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC3541i;
import md.C3535c;
import md.C3542j;
import md.C3549q;
import md.C3551t;
import md.InterfaceC3543k;
import ne.C3618a;
import td.C4157a;

/* loaded from: classes5.dex */
public final class B0 implements r {

    /* renamed from: E, reason: collision with root package name */
    public static final md.W f41487E;

    /* renamed from: F, reason: collision with root package name */
    public static final md.W f41488F;

    /* renamed from: G, reason: collision with root package name */
    public static final md.k0 f41489G;

    /* renamed from: H, reason: collision with root package name */
    public static final Random f41490H;

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ F6.r f41491A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C3535c f41492B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C3549q f41493C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d7.j f41494D;

    /* renamed from: a, reason: collision with root package name */
    public final F6.r f41495a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f41496b;

    /* renamed from: c, reason: collision with root package name */
    public final md.n0 f41497c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f41498d;

    /* renamed from: e, reason: collision with root package name */
    public final md.b0 f41499e;

    /* renamed from: f, reason: collision with root package name */
    public final I1 f41500f;

    /* renamed from: g, reason: collision with root package name */
    public final C3675c0 f41501g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f41502h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f41503i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f41504j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final long f41505l;

    /* renamed from: m, reason: collision with root package name */
    public final H1 f41506m;

    /* renamed from: n, reason: collision with root package name */
    public final N.J0 f41507n;

    /* renamed from: o, reason: collision with root package name */
    public volatile D1 f41508o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f41509p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicInteger f41510q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicInteger f41511r;

    /* renamed from: s, reason: collision with root package name */
    public C3618a f41512s;

    /* renamed from: t, reason: collision with root package name */
    public long f41513t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC3724t f41514u;

    /* renamed from: v, reason: collision with root package name */
    public C0441b f41515v;

    /* renamed from: w, reason: collision with root package name */
    public C0441b f41516w;

    /* renamed from: x, reason: collision with root package name */
    public long f41517x;

    /* renamed from: y, reason: collision with root package name */
    public md.k0 f41518y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f41519z;

    static {
        C3542j c3542j = md.b0.f40615d;
        BitSet bitSet = md.Y.f40606d;
        f41487E = new md.W("grpc-previous-rpc-attempts", c3542j);
        f41488F = new md.W("grpc-retry-pushback-ms", c3542j);
        f41489G = md.k0.f40675f.h("Stream thrown away because RetriableStream committed");
        f41490H = new Random();
    }

    public B0(d7.j jVar, F6.r rVar, md.b0 b0Var, C3535c c3535c, I1 i12, C3675c0 c3675c0, C3549q c3549q) {
        this.f41494D = jVar;
        this.f41491A = rVar;
        this.f41492B = c3535c;
        this.f41493C = c3549q;
        M0 m02 = (M0) jVar.f34137a;
        com.google.android.gms.ads.nativead.l lVar = m02.f41672U;
        long j8 = m02.f41673V;
        long j10 = m02.f41674W;
        Executor executor = c3535c.f40621b;
        executor = executor == null ? m02.f41688h : executor;
        ScheduledExecutorService scheduledExecutorService = m02.f41686f.f41993a.f43492d;
        H1 h12 = (H1) jVar.f34138b;
        this.f41497c = new md.n0(new C3729u1());
        this.f41503i = new Object();
        this.f41507n = new N.J0((byte) 0, 2);
        this.f41508o = new D1(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.f41509p = new AtomicBoolean();
        this.f41510q = new AtomicInteger();
        this.f41511r = new AtomicInteger();
        this.f41495a = rVar;
        this.f41504j = lVar;
        this.k = j8;
        this.f41505l = j10;
        this.f41496b = executor;
        this.f41498d = scheduledExecutorService;
        this.f41499e = b0Var;
        this.f41500f = i12;
        if (i12 != null) {
            this.f41517x = i12.f41603b;
        }
        this.f41501g = c3675c0;
        Fe.e.p("Should not provide both retryPolicy and hedgingPolicy", i12 == null || c3675c0 == null);
        this.f41502h = c3675c0 != null;
        this.f41506m = h12;
    }

    public static void m(B0 b02, Integer num) {
        b02.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            b02.r();
            return;
        }
        synchronized (b02.f41503i) {
            try {
                C0441b c0441b = b02.f41516w;
                if (c0441b == null) {
                    return;
                }
                c0441b.f3290b = true;
                ScheduledFuture scheduledFuture = (ScheduledFuture) c0441b.f3292d;
                C0441b c0441b2 = new C0441b(b02.f41503i);
                b02.f41516w = c0441b2;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c0441b2.m(b02.f41498d.schedule(new RunnableC3666A(21, b02, c0441b2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.X1
    public final void a(InterfaceC3543k interfaceC3543k) {
        p(new C3732v1(interfaceC3543k, 0));
    }

    @Override // od.r
    public final void b(int i5) {
        p(new C3738x1(i5, 1));
    }

    @Override // od.X1
    public final void c(C4157a c4157a) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // od.X1
    public final void d(int i5) {
        D1 d12 = this.f41508o;
        if (d12.f41537a) {
            d12.f41542f.f41564a.d(i5);
        } else {
            p(new C3738x1(i5, 2));
        }
    }

    @Override // od.r
    public final void e(int i5) {
        p(new C3738x1(i5, 0));
    }

    @Override // od.r
    public final void f(md.r rVar) {
        p(new C3732v1(rVar, 1));
    }

    @Override // od.X1
    public final void flush() {
        D1 d12 = this.f41508o;
        if (d12.f41537a) {
            d12.f41542f.f41564a.flush();
        } else {
            p(new C3735w1(0));
        }
    }

    @Override // od.r
    public final void g(md.k0 k0Var) throws Exception {
        G1 g12;
        G1 g13 = new G1(0);
        g13.f41564a = new C3673b1();
        RunnableC0285r1 runnableC0285r1N = n(g13);
        if (runnableC0285r1N != null) {
            synchronized (this.f41503i) {
                this.f41508o = this.f41508o.e(g13);
            }
            runnableC0285r1N.run();
            u(k0Var, EnumC3721s.f42082a, new md.b0());
            return;
        }
        synchronized (this.f41503i) {
            try {
                if (this.f41508o.f41539c.contains(this.f41508o.f41542f)) {
                    g12 = this.f41508o.f41542f;
                } else {
                    this.f41518y = k0Var;
                    g12 = null;
                }
                D1 d12 = this.f41508o;
                this.f41508o = new D1(d12.f41538b, d12.f41539c, d12.f41540d, d12.f41542f, true, d12.f41537a, d12.f41544h, d12.f41541e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g12 != null) {
            g12.f41564a.g(k0Var);
        }
    }

    @Override // od.X1
    public final void h() {
        p(new C3735w1(2));
    }

    @Override // od.r
    public final void i(N.J0 j02) {
        D1 d12;
        synchronized (this.f41503i) {
            j02.c(this.f41507n, "closed");
            d12 = this.f41508o;
        }
        if (d12.f41542f != null) {
            N.J0 j03 = new N.J0((byte) 0, 2);
            d12.f41542f.f41564a.i(j03);
            j02.c(j03, "committed");
            return;
        }
        N.J0 j04 = new N.J0((byte) 0, 2);
        for (G1 g12 : d12.f41539c) {
            N.J0 j05 = new N.J0((byte) 0, 2);
            g12.f41564a.i(j05);
            j04.f7714b.add(String.valueOf(j05));
        }
        j02.c(j04, "open");
    }

    @Override // od.X1
    public final boolean isReady() {
        Iterator it = this.f41508o.f41539c.iterator();
        while (it.hasNext()) {
            if (((G1) it.next()).f41564a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // od.r
    public final void j() {
        p(new C3735w1(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // od.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(od.InterfaceC3724t r7) throws java.lang.Exception {
        /*
            r6 = this;
            r6.f41514u = r7
            md.k0 r7 = r6.t()
            if (r7 == 0) goto Lc
            r6.g(r7)
            return
        Lc:
            java.lang.Object r7 = r6.f41503i
            monitor-enter(r7)
            od.D1 r0 = r6.f41508o     // Catch: java.lang.Throwable -> L79
            java.util.List r0 = r0.f41538b     // Catch: java.lang.Throwable -> L79
            od.C1 r1 = new od.C1     // Catch: java.lang.Throwable -> L79
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L79
            r0.add(r1)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L79
            r7 = 0
            od.G1 r0 = r6.o(r7, r7)
            if (r0 != 0) goto L24
            return
        L24:
            boolean r1 = r6.f41502h
            if (r1 == 0) goto L75
            java.lang.Object r1 = r6.f41503i
            monitor-enter(r1)
            od.D1 r2 = r6.f41508o     // Catch: java.lang.Throwable -> L56
            od.D1 r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L56
            r6.f41508o = r2     // Catch: java.lang.Throwable -> L56
            od.D1 r2 = r6.f41508o     // Catch: java.lang.Throwable -> L56
            boolean r2 = r6.s(r2)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L58
            od.H1 r2 = r6.f41506m     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L4c
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f41584d     // Catch: java.lang.Throwable -> L56
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L56
            int r2 = r2.f41582b     // Catch: java.lang.Throwable -> L56
            if (r3 <= r2) goto L4a
            r7 = 1
        L4a:
            if (r7 == 0) goto L58
        L4c:
            E5.b r7 = new E5.b     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r6.f41503i     // Catch: java.lang.Throwable -> L56
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L56
            r6.f41516w = r7     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r7 = move-exception
            goto L73
        L58:
            r7 = 0
        L59:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L75
            java.util.concurrent.ScheduledExecutorService r1 = r6.f41498d
            od.A r2 = new od.A
            r3 = 21
            r2.<init>(r3, r6, r7)
            od.c0 r3 = r6.f41501g
            long r3 = r3.f41928b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r5)
            r7.m(r1)
            goto L75
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r7
        L75:
            r6.q(r0)
            return
        L79:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L79
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od.B0.k(od.t):void");
    }

    @Override // od.r
    public final void l(C3551t c3551t) {
        p(new C3732v1(c3551t, 2));
    }

    public final RunnableC0285r1 n(G1 g12) {
        Collection collectionSingleton;
        boolean z2;
        List list;
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        synchronized (this.f41503i) {
            try {
                if (this.f41508o.f41542f != null) {
                    return null;
                }
                Collection collection = this.f41508o.f41539c;
                D1 d12 = this.f41508o;
                Fe.e.w("Already committed", d12.f41542f == null);
                if (d12.f41539c.contains(g12)) {
                    collectionSingleton = Collections.singleton(g12);
                    list = null;
                    z2 = true;
                } else {
                    collectionSingleton = Collections.EMPTY_LIST;
                    z2 = false;
                    list = d12.f41538b;
                }
                this.f41508o = new D1(list, collectionSingleton, d12.f41540d, g12, d12.f41543g, z2, d12.f41544h, d12.f41541e);
                ((AtomicLong) this.f41504j.f26356b).addAndGet(-this.f41513t);
                C0441b c0441b = this.f41515v;
                if (c0441b != null) {
                    c0441b.f3290b = true;
                    ScheduledFuture scheduledFuture3 = (ScheduledFuture) c0441b.f3292d;
                    this.f41515v = null;
                    scheduledFuture = scheduledFuture3;
                } else {
                    scheduledFuture = null;
                }
                C0441b c0441b2 = this.f41516w;
                if (c0441b2 != null) {
                    c0441b2.f3290b = true;
                    ScheduledFuture scheduledFuture4 = (ScheduledFuture) c0441b2.f3292d;
                    this.f41516w = null;
                    scheduledFuture2 = scheduledFuture4;
                } else {
                    scheduledFuture2 = null;
                }
                return new RunnableC0285r1(this, collection, g12, scheduledFuture, scheduledFuture2, 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G1 o(int i5, boolean z2) {
        AtomicInteger atomicInteger;
        int i10;
        do {
            atomicInteger = this.f41511r;
            i10 = atomicInteger.get();
            if (i10 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i10, i10 + 1));
        G1 g12 = new G1(i5);
        C3744z1 c3744z1 = new C3744z1(new B1(this, g12));
        md.b0 b0Var = new md.b0();
        b0Var.d(this.f41499e);
        if (i5 > 0) {
            b0Var.f(f41487E, String.valueOf(i5));
        }
        C3535c c3535c = this.f41492B;
        c3535c.getClass();
        List list = c3535c.f40624e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(c3744z1);
        C0805a c0805aB = C3535c.b(c3535c);
        c0805aB.f10440e = DesugarCollections.unmodifiableList(arrayList);
        C3535c c3535c2 = new C3535c(c0805aB);
        AbstractC3541i[] abstractC3541iArrC = AbstractC3669a0.c(c3535c2, b0Var, i5, z2);
        F6.r rVar = this.f41491A;
        InterfaceC3727u interfaceC3727uC = this.f41494D.c(new C3709n1(rVar, b0Var, c3535c2));
        C3549q c3549q = this.f41493C;
        C3549q c3549qA = c3549q.a();
        try {
            r rVarC = interfaceC3727uC.c(rVar, b0Var, c3535c2, abstractC3541iArrC);
            c3549q.c(c3549qA);
            g12.f41564a = rVarC;
            return g12;
        } catch (Throwable th) {
            c3549q.c(c3549qA);
            throw th;
        }
    }

    public final void p(A1 a12) {
        Collection collection;
        synchronized (this.f41503i) {
            try {
                if (!this.f41508o.f41537a) {
                    this.f41508o.f41538b.add(a12);
                }
                collection = this.f41508o.f41539c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a12.a((G1) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r8.f41497c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r9.f41564a.k(new od.a2(4, r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        r0 = r9.f41564a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (r8.f41508o.f41542f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r9 = r8.f41518y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        r9 = od.B0.f41489G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        r0.g(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
    
        r4 = (od.A1) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if ((r4 instanceof od.C1) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a2, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        r4 = r8.f41508o;
        r5 = r4.f41542f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        if (r4.f41543g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(od.G1 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f41503i
            monitor-enter(r4)
            od.D1 r5 = r8.f41508o     // Catch: java.lang.Throwable -> L11
            od.G1 r6 = r5.f41542f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L11:
            r9 = move-exception
            goto Lb3
        L14:
            boolean r6 = r5.f41543g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L1a:
            java.util.List r6 = r5.f41538b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5e
            od.D1 r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.f41508o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            g5.d r1 = new g5.d     // Catch: java.lang.Throwable -> L11
            r0 = 13
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L38:
            if (r1 == 0) goto L40
            md.n0 r9 = r8.f41497c
            r9.execute(r1)
            return
        L40:
            if (r2 != 0) goto L4d
            od.r r0 = r9.f41564a
            od.a2 r1 = new od.a2
            r2 = 4
            r1.<init>(r2, r8, r9)
            r0.k(r1)
        L4d:
            od.r r0 = r9.f41564a
            od.D1 r1 = r8.f41508o
            od.G1 r1 = r1.f41542f
            if (r1 != r9) goto L58
            md.k0 r9 = r8.f41518y
            goto L5a
        L58:
            md.k0 r9 = od.B0.f41489G
        L5a:
            r0.g(r9)
            return
        L5e:
            boolean r6 = r9.f41565b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L64
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L64:
            int r6 = r0 + 128
            java.util.List r7 = r5.f41538b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f41538b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L8a
        L7e:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f41538b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L8a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lb0
            java.lang.Object r4 = r0.next()
            od.A1 r4 = (od.A1) r4
            r4.a(r9)
            boolean r4 = r4 instanceof od.C1
            if (r4 == 0) goto La3
            r2 = 1
        La3:
            od.D1 r4 = r8.f41508o
            od.G1 r5 = r4.f41542f
            if (r5 == 0) goto Lac
            if (r5 == r9) goto Lac
            goto Lb0
        Lac:
            boolean r4 = r4.f41543g
            if (r4 == 0) goto L8f
        Lb0:
            r0 = r6
            goto L4
        Lb3:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: od.B0.q(od.G1):void");
    }

    public final void r() {
        ScheduledFuture scheduledFuture;
        synchronized (this.f41503i) {
            try {
                C0441b c0441b = this.f41516w;
                scheduledFuture = null;
                if (c0441b != null) {
                    c0441b.f3290b = true;
                    ScheduledFuture scheduledFuture2 = (ScheduledFuture) c0441b.f3292d;
                    this.f41516w = null;
                    scheduledFuture = scheduledFuture2;
                }
                D1 d12 = this.f41508o;
                if (!d12.f41544h) {
                    d12 = new D1(d12.f41538b, d12.f41539c, d12.f41540d, d12.f41542f, d12.f41543g, d12.f41537a, true, d12.f41541e);
                }
                this.f41508o = d12;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final boolean s(D1 d12) {
        if (d12.f41542f == null) {
            return d12.f41541e < this.f41501g.f41927a && !d12.f41544h;
        }
        return false;
    }

    public final md.k0 t() {
        Y7 y72 = ((M0) this.f41494D.f34137a).f41658F;
        synchronized (y72.f13867a) {
            try {
                md.k0 k0Var = (md.k0) y72.f13869c;
                if (k0Var != null) {
                    return k0Var;
                }
                ((HashSet) y72.f13868b).add(this);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(md.k0 k0Var, EnumC3721s enumC3721s, md.b0 b0Var) {
        this.f41512s = new C3618a(k0Var, enumC3721s, b0Var);
        if (this.f41511r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f41497c.execute(new A7.W0(this, k0Var, enumC3721s, b0Var, 22));
        }
    }

    public final void v(Object obj) {
        D1 d12 = this.f41508o;
        if (d12.f41537a) {
            d12.f41542f.f41564a.c(this.f41495a.f(obj));
        } else {
            p(new C3741y1(this, obj));
        }
    }
}
