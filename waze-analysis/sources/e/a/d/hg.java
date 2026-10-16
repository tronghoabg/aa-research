package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hg implements e.a.bs {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.bq f47087a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hk f47088b;

    hg(hk hkVar, e.a.bq bqVar) {
        this.f47087a = bqVar;
        Objects.requireNonNull(hkVar);
        this.f47088b = hkVar;
    }

    @Override // e.a.bs
    public final void a(e.a.x xVar) {
        hk.f(this.f47088b, this.f47087a, xVar);
    }
}
