package com.waze.map.opengl;

import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends com.waze.bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f29551a;

    /* renamed from: b, reason: collision with root package name */
    private br f29552b;

    public /* synthetic */ l() {
        kotlinx.coroutines.af afVarF = aj.f();
        h.g.b.x.f(afVarF, "scope");
        this.f29551a = afVarF;
    }

    public final void a() {
        d(60);
        br brVar = this.f29552b;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f29552b = aj.z(this.f29551a, null, null, new ag(this, (h.c.e) null, 1), 3);
    }
}
