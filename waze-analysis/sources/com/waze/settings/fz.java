package com.waze.settings;

import android.view.View;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fz extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz(ds dsVar, com.waze.ui.ac.n nVar, com.waze.settings.tree.c.h hVar, List list) {
        super("show_speed_limits", "SHOW_SPEED_LIMITS_SETTINGS", nVar, null, hVar, list, 8);
        this.f37287a = dsVar;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37287a, viewO, (h.c.e) null, 7, (char[]) null), 3);
        return viewO;
    }
}
