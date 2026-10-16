package com.waze.network.b;

import com.waze.gk;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class au implements al {

    /* renamed from: a, reason: collision with root package name */
    private final ch f31964a;

    public au(com.waze.network.z zVar, com.waze.network.f.ag agVar, gk gkVar, kotlinx.coroutines.af afVar) {
        h.g.b.x.f(zVar, "networkEventManager");
        h.g.b.x.f(agVar, "sessionTokenRepository");
        h.g.b.x.f(gkVar, "nativeInitStatusProvider");
        h.g.b.x.f(afVar, "scope");
        kotlinx.coroutines.b.k kVarX = kotlinx.coroutines.b.ai.x(new aq(kotlinx.coroutines.b.ai.L(kotlinx.coroutines.b.ai.r(new aq(zVar.c(), 0), new aq(agVar.d(), 2), new aq(agVar.e(), 3), new am(null)), new an(gkVar, (h.c.e) null, 0)), 4), new com.waze.navigate.location_preview.q(3));
        int i2 = bz.f51630a;
        this.f31964a = kotlinx.coroutines.b.ai.V(kVarX, afVar, by.b(), ai.f31939a);
    }

    @Override // com.waze.network.b.al
    public final ch a() {
        return this.f31964a;
    }
}
