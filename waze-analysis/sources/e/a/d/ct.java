package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ct extends e.a.bt {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ cu f46769f;

    /* renamed from: g, reason: collision with root package name */
    private final e.a.bl f46770g;

    public ct(cu cuVar, e.a.bl blVar) {
        Objects.requireNonNull(cuVar);
        this.f46769f = cuVar;
        this.f46770g = (e.a.bl) Objects.requireNonNull(blVar, "helper");
    }

    @Override // e.a.bt
    public final e.a.ee a(e.a.bp bpVar) {
        cu cuVar = this.f46769f;
        this.f46770g.f(cuVar.f46771a, cuVar.f46772b);
        return cuVar.f46773c;
    }

    @Override // e.a.bt
    public final void b(e.a.ee eeVar) {
        cu cuVar = this.f46769f;
        this.f46770g.f(cuVar.f46771a, cuVar.f46772b);
    }

    @Override // e.a.bt
    public final void d() {
    }
}
