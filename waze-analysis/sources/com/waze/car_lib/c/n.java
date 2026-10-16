package com.waze.car_lib.c;

import com.waze.settings.dy;
import com.waze.settings.eb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final eb f19260a;

    public n(eb ebVar) {
        x.f(ebVar, "statsSender");
        this.f19260a = ebVar;
    }

    public final void a(com.waze.settings.tree.f fVar) {
        String strR;
        x.f(fVar, "setting");
        if (x.n(fVar.s(), "settings_main")) {
            strR = "MAP";
        } else {
            com.waze.settings.tree.f fVarN = com.waze.nightmode.e.n(fVar);
            strR = fVarN != null ? fVarN.r() : null;
        }
        eb ebVar = this.f19260a;
        ebVar.c(ebVar.a(strR), dy.f37101d, fVar.r(), null, null, null);
    }

    public final void b(com.waze.settings.tree.f fVar) {
        x.f(fVar, "page");
        eb ebVar = this.f19260a;
        ebVar.c(ebVar.a(fVar.r()), dy.f37098a, null, null, null, null);
    }

    public final void c(com.waze.settings.tree.f fVar, String str) {
        x.f(fVar, "page");
        x.f(str, "action");
        eb ebVar = this.f19260a;
        ebVar.c(ebVar.a(fVar.r()), dy.f37101d, str, null, null, null);
    }

    public final void d(com.waze.settings.tree.f fVar) {
        x.f(fVar, "page");
        eb ebVar = this.f19260a;
        ebVar.c(ebVar.a(fVar.r()), dy.f37099b, null, null, null, null);
    }
}
