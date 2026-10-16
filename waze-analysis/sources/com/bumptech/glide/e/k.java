package com.bumptech.glide.e;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.g.r;
import com.bumptech.glide.load.a.ae;
import com.bumptech.glide.load.a.af;
import com.bumptech.glide.load.a.aq;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.n;
import com.bumptech.glide.m;
import com.bumptech.glide.p;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements d, com.bumptech.glide.e.a.f, j {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f2859a = Log.isLoggable("GlideRequest", 2);

    /* renamed from: b, reason: collision with root package name */
    private final String f2860b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.g.a.i f2861c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2862d;

    /* renamed from: e, reason: collision with root package name */
    private final h f2863e;

    /* renamed from: f, reason: collision with root package name */
    private final f f2864f;

    /* renamed from: g, reason: collision with root package name */
    private final m f2865g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f2866h;

    /* renamed from: i, reason: collision with root package name */
    private final Class f2867i;

    /* renamed from: j, reason: collision with root package name */
    private final a f2868j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2869k;

    /* renamed from: l, reason: collision with root package name */
    private final int f2870l;
    private final p m;
    private final com.bumptech.glide.e.a.g n;
    private final List o;
    private final Executor p;
    private aw q;
    private ae r;
    private long s;
    private volatile af t;
    private int u;
    private int v;
    private boolean w;
    private RuntimeException x;
    private int y;

    private k(m mVar, Object obj, Object obj2, Class cls, a aVar, int i2, int i3, p pVar, com.bumptech.glide.e.a.g gVar, h hVar, List list, f fVar, af afVar, Executor executor) {
        this.f2860b = f2859a ? String.valueOf(System.identityHashCode(this)) : null;
        this.f2861c = com.bumptech.glide.g.a.i.a();
        this.f2862d = obj;
        this.f2865g = mVar;
        this.f2866h = obj2;
        this.f2867i = cls;
        this.f2868j = aVar;
        this.f2869k = i2;
        this.f2870l = i3;
        this.m = pVar;
        this.n = gVar;
        this.f2863e = hVar;
        this.o = list;
        this.f2864f = fVar;
        this.t = afVar;
        this.p = executor;
        this.y = 1;
        if (this.x == null && mVar.b().b(com.bumptech.glide.f.class)) {
            this.x = new RuntimeException("Glide request origin trace");
        }
    }

    public static k h(m mVar, Object obj, Object obj2, Class cls, a aVar, int i2, int i3, p pVar, com.bumptech.glide.e.a.g gVar, h hVar, List list, f fVar, af afVar, Executor executor) {
        return new k(mVar, obj, obj2, cls, aVar, i2, i3, pVar, gVar, hVar, list, fVar, afVar, executor);
    }

    private static int i(int i2, float f2) {
        if (i2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f2 * i2);
    }

    private final void j() {
        if (this.w) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void p(String str) {
        Log.v("GlideRequest", str + " this: " + this.f2860b);
    }

    private final boolean q() {
        f fVar = this.f2864f;
        return fVar == null || fVar.i(this);
    }

    private final void r() {
        f fVar = this.f2864f;
        if (fVar != null) {
            fVar.a().k();
        }
    }

    private final void s(aq aqVar) {
        this.f2861c.c();
        synchronized (this.f2862d) {
            this.f2865g.a();
            Log.w("Glide", "Load failed for [" + String.valueOf(this.f2866h) + "] with dimensions [" + this.u + "x" + this.v + "]", aqVar);
            List listA = aqVar.a();
            int size = listA.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                Log.i("Glide", "Root cause (" + i3 + " of " + size + ")", (Throwable) listA.get(i2));
                i2 = i3;
            }
            this.r = null;
            this.y = 5;
            f fVar = this.f2864f;
            if (fVar != null) {
                fVar.d(this);
            }
            this.w = true;
            try {
                List<h> list = this.o;
                if (list != null) {
                    for (h hVar : list) {
                        r();
                        hVar.j(aqVar);
                    }
                }
                h hVar2 = this.f2863e;
                if (hVar2 != null) {
                    r();
                    hVar2.j(aqVar);
                }
                if (q()) {
                    this.n.l();
                }
            } finally {
                this.w = false;
            }
        }
    }

    @Override // com.bumptech.glide.e.j
    public final Object a() {
        this.f2861c.c();
        return this.f2862d;
    }

    @Override // com.bumptech.glide.e.d
    public final void b() {
        synchronized (this.f2862d) {
            j();
            this.f2861c.c();
            int i2 = com.bumptech.glide.g.k.f2906a;
            this.s = SystemClock.elapsedRealtimeNanos();
            if (this.f2866h == null) {
                int i3 = this.f2869k;
                int i4 = this.f2870l;
                if (r.o(i3, i4)) {
                    this.u = i3;
                    this.v = i4;
                }
                s(new aq("Received null model"));
                return;
            }
            int i5 = this.y;
            if (i5 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i5 == 4) {
                e(this.q, 5);
                return;
            }
            List<h> list = this.o;
            if (list != null) {
                for (h hVar : list) {
                    if (hVar instanceof c) {
                        throw null;
                    }
                }
            }
            this.y = 3;
            int i6 = this.f2869k;
            int i7 = this.f2870l;
            if (r.o(i6, i7)) {
                g(i6, i7);
            } else {
                this.n.d(this);
            }
            int i8 = this.y;
            if ((i8 == 2 || i8 == 3) && q()) {
                this.n.m();
            }
            if (f2859a) {
                p("finished run method in " + com.bumptech.glide.g.k.a(this.s));
            }
        }
    }

    @Override // com.bumptech.glide.e.d
    public final void c() {
        synchronized (this.f2862d) {
            j();
            com.bumptech.glide.g.a.i iVar = this.f2861c;
            iVar.c();
            if (this.y == 6) {
                return;
            }
            j();
            iVar.c();
            com.bumptech.glide.e.a.g gVar = this.n;
            gVar.e(this);
            ae aeVar = this.r;
            aw awVar = null;
            if (aeVar != null) {
                aeVar.a();
                this.r = null;
            }
            aw awVar2 = this.q;
            if (awVar2 != null) {
                this.q = null;
                awVar = awVar2;
            }
            f fVar = this.f2864f;
            if (fVar == null || fVar.h(this)) {
                gVar.c();
            }
            this.y = 6;
            if (awVar != null) {
                this.t.e(awVar);
            }
        }
    }

    @Override // com.bumptech.glide.e.j
    public final void d(aq aqVar) {
        s(aqVar);
    }

    @Override // com.bumptech.glide.e.j
    public final void e(aw awVar, int i2) throws Throwable {
        Throwable th;
        boolean zA;
        this.f2861c.c();
        aw awVar2 = null;
        try {
            try {
                synchronized (this.f2862d) {
                    try {
                        this.r = null;
                        if (awVar == null) {
                            d(new aq("Expected to receive a Resource<R> with an object of " + String.valueOf(this.f2867i) + " inside, but instead got null."));
                            return;
                        }
                        Object objC = awVar.c();
                        if (objC == null || !this.f2867i.isAssignableFrom(objC.getClass())) {
                            this.q = null;
                            d(new aq("Expected to receive an object of " + String.valueOf(this.f2867i) + " but instead got " + String.valueOf(objC != null ? objC.getClass() : "") + "{" + String.valueOf(objC) + "} inside Resource{" + awVar.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        } else {
                            f fVar = this.f2864f;
                            if (fVar == null || fVar.j(this)) {
                                r();
                                this.y = 4;
                                this.q = awVar;
                                if (this.f2865g.a() <= 3) {
                                    Log.d("Glide", "Finished loading " + objC.getClass().getSimpleName() + " from " + n.p(i2) + " for " + String.valueOf(this.f2866h) + " with size [" + this.u + "x" + this.v + "] in " + com.bumptech.glide.g.k.a(this.s) + " ms");
                                }
                                if (fVar != null) {
                                    fVar.e(this);
                                }
                                this.w = true;
                                try {
                                    List<h> list = this.o;
                                    if (list != null) {
                                        zA = false;
                                        for (h hVar : list) {
                                            hVar.k(objC);
                                            if (hVar instanceof c) {
                                                zA |= ((c) hVar).a();
                                            }
                                        }
                                    } else {
                                        zA = false;
                                    }
                                    h hVar2 = this.f2863e;
                                    if (hVar2 != null) {
                                        hVar2.k(objC);
                                    }
                                    if (!zA) {
                                        this.n.b(objC);
                                    }
                                    return;
                                } finally {
                                    this.w = false;
                                }
                            }
                            this.q = null;
                            this.y = 4;
                        }
                        this.t.e(awVar);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        awVar = null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            throw th;
        } catch (Throwable th5) {
            th = th5;
            awVar2 = awVar;
            if (awVar2 == null) {
                throw th;
            }
            this.t.e(awVar2);
            throw th;
        }
    }

    @Override // com.bumptech.glide.e.d
    public final void f() {
        synchronized (this.f2862d) {
            if (o()) {
                c();
            }
        }
    }

    @Override // com.bumptech.glide.e.a.f
    public final void g(int i2, int i3) throws Throwable {
        Object obj;
        boolean z;
        this.f2861c.c();
        Object obj2 = this.f2862d;
        synchronized (obj2) {
            try {
                try {
                    boolean z2 = f2859a;
                    if (z2) {
                        p("Got onSizeReady in " + com.bumptech.glide.g.k.a(this.s));
                    }
                    if (this.y != 3) {
                        return;
                    }
                    this.y = 2;
                    a aVar = this.f2868j;
                    float fN = aVar.n();
                    this.u = i(i2, fN);
                    this.v = i(i3, fN);
                    if (z2) {
                        p("finished setup for calling load in " + com.bumptech.glide.g.k.a(this.s));
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = z;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        this.r = this.t.f(this.f2865g, this.f2866h, aVar.r(), this.u, this.v, aVar.L(), this.f2867i, this.m, aVar.t(), aVar.M(), aVar.W(), aVar.T(), aVar.s(), aVar.R(), aVar.N(), this, this.p);
                                        if (this.y != 2) {
                                            this.r = null;
                                        }
                                        if (z3) {
                                            p("finished onSizeReady in " + com.bumptech.glide.g.k.a(this.s));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        obj = obj2;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = obj2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj = obj2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        obj = obj2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    @Override // com.bumptech.glide.e.d
    public final boolean k() {
        boolean z;
        synchronized (this.f2862d) {
            z = this.y == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean l() {
        boolean z;
        synchronized (this.f2862d) {
            z = this.y == 6;
        }
        return z;
    }

    @Override // com.bumptech.glide.e.d
    public final boolean m() {
        boolean z;
        synchronized (this.f2862d) {
            z = this.y == 4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // com.bumptech.glide.e.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(com.bumptech.glide.e.d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.bumptech.glide.e.k
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r14.f2862d
            monitor-enter(r0)
            int r2 = r14.f2869k     // Catch: java.lang.Throwable -> L74
            int r3 = r14.f2870l     // Catch: java.lang.Throwable -> L74
            java.lang.Object r4 = r14.f2866h     // Catch: java.lang.Throwable -> L74
            java.lang.Class r5 = r14.f2867i     // Catch: java.lang.Throwable -> L74
            com.bumptech.glide.e.a r6 = r14.f2868j     // Catch: java.lang.Throwable -> L74
            com.bumptech.glide.p r7 = r14.m     // Catch: java.lang.Throwable -> L74
            java.util.List r14 = r14.o     // Catch: java.lang.Throwable -> L74
            if (r14 == 0) goto L1e
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L74
            goto L1f
        L1e:
            r14 = r1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            com.bumptech.glide.e.k r15 = (com.bumptech.glide.e.k) r15
            java.lang.Object r8 = r15.f2862d
            monitor-enter(r8)
            int r0 = r15.f2869k     // Catch: java.lang.Throwable -> L71
            int r9 = r15.f2870l     // Catch: java.lang.Throwable -> L71
            java.lang.Object r10 = r15.f2866h     // Catch: java.lang.Throwable -> L71
            java.lang.Class r11 = r15.f2867i     // Catch: java.lang.Throwable -> L71
            com.bumptech.glide.e.a r12 = r15.f2868j     // Catch: java.lang.Throwable -> L71
            com.bumptech.glide.p r13 = r15.m     // Catch: java.lang.Throwable -> L71
            java.util.List r15 = r15.o     // Catch: java.lang.Throwable -> L71
            if (r15 == 0) goto L3a
            int r15 = r15.size()     // Catch: java.lang.Throwable -> L71
            goto L3b
        L3a:
            r15 = r1
        L3b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L71
            if (r2 != r0) goto L70
            if (r3 != r9) goto L70
            int r0 = com.bumptech.glide.g.r.f2918a
            if (r4 != 0) goto L47
            if (r10 != 0) goto L70
            goto L58
        L47:
            boolean r0 = r4 instanceof com.bumptech.glide.load.b.aa
            if (r0 == 0) goto L52
            com.bumptech.glide.load.b.aa r4 = (com.bumptech.glide.load.b.aa) r4
            boolean r0 = r4.a()
            goto L56
        L52:
            boolean r0 = r4.equals(r10)
        L56:
            if (r0 == 0) goto L70
        L58:
            boolean r0 = r5.equals(r11)
            if (r0 == 0) goto L70
            if (r6 != 0) goto L63
            if (r12 != 0) goto L70
            goto L6a
        L63:
            boolean r0 = r6.Q(r12)
            if (r0 != 0) goto L6a
            goto L70
        L6a:
            if (r7 != r13) goto L70
            if (r14 != r15) goto L70
            r14 = 1
            return r14
        L70:
            return r1
        L71:
            r14 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L71
            throw r14
        L74:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.k.n(com.bumptech.glide.e.d):boolean");
    }

    @Override // com.bumptech.glide.e.d
    public final boolean o() {
        boolean z;
        synchronized (this.f2862d) {
            int i2 = this.y;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f2862d) {
            obj = this.f2866h;
            cls = this.f2867i;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + String.valueOf(cls) + "]";
    }
}
