package com.waze;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class at implements ar {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f15645a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f15646b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f15647c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f15648d;

    public at(NativeManager nativeManager, h.c.j jVar) {
        h.g.b.x.f(nativeManager, "nativeManager");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f15645a = nativeManager;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar);
        this.f15646b = afVarE;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(h.a.i.h());
        this.f15647c = bnVarB;
        kotlinx.coroutines.b.k kVarL = kotlinx.coroutines.b.ai.L(bnVarB, new iy(this, (h.c.e) null, 1));
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f15648d = kotlinx.coroutines.b.ai.V(kVarL, afVarE, kotlinx.coroutines.b.by.b(), bnVarB.d());
    }

    @Override // com.waze.ar
    public final kotlinx.coroutines.b.ch a() {
        return this.f15648d;
    }

    @Override // com.waze.ar
    public final void b(String str, hr hrVar) {
        h.g.b.x.f(hrVar, "listener");
        this.f15645a.getTitle(str, hrVar);
    }

    @Override // com.waze.ar
    public final NativeManager.VenueCategory[] c() {
        return this.f15645a.venueProviderGetCategories();
    }

    public final void g() {
        kotlinx.coroutines.aj.h(this.f15646b, null);
    }
}
