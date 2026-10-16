package e.a.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bm implements ge {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f46681c;

    /* renamed from: d, reason: collision with root package name */
    private final e.a.el f46682d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f46683e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f46684f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f46685g;

    /* renamed from: h, reason: collision with root package name */
    private gd f46686h;

    /* renamed from: a, reason: collision with root package name */
    private final e.a.az f46679a = e.a.az.b(bm.class, null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f46680b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private Collection f46687i = new LinkedHashSet();

    /* renamed from: j, reason: collision with root package name */
    private volatile bl f46688j = new bl();

    bm(Executor executor, e.a.el elVar) {
        this.f46681c = executor;
        this.f46682d = elVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r3 = new e.a.d.bk(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0.a().t() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r4.g() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        ((e.a.d.bk) r3).f46676e = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r2.f46687i.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r4 = r2.f46687i.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [e.a.d.af] */
    /* JADX WARN: Type inference failed for: r3v4, types: [e.a.d.cr] */
    /* JADX WARN: Type inference failed for: r3v5, types: [e.a.d.af] */
    /* JADX WARN: Type inference failed for: r3v7, types: [e.a.d.bk, java.lang.Object] */
    @Override // e.a.d.aj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e.a.d.af b(e.a.cq r3, e.a.cm r4, e.a.h r5, e.a.p[] r6) {
        /*
            r2 = this;
            e.a.bo r0 = new e.a.bo     // Catch: java.lang.Throwable -> L8f
            e.a.d.gs r1 = new e.a.d.gs     // Catch: java.lang.Throwable -> L8f
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L8f
            e.a.d.bl r3 = r2.f46688j     // Catch: java.lang.Throwable -> L8f
        Lc:
            e.a.ee r4 = r3.f46678b     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L16
            e.a.d.cr r3 = new e.a.d.cr     // Catch: java.lang.Throwable -> L8f
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L8f
            goto L80
        L16:
            e.a.br r4 = r3.f46677a     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L39
            e.a.bn r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L8f
            e.a.h r5 = r0.a()     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r5.t()     // Catch: java.lang.Throwable -> L8f
            e.a.d.aj r1 = e.a.d.dh.c(r4, r1)     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L3a
            e.a.cq r3 = r0.c()     // Catch: java.lang.Throwable -> L8f
            e.a.cm r4 = r0.b()     // Catch: java.lang.Throwable -> L8f
            e.a.d.af r3 = r1.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8f
            goto L80
        L39:
            r4 = 0
        L3a:
            java.lang.Object r5 = r2.f46680b     // Catch: java.lang.Throwable -> L8f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L8f
            e.a.d.bl r1 = r2.f46688j     // Catch: java.lang.Throwable -> L8c
            if (r3 != r1) goto L89
            e.a.d.bk r3 = new e.a.d.bk     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L8c
            e.a.h r0 = r0.a()     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.t()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L5f
            if (r4 == 0) goto L5f
            boolean r0 = r4.g()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L5f
            e.a.ee r4 = r4.f()     // Catch: java.lang.Throwable -> L8c
            e.a.d.bk.q(r3, r4)     // Catch: java.lang.Throwable -> L8c
        L5f:
            java.util.Collection r4 = r2.f46687i     // Catch: java.lang.Throwable -> L8c
            r4.add(r3)     // Catch: java.lang.Throwable -> L8c
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L8c
            java.util.Collection r4 = r2.f46687i     // Catch: java.lang.Throwable -> L86
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
            r0 = 1
            if (r4 != r0) goto L76
            e.a.el r4 = r2.f46682d     // Catch: java.lang.Throwable -> L8c
            java.lang.Runnable r0 = r2.f46683e     // Catch: java.lang.Throwable -> L8c
            r4.c(r0)     // Catch: java.lang.Throwable -> L8c
        L76:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L8c
            r0 = 0
        L78:
            if (r0 >= r4) goto L7f
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L8c
            int r0 = r0 + 1
            goto L78
        L7f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8c
        L80:
            e.a.el r2 = r2.f46682d
            r2.b()
            return r3
        L86:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L86
            throw r3     // Catch: java.lang.Throwable -> L8c
        L89:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8c
            r3 = r1
            goto Lc
        L8c:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8c
            throw r3     // Catch: java.lang.Throwable -> L8f
        L8f:
            r3 = move-exception
            e.a.el r2 = r2.f46682d
            r2.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.bm.b(e.a.cq, e.a.cm, e.a.h, e.a.p[]):e.a.d.af");
    }

    @Override // e.a.be
    public final e.a.az c() {
        return this.f46679a;
    }

    @Override // e.a.d.ge
    public final Runnable d(gd gdVar) {
        this.f46686h = gdVar;
        this.f46683e = new bi(this, gdVar, 0);
        this.f46684f = new bi(this, gdVar, 2, (byte[]) null);
        this.f46685g = new bi(this, gdVar, 3, (char[]) null);
        return null;
    }

    final void k(e.a.br brVar) {
        Runnable runnable;
        synchronized (this.f46680b) {
            this.f46688j = this.f46688j.a(brVar);
            if (brVar != null && l()) {
                ArrayList arrayList = new ArrayList(this.f46687i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bk bkVar = (bk) arrayList.get(i2);
                    e.a.bn bnVarA = brVar.a(bkVar.f46673b);
                    e.a.h hVarA = bkVar.f46673b.a();
                    if (hVarA.t() && bnVarA.g()) {
                        bkVar.f46676e = bnVarA.f();
                    }
                    aj ajVarC = dh.c(bnVarA, hVarA.t());
                    if (ajVarC != null) {
                        Executor executorS = this.f46681c;
                        if (hVarA.s() != null) {
                            executorS = hVarA.s();
                        }
                        Runnable runnableR = bk.r(bkVar, ajVarC);
                        if (runnableR != null) {
                            executorS.execute(runnableR);
                        }
                        arrayList2.add(bkVar);
                    }
                }
                synchronized (this.f46680b) {
                    if (l()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.f46687i.remove((bk) it.next());
                        }
                        if (this.f46687i.isEmpty()) {
                            this.f46687i = new LinkedHashSet();
                        }
                        if (!l()) {
                            e.a.el elVar = this.f46682d;
                            elVar.c(this.f46684f);
                            if (this.f46688j.f46678b != null && (runnable = this.f46685g) != null) {
                                elVar.c(runnable);
                                this.f46685g = null;
                            }
                        }
                        this.f46682d.b();
                    }
                }
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.f46680b) {
            z = !this.f46687i.isEmpty();
        }
        return z;
    }

    @Override // e.a.d.aj
    public final void r(ai aiVar, Executor executor) {
        throw null;
    }

    @Override // e.a.d.ge
    public final void t(e.a.ee eeVar) {
        Runnable runnable;
        synchronized (this.f46680b) {
            if (this.f46688j.f46678b != null) {
                return;
            }
            this.f46688j = this.f46688j.b(eeVar);
            e.a.el elVar = this.f46682d;
            elVar.c(new bj(this, eeVar));
            if (!l() && (runnable = this.f46685g) != null) {
                elVar.c(runnable);
                this.f46685g = null;
            }
            this.f46682d.b();
        }
    }
}
