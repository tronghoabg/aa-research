package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lr implements lo {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f25459a;

    public lr(kotlinx.coroutines.af afVar, com.waze.navigate.en enVar, ac acVar, ao aoVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(acVar, "backgroundStateProvider");
        h.g.b.x.f(aoVar, "carManager");
        kotlinx.coroutines.b.k kVarR = kotlinx.coroutines.b.ai.r(enVar.ah(), cs.e(acVar), new dn(aoVar.a(), 6), new lp(null));
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f25459a = kotlinx.coroutines.b.ai.V(kVarR, afVar, kotlinx.coroutines.b.by.b(), x.f45518a);
    }

    @Override // com.waze.lo
    public final kotlinx.coroutines.b.ch a() {
        return this.f25459a;
    }
}
