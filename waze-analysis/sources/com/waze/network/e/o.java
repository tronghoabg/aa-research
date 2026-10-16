package com.waze.network.e;

import h.g.b.x;
import okhttp3.ac;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements ac {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.g.d f32261a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32262b;

    public o(com.waze.g.d dVar, com.waze.shared_infra.i.e eVar) {
        x.f(dVar, "applicationInfoRepository");
        x.f(eVar, "logger");
        this.f32261a = dVar;
        this.f32262b = eVar;
    }

    @Override // okhttp3.ac
    public final aq c(okhttp3.internal.d.g gVar) {
        x.f(gVar, "chain");
        aq aqVarG = gVar.g(gVar.f());
        String strB = aqVarG.g().b("x-waze-stealth-mode-activated");
        if (strB != null && x.n(h.n.o.t(strB), true)) {
            this.f32262b.a("stealth header has been found");
            this.f32261a.g();
        }
        return aqVarG;
    }
}
