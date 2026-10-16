package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class go extends e.a.d {

    /* renamed from: a, reason: collision with root package name */
    boolean f47043a;

    /* renamed from: b, reason: collision with root package name */
    ce f47044b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f47045c;

    /* renamed from: d, reason: collision with root package name */
    private final e.a.cq f47046d;

    /* renamed from: e, reason: collision with root package name */
    private final e.a.cm f47047e;

    /* renamed from: f, reason: collision with root package name */
    private final e.a.h f47048f;

    /* renamed from: h, reason: collision with root package name */
    private final gn f47050h;

    /* renamed from: i, reason: collision with root package name */
    private final e.a.p[] f47051i;

    /* renamed from: k, reason: collision with root package name */
    private af f47053k;

    /* renamed from: j, reason: collision with root package name */
    private final Object f47052j = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final e.a.ac f47049g = e.a.ac.g();

    go(aj ajVar, e.a.cq cqVar, e.a.cm cmVar, e.a.h hVar, gn gnVar, e.a.p[] pVarArr) {
        this.f47045c = ajVar;
        this.f47046d = cqVar;
        this.f47047e = cmVar;
        this.f47048f = hVar;
        this.f47050h = gnVar;
        this.f47051i = pVarArr;
    }

    private final void d(af afVar) {
        boolean z;
        com.google.d.b.an.v(!this.f47043a, "already finalized");
        this.f47043a = true;
        synchronized (this.f47052j) {
            if (this.f47053k == null) {
                this.f47053k = afVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f47050h.a();
            return;
        }
        com.google.d.b.an.v(this.f47044b != null, "delayedStream is null");
        Runnable runnableU = this.f47044b.u(afVar);
        if (runnableU != null) {
            runnableU.run();
        }
        this.f47050h.a();
    }

    @Override // e.a.d
    public final void a(e.a.cm cmVar) {
        com.google.d.b.an.v(!this.f47043a, "apply() or fail() already called");
        e.a.cm cmVar2 = this.f47047e;
        cmVar2.h(cmVar);
        e.a.ac acVarA = this.f47049g.a();
        try {
            af afVarB = this.f47045c.b(this.f47046d, cmVar2, this.f47048f, this.f47051i);
            this.f47049g.b(acVarA);
            d(afVarB);
        } catch (Throwable th) {
            this.f47049g.b(acVarA);
            throw th;
        }
    }

    @Override // e.a.d
    public final void b(e.a.ee eeVar) {
        com.google.d.b.an.m(!eeVar.l(), "Cannot fail with OK status");
        com.google.d.b.an.v(!this.f47043a, "apply() or fail() already called");
        d(new cr(dh.b(eeVar), this.f47051i));
    }

    final af c() {
        synchronized (this.f47052j) {
            af afVar = this.f47053k;
            if (afVar != null) {
                return afVar;
            }
            ce ceVar = new ce("call_credentials");
            this.f47044b = ceVar;
            this.f47053k = ceVar;
            return ceVar;
        }
    }
}
