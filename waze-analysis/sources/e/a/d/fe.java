package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fe extends e.a.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fl f46922a;

    fe(fl flVar) {
        Objects.requireNonNull(flVar);
        this.f46922a = flVar;
    }

    @Override // e.a.i
    public final e.a.k a(e.a.cq cqVar, e.a.h hVar) {
        fp fpVar = this.f46922a.f46934a;
        ae aeVar = new ae(cqVar, fp.L(fpVar, hVar), hVar, fpVar.ae, fpVar.O ? null : fpVar.p.c(), fpVar.R);
        aeVar.r(fpVar.w);
        aeVar.q(fpVar.x);
        return aeVar;
    }

    @Override // e.a.i
    public final String b() {
        return this.f46922a.f46936c;
    }
}
