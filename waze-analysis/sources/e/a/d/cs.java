package e.a.d;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cs implements aj {

    /* renamed from: a, reason: collision with root package name */
    final e.a.ee f46767a;

    /* renamed from: b, reason: collision with root package name */
    private final ag f46768b;

    cs(e.a.ee eeVar, ag agVar) {
        com.google.d.b.an.m(!eeVar.l(), "error must not be OK");
        this.f46767a = eeVar;
        this.f46768b = agVar;
    }

    @Override // e.a.d.aj
    public final af b(e.a.cq cqVar, e.a.cm cmVar, e.a.h hVar, e.a.p[] pVarArr) {
        return new cr(this.f46767a, this.f46768b, pVarArr);
    }

    @Override // e.a.be
    public final e.a.az c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // e.a.d.aj
    public final void r(ai aiVar, Executor executor) {
        throw null;
    }
}
