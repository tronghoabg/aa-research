package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dx extends cw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f46834a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dy f46835b;

    dx(dy dyVar, ah ahVar) {
        this.f46834a = ahVar;
        Objects.requireNonNull(dyVar);
        this.f46835b = dyVar;
    }

    @Override // e.a.d.cw
    protected final ah a() {
        return this.f46834a;
    }

    @Override // e.a.d.cw, e.a.d.ah
    public final void c(e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        this.f46835b.f46837b.f46839b.a(eeVar.l());
        this.f46834a.c(eeVar, agVar, cmVar);
    }
}
