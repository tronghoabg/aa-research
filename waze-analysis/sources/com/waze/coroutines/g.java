package com.waze.coroutines;

import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f23187a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f23188b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23189c;

    public g(c cVar, ab abVar, com.waze.shared_infra.i.e eVar) {
        x.f(cVar, "parameters");
        x.f(abVar, "detectorDispatcher");
        x.f(eVar, "logger");
        this.f23187a = cVar;
        this.f23188b = abVar;
        this.f23189c = eVar;
    }

    public final br b(h.g.a.l lVar) {
        x.f(lVar, "onNoneResponsivenessDetected");
        c cVar = this.f23187a;
        this.f23189c.a("starting thread responsiveness detector for thread `" + cVar.d().getName() + "` cycle " + h.o.a.y(cVar.b()) + " initial-delay " + h.o.a.y(cVar.c()));
        return aj.z(aj.e(this.f23188b), null, null, new f(cVar, this, lVar, null), 3);
    }
}
