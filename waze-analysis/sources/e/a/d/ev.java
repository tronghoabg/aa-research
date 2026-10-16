package e.a.d;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ev extends e.a.an {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.aw f46901a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.i f46902b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f46903c;

    /* renamed from: d, reason: collision with root package name */
    private final e.a.cq f46904d;

    /* renamed from: e, reason: collision with root package name */
    private final e.a.ac f46905e;

    /* renamed from: f, reason: collision with root package name */
    private e.a.h f46906f;

    /* renamed from: g, reason: collision with root package name */
    private e.a.k f46907g;

    ev(e.a.aw awVar, e.a.i iVar, Executor executor, e.a.cq cqVar, e.a.h hVar) {
        this.f46901a = awVar;
        this.f46902b = iVar;
        this.f46904d = cqVar;
        executor = hVar.s() != null ? hVar.s() : executor;
        this.f46903c = executor;
        this.f46906f = hVar.e(executor);
        this.f46905e = e.a.ac.g();
    }

    @Override // e.a.dj, e.a.k
    public final void a(String str, Throwable th) {
        e.a.k kVar = this.f46907g;
        if (kVar != null) {
            kVar.a(str, th);
        }
    }

    @Override // e.a.an, e.a.k
    public final void e(com.waze.uid.f fVar, e.a.cm cmVar) {
        e.a.cq cqVar = this.f46904d;
        new e.a.bo(cqVar, cmVar, this.f46906f, fp.f46949h);
        e.a.dx dxVarA = this.f46901a.a();
        e.a.ee eeVarH = dxVarA.h();
        if (!eeVarH.l()) {
            this.f46903c.execute(new eu(this, fVar, dh.b(eeVarH)));
            this.f46907g = fp.f46950i;
        } else {
            ga gaVarB = ((gc) dxVarA.i()).b(cqVar);
            if (gaVarB != null) {
                this.f46906f = this.f46906f.i(ga.f46995a, gaVarB);
            }
            e.a.k kVarA = this.f46902b.a(cqVar, this.f46906f);
            this.f46907g = kVarA;
            kVarA.e(fVar, cmVar);
        }
    }

    @Override // e.a.an, e.a.dj
    protected final e.a.k j() {
        return this.f46907g;
    }
}
