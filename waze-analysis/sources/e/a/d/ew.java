package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ew implements gd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f46908a;

    /* synthetic */ ew(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.f46908a = fpVar;
    }

    @Override // e.a.d.gd
    public final void a(boolean z) {
        fp fpVar = this.f46908a;
        fpVar.f46952e.c(fpVar.K, z);
        if (z) {
            fpVar.U();
        }
    }

    @Override // e.a.d.gd
    public final void b() {
    }

    @Override // e.a.d.gd
    public final void c(e.a.ee eeVar, cf cfVar) {
        com.google.d.b.an.v(this.f46908a.M.get(), "Channel must have been shut down");
    }

    @Override // e.a.d.gd
    public final void d() {
        fp fpVar = this.f46908a;
        com.google.d.b.an.v(fpVar.M.get(), "Channel must have been shut down");
        fpVar.N = true;
        fpVar.am(false);
        fp.Q(fpVar);
    }

    @Override // e.a.d.gd
    public final void h() {
    }
}
