package com.waze.settings;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ft extends com.waze.settings.tree.d.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37277a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ft(ds dsVar, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, Class cls) {
        super("connect_calendars", "CONNECT_CALENDARS_SETTINGS", nVar, dVar, cls);
        this.f37277a = dsVar;
    }

    @Override // com.waze.settings.tree.d.j, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.af afVarQ = com.waze.network.f.ak.q(deVar);
        ds dsVar = this.f37277a;
        kotlinx.coroutines.aj.z(afVarQ, null, null, new di(dsVar, viewO, (h.c.e) null, 5, (byte[]) null), 3);
        viewO.setEnabled(((bs) dsVar.A().d()).y());
        return viewO;
    }
}
