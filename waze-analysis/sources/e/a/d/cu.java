package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cu extends e.a.bv {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.w f46771a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.br f46772b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.ee f46773c;

    public cu(e.a.w wVar, e.a.br brVar, e.a.ee eeVar) {
        this.f46771a = (e.a.w) Objects.requireNonNull(wVar, "state");
        this.f46772b = (e.a.br) Objects.requireNonNull(brVar, "picker");
        this.f46773c = (e.a.ee) Objects.requireNonNull(eeVar, "acceptAddressesStatus");
    }

    @Override // e.a.bj
    public final e.a.bt a(e.a.bl blVar) {
        return new ct(this, blVar);
    }

    @Override // e.a.bv
    public final String c() {
        return "fixed_picker_lb_internal";
    }

    @Override // e.a.bv
    public final void d() {
    }

    @Override // e.a.bv
    public final void e() {
    }
}
