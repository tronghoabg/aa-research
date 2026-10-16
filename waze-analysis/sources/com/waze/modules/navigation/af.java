package com.waze.modules.navigation;

import com.waze.modules.c.dk;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationServiceNativeManager f30282a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.trip_overview.z f30283b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.e.g f30284c;

    public af(NavigationServiceNativeManager navigationServiceNativeManager, com.waze.trip_overview.z zVar, com.waze.sharedui.e.g gVar) {
        h.g.b.x.f(navigationServiceNativeManager, "navigationServiceNativeManager");
        h.g.b.x.f(zVar, "configuration");
        h.g.b.x.f(gVar, "locationService");
        this.f30282a = navigationServiceNativeManager;
        this.f30283b = zVar;
        this.f30284c = gVar;
    }

    public final void a(String str, j jVar, dk dkVar, com.waze.av.b.n nVar, long j2, com.waze.av.b.n nVar2, i iVar, com.waze.jni.a aVar) {
        Object next;
        com.waze.shared_infra.h.c cVarF;
        h.g.b.x.f(dkVar, "routingResponse");
        h.g.b.x.f(nVar, "destination");
        h.g.b.x.f(iVar, "useCase");
        h.g.b.x.f(aVar, "callback");
        if (!this.f30283b.l() || str == null) {
            this.f30282a.startNavigationOnRoute(dkVar, nVar, j2, nVar2, iVar, aVar);
            return;
        }
        h hVar = null;
        if (!(jVar instanceof an)) {
            com.waze.sharedui.e.c cVarA = this.f30284c.a();
            jVar = cVarA != null ? new am(cVarA) : null;
        }
        Iterator it = dkVar.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (h.g.b.x.n(((com.waze.modules.c.ar) next).j(), str)) {
                    break;
                }
            }
        }
        com.waze.modules.c.ar arVar = (com.waze.modules.c.ar) next;
        com.waze.modules.c.ar arVarD = arVar != null ? arVar.d() : null;
        if (arVarD != null) {
            com.waze.modules.c.bf bfVarE = arVarD.e();
            if ((bfVarE != null ? Integer.valueOf(bfVarE.a()) : null) != null) {
                int iP = (int) h.o.a.p(arVarD.b());
                com.waze.modules.c.bf bfVarE2 = arVarD.e();
                hVar = new h(iP, bfVarE2 != null ? bfVarE2.a() : 0, arVarD.p());
            }
        }
        h hVar2 = hVar;
        NavigationServiceNativeManager navigationServiceNativeManager = this.f30282a;
        int iC = (int) dkVar.c();
        if (jVar == null || (cVarF = com.waze.av.d.t.f(jVar)) == null) {
            cVarF = com.waze.shared_infra.h.c.f37874b;
        }
        navigationServiceNativeManager.startNavigationOnRouteId(str, iC, cVarF, nVar, nVar2, hVar2, aVar);
    }
}
