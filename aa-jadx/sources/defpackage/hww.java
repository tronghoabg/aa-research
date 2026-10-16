package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hww implements defpackage.igl {
    public final defpackage.hwz b;
    public final defpackage.hwx c;
    public defpackage.hus d;
    public boolean e;
    public defpackage.hxg f;
    public boolean g;
    defpackage.hxc h;
    public boolean i;
    defpackage.hxa j;
    public volatile boolean k;
    int l;
    private final defpackage.dzr n;
    private final defpackage.hyn o;
    private final defpackage.hyn p;
    private final defpackage.hyn q;
    private boolean s;
    private defpackage.hwi t;
    final defpackage.hwv a = new defpackage.hwv(new java.util.ArrayList(2));
    public final defpackage.ssm m = new defpackage.ssm();
    private final java.util.concurrent.atomic.AtomicInteger r = new java.util.concurrent.atomic.AtomicInteger();

    public hww(defpackage.hyn hynVar, defpackage.hyn hynVar2, defpackage.hyn hynVar3, defpackage.hwx hwxVar, defpackage.hwz hwzVar, defpackage.dzr dzrVar) {
        this.o = hynVar;
        this.p = hynVar2;
        this.q = hynVar3;
        this.c = hwxVar;
        this.b = hwzVar;
        this.n = dzrVar;
    }

    private final boolean j() {
        return this.i || this.g || this.k;
    }

    public final defpackage.hyn a() {
        return this.s ? this.q : this.p;
    }

    public final synchronized void b(defpackage.iet ietVar, java.util.concurrent.Executor executor) {
        this.m.a();
        this.a.a.add(new defpackage.hwu(ietVar, executor));
        if (this.g) {
            d(1);
            executor.execute(new defpackage.hwt(this, ietVar, 0));
        } else if (!this.i) {
            defpackage.fyh.f(!this.k, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            d(1);
            executor.execute(new defpackage.hwt(this, ietVar, 1));
        }
    }

    final void c() {
        defpackage.hxa hxaVar;
        synchronized (this) {
            this.m.a();
            defpackage.fyh.f(j(), "Not yet complete!");
            int iDecrementAndGet = this.r.decrementAndGet();
            defpackage.fyh.f(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                hxaVar = this.j;
                e();
            } else {
                hxaVar = null;
            }
        }
        if (hxaVar != null) {
            hxaVar.f();
        }
    }

    final synchronized void d(int i) {
        defpackage.hxa hxaVar;
        defpackage.fyh.f(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (hxaVar = this.j) == null) {
            return;
        }
        hxaVar.d();
    }

    public final synchronized void e() {
        if (this.d == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a.a.clear();
        this.d = null;
        this.j = null;
        this.f = null;
        this.i = false;
        this.k = false;
        this.g = false;
        defpackage.hwi hwiVar = this.t;
        if (hwiVar.t.d()) {
            hwiVar.a();
        }
        this.t = null;
        this.h = null;
        this.l = 0;
        this.n.b(this);
    }

    @Override // defpackage.igl
    public final defpackage.ssm f() {
        return this.m;
    }

    public final synchronized void g(defpackage.iet ietVar) {
        this.m.a();
        defpackage.hwu hwuVar = new defpackage.hwu(ietVar, defpackage.ify.b);
        defpackage.hwv hwvVar = this.a;
        hwvVar.a.remove(hwuVar);
        if (hwvVar.d()) {
            if (!j()) {
                this.k = true;
                defpackage.hwi hwiVar = this.t;
                hwiVar.o = true;
                defpackage.hwg hwgVar = hwiVar.n;
                if (hwgVar != null) {
                    hwgVar.a();
                }
                this.c.b(this, this.d);
            }
            if ((this.g || this.i) && this.r.get() == 0) {
                e();
            }
        }
    }

    public final synchronized void h(defpackage.hwi hwiVar) {
        this.t = hwiVar;
        int iB = hwiVar.b(1);
        ((iB == 2 || iB == 3) ? this.o : a()).execute(hwiVar);
    }

    public final synchronized void i(defpackage.hus husVar, boolean z, boolean z2) {
        this.d = husVar;
        this.e = z;
        this.s = z2;
    }
}
