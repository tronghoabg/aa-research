package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fk extends bh {

    /* renamed from: a, reason: collision with root package name */
    final e.a.ac f46929a;

    /* renamed from: b, reason: collision with root package name */
    final e.a.cq f46930b;

    /* renamed from: c, reason: collision with root package name */
    final e.a.h f46931c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fl f46932d;

    /* renamed from: e, reason: collision with root package name */
    private final long f46933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fk(fl flVar, e.a.ac acVar, e.a.cq cqVar, e.a.h hVar) {
        super(fp.L(flVar.f46934a, hVar), flVar.f46934a.q, hVar.l());
        Objects.requireNonNull(flVar);
        this.f46932d = flVar;
        this.f46929a = acVar;
        this.f46930b = cqVar;
        this.f46931c = hVar;
        this.f46933e = System.nanoTime();
    }

    @Override // e.a.d.bh
    protected final void l() {
        this.f46932d.f46934a.f46951d.execute(new fj(this));
    }

    final void o() {
        e.a.ac acVarA = this.f46929a.a();
        try {
            e.a.k kVarH = this.f46932d.h(this.f46930b, this.f46931c.i(e.a.p.f47843a, Long.valueOf(System.nanoTime() - this.f46933e)));
            this.f46929a.b(acVarA);
            Runnable runnableH = h(kVarH);
            fl flVar = this.f46932d;
            if (runnableH == null) {
                flVar.f46934a.f46951d.execute(new fj(this));
            } else {
                fp.L(flVar.f46934a, this.f46931c).execute(new fi(this, runnableH));
            }
        } catch (Throwable th) {
            this.f46929a.b(acVarA);
            throw th;
        }
    }
}
