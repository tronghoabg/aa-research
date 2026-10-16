package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag implements af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.navigation.ad f18282a;

    public ag(com.waze.modules.navigation.ad adVar) {
        h.g.b.x.f(adVar, "routeUpdater");
        this.f18282a = adVar;
    }

    @Override // com.waze.c.d.af
    public final void a(com.waze.modules.c.av avVar) {
        h.g.b.x.f(avVar, "currentRouteAction");
        if (avVar instanceof com.waze.modules.c.at) {
            this.f18282a.b(((com.waze.modules.c.at) avVar).b());
        } else {
            if (!(avVar instanceof com.waze.modules.c.au)) {
                throw new h.i();
            }
            this.f18282a.a(((com.waze.modules.c.au) avVar).b());
        }
    }
}
