package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ch extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f19455a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bq f19456b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(kotlinx.coroutines.af afVar, com.waze.car_lib.r.k kVar) {
        super(h.ab.f48028a, afVar);
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "viewModel");
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.f19455a = bmVarE;
        this.f19456b = kotlinx.coroutines.b.ai.S(bmVarE);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kVar.d(), new ce(afVar, this, null, 1, null)), afVar);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kVar.c(), new ce(afVar, this, null, 0)), afVar);
    }

    public final kotlinx.coroutines.b.bq b() {
        return this.f19456b;
    }
}
