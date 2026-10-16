package com.waze.car_lib.a;

import com.waze.modules.navigation.at;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends com.waze.shared_infra.coordinators.s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(af afVar) {
        super(k.f18838a, afVar);
        h.g.b.x.f(afVar, "scope");
    }

    public final void a() {
        H(f.f18832a);
    }

    public final void b(com.waze.av.b.n nVar, at atVar) {
        h.g.b.x.f(nVar, "place");
        H(new g(nVar, atVar));
    }

    public final void c(String str) {
        h.g.b.x.f(str, "adId");
        H(new i(str));
    }
}
