package com.waze.map.canvas;

import com.waze.map.MapNativeManager;
import com.waze.map.cd;
import com.waze.map.dq;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class al implements u {

    /* renamed from: a, reason: collision with root package name */
    private final MapNativeManager f28525a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28526b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f28527c;

    /* renamed from: d, reason: collision with root package name */
    private final h.c.j f28528d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f28529e;

    public al(MapNativeManager mapNativeManager, com.waze.shared_infra.i.e eVar, Executor executor, h.c.j jVar, com.waze.shared_infra.q.e eVar2) {
        h.g.b.x.f(mapNativeManager, "mapNativeManager");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(executor, "nativeThreadExecutor");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(eVar2, "clock");
        this.f28525a = mapNativeManager;
        this.f28526b = eVar;
        this.f28527c = executor;
        this.f28528d = jVar;
        this.f28529e = eVar2;
    }

    @Override // com.waze.map.canvas.u
    public final MainCanvasDelegatorImpl a(kotlinx.coroutines.af afVar, kotlinx.coroutines.b.k kVar, ch chVar, cd cdVar, aw awVar, dq dqVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "geometry");
        h.g.b.x.f(chVar, "canvasState");
        h.g.b.x.f(cdVar, "viewportResolver");
        h.g.b.x.f(awVar, "swapFactory");
        h.g.b.x.f(dqVar, "touchNotifier");
        kotlinx.coroutines.af afVarG = kotlinx.coroutines.aj.g(afVar, this.f28528d);
        com.waze.location.q qVar = new com.waze.location.q(null);
        com.waze.shared_infra.q.e eVar = this.f28529e;
        com.waze.shared_infra.i.e eVar2 = this.f28526b;
        return new MainCanvasDelegatorImpl(this.f28525a, chVar, kVar, this.f28527c, afVarG, eVar, cdVar, eVar2, awVar, dqVar, qVar);
    }
}
