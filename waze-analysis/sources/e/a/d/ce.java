package e.a.d;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class ce implements af {

    /* renamed from: a, reason: collision with root package name */
    private final String f46727a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f46728b;

    /* renamed from: c, reason: collision with root package name */
    private ah f46729c;

    /* renamed from: d, reason: collision with root package name */
    private af f46730d;

    /* renamed from: e, reason: collision with root package name */
    private e.a.ee f46731e;

    /* renamed from: g, reason: collision with root package name */
    private cd f46733g;

    /* renamed from: h, reason: collision with root package name */
    private long f46734h;

    /* renamed from: i, reason: collision with root package name */
    private long f46735i;

    /* renamed from: f, reason: collision with root package name */
    private List f46732f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List f46736j = new ArrayList();

    public ce(String str) {
        this.f46727a = str;
    }

    private final void p(Runnable runnable) {
        com.google.d.b.an.v(this.f46729c != null, "May only be called after start");
        synchronized (this) {
            if (this.f46728b) {
                runnable.run();
            } else {
                this.f46732f.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f46732f     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f46732f = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f46728b = r0     // Catch: java.lang.Throwable -> L3b
            e.a.d.cd r0 = r3.f46733g     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.b()
        L1c:
            return
        L1d:
            java.util.List r1 = r3.f46732f     // Catch: java.lang.Throwable -> L3b
            r3.f46732f = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.ce.q():void");
    }

    private final void r(ah ahVar) {
        Iterator it = this.f46736j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f46736j = null;
        this.f46730d.m(ahVar);
    }

    private final void w(af afVar) {
        af afVar2 = this.f46730d;
        com.google.d.b.an.y(afVar2 == null, "realStream already set to %s", afVar2);
        this.f46730d = afVar;
        this.f46735i = System.nanoTime();
    }

    @Override // e.a.d.af
    public final e.a.c a() {
        throw null;
    }

    @Override // e.a.d.af
    public void b(dn dnVar) {
        synchronized (this) {
            if (this.f46729c == null) {
                return;
            }
            af afVar = this.f46730d;
            String str = this.f46727a;
            if (afVar != null) {
                dnVar.b(str + "_delay", (this.f46735i - this.f46734h) + "ns");
                this.f46730d.b(dnVar);
            } else {
                dnVar.b(str + "_delay", (System.nanoTime() - this.f46734h) + "ns");
                dnVar.a("was_still_waiting");
            }
        }
    }

    @Override // e.a.d.af
    public void c(e.a.ee eeVar) {
        boolean z = true;
        com.google.d.b.an.v(this.f46729c != null, "May only be called after start");
        com.google.d.b.an.C(eeVar, "reason");
        synchronized (this) {
            if (this.f46730d == null) {
                w(gq.f47056a);
                this.f46731e = eeVar;
                z = false;
            }
        }
        if (z) {
            p(new bx(this, eeVar));
            return;
        }
        q();
        s();
        this.f46729c.c(eeVar, ag.f46605a, new e.a.cm());
    }

    @Override // e.a.d.ju
    public final void d() {
        com.google.d.b.an.v(this.f46729c != null, "May only be called after start");
        if (this.f46728b) {
            this.f46730d.d();
        } else {
            p(new bw(this));
        }
    }

    @Override // e.a.d.af
    public final void e() {
        com.google.d.b.an.v(this.f46729c != null, "May only be called after start");
        p(new by(this));
    }

    @Override // e.a.d.ju
    public final void f() {
        com.google.d.b.an.v(this.f46729c == null, "May only be called before start");
        this.f46736j.add(new bo(this));
    }

    @Override // e.a.d.ju
    public final void g(int i2) {
        com.google.d.b.an.v(this.f46729c != null, "May only be called after start");
        if (this.f46728b) {
            this.f46730d.g(i2);
        } else {
            p(new bn(this, i2));
        }
    }

    @Override // e.a.d.ju
    public final void h(e.a.s sVar) {
        com.google.d.b.an.v(this.f46729c == null, "May only be called before start");
        com.google.d.b.an.C(sVar, "compressor");
        this.f46736j.add(new bp(this, sVar));
    }

    @Override // e.a.d.af
    public final void i(e.a.ad adVar) {
        com.google.d.b.an.v(this.f46729c == null, "May only be called before start");
        this.f46736j.add(new bt(this, adVar));
    }

    @Override // e.a.d.af
    public final void j(e.a.ag agVar) {
        com.google.d.b.an.v(this.f46729c == null, "May only be called before start");
        com.google.d.b.an.C(agVar, "decompressorRegistry");
        this.f46736j.add(new bq(this, agVar));
    }

    @Override // e.a.d.af
    public final void k(int i2) {
        com.google.d.b.an.v(this.f46729c == null, "May only be called before start");
        this.f46736j.add(new br(this, i2));
    }

    @Override // e.a.d.af
    public final void l(int i2) {
        com.google.d.b.an.v(this.f46729c == null, "May only be called before start");
        this.f46736j.add(new bs(this, i2));
    }

    @Override // e.a.d.af
    public final void m(ah ahVar) {
        e.a.ee eeVar;
        boolean z;
        com.google.d.b.an.v(this.f46729c == null, "already started");
        synchronized (this) {
            eeVar = this.f46731e;
            z = this.f46728b;
            if (!z) {
                cd cdVar = new cd(ahVar);
                this.f46733g = cdVar;
                ahVar = cdVar;
            }
            this.f46729c = ahVar;
            this.f46734h = System.nanoTime();
        }
        if (eeVar != null) {
            ahVar.c(eeVar, ag.f46605a, new e.a.cm());
        } else if (z) {
            r(ahVar);
        }
    }

    @Override // e.a.d.ju
    public final void n(InputStream inputStream) {
        com.google.d.b.an.v(this.f46729c != null, "May only be called after start");
        if (this.f46728b) {
            this.f46730d.n(inputStream);
        } else {
            p(new bv(this, inputStream));
        }
    }

    @Override // e.a.d.ju
    public final boolean o() {
        if (this.f46728b) {
            return this.f46730d.o();
        }
        return false;
    }

    protected void s() {
    }

    final Runnable u(af afVar) {
        synchronized (this) {
            if (this.f46730d == null) {
                com.google.d.b.an.C(afVar, "stream");
                w(afVar);
                ah ahVar = this.f46729c;
                if (ahVar == null) {
                    this.f46732f = null;
                    this.f46728b = true;
                }
                if (ahVar != null) {
                    r(ahVar);
                    return new bu(this);
                }
            }
        }
        return null;
    }
}
