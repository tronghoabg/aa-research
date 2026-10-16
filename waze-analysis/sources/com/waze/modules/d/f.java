package com.waze.modules.d;

import com.google.v.gc;
import com.waze.ac;
import com.waze.ak;
import com.waze.ao;
import com.waze.navigate.eo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f30217a;

    /* renamed from: b, reason: collision with root package name */
    private final ao f30218b;

    /* renamed from: c, reason: collision with root package name */
    private final ac f30219c;

    /* renamed from: d, reason: collision with root package name */
    private final eo f30220d;

    /* renamed from: e, reason: collision with root package name */
    private final c f30221e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedui.e.g f30222f;

    public f(com.waze.shared_infra.q.e eVar, ao aoVar, ac acVar, eo eoVar, c cVar, com.waze.sharedui.e.g gVar) {
        h.g.b.x.f(eVar, "wazeClock");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(acVar, "backgroundStateProvider");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(cVar, "config");
        h.g.b.x.f(gVar, "locationService");
        this.f30217a = eVar;
        this.f30218b = aoVar;
        this.f30219c = acVar;
        this.f30220d = eoVar;
        this.f30221e = cVar;
        this.f30222f = gVar;
    }

    public final com.waze.stats.x a() {
        gc gcVarD = com.waze.sharedui.utils.o.d(this.f30217a.a());
        ao aoVar = this.f30218b;
        com.waze.n.t tVar = aoVar.e() ? com.waze.n.t.ANDROID_AUTO : com.waze.n.t.EXTERNAL_DISPLAY_NONE;
        com.waze.n.o oVarNewBuilder = com.waze.n.p.newBuilder();
        h.g.b.x.f(oVarNewBuilder, "builder");
        oVarNewBuilder.b(this.f30220d.T());
        com.waze.sharedui.e.c cVarA = this.f30222f.a();
        if (cVarA != null) {
            oVarNewBuilder.a(cVarA.e() > this.f30221e.a());
        }
        com.waze.n.p pVarBuild = oVarNewBuilder.build();
        h.g.b.x.e(pVarBuild, "build(...)");
        com.waze.n.p pVar = pVarBuild;
        com.waze.n.l lVarNewBuilder = com.waze.n.m.newBuilder();
        h.g.b.x.f(lVarNewBuilder, "builder");
        com.waze.n.n nVar = aoVar.a().d() instanceof ak ? com.waze.n.n.NOT_CONNECTED : ((Boolean) this.f30219c.b().d()).booleanValue() ? com.waze.n.n.BACKGROUND : com.waze.n.n.FOREGROUND;
        h.g.b.x.f(nVar, "value");
        lVarNewBuilder.b(nVar);
        com.waze.n.n nVar2 = !aoVar.e() ? com.waze.n.n.NOT_CONNECTED : ((Boolean) this.f30219c.a().d()).booleanValue() ? com.waze.n.n.BACKGROUND : com.waze.n.n.FOREGROUND;
        h.g.b.x.f(nVar2, "value");
        lVarNewBuilder.a(nVar2);
        com.waze.n.m mVarBuild = lVarNewBuilder.build();
        h.g.b.x.e(mVarBuild, "build(...)");
        return new com.waze.stats.x(gcVarD, tVar, pVar, mVarBuild);
    }
}
