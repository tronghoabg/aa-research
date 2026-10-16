package com.waze.modules.navigation;

import i.b.l.pw;
import i.b.l.qg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final NavigationServiceNativeManager f30281a;

    public ae(NavigationServiceNativeManager navigationServiceNativeManager) {
        h.g.b.x.f(navigationServiceNativeManager, "navigationServiceNativeManager");
        this.f30281a = navigationServiceNativeManager;
    }

    @Override // com.waze.modules.navigation.ad
    public final void a(qg qgVar) {
        h.g.b.x.f(qgVar, "reroute");
        r.handleRerouteSuggestion$default(this.f30281a, qgVar, null, 2, null);
    }

    @Override // com.waze.modules.navigation.ad
    public final void b(pw pwVar) {
        h.g.b.x.f(pwVar, "routingUpdate");
        r.handleRoutingUpdate$default(this.f30281a, pwVar, null, 2, null);
    }
}
