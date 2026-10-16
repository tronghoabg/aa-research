package com.waze.mywaze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends com.waze.ifs.a.a {
    q(MyWazeNativeManager myWazeNativeManager) {
        Objects.requireNonNull(myWazeNativeManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.ifs.a.a
    public final void a() {
        com.waze.shared_infra.i.h.a("launchMyWaze - callback");
        com.waze.app_nav.w wVarA = com.waze.app_nav.w.f15441a.a();
        b bVar = b.f30576a;
        com.waze.alerters.a.k.c(wVarA, b.c().a(), new com.waze.app_nav.ah(false, null, 0 == true ? 1 : 0, 6));
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        com.waze.shared_infra.i.h.a("launchMyWaze - event");
    }
}
