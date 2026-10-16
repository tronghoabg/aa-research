package com.waze.settings;

import android.view.View;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ga extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37295a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ga(ds dsVar, com.waze.ui.ac.n nVar, com.waze.settings.tree.c.h hVar, List list) {
        super("speed_limits_offset", "SPEED_LIMITS_OFFSET_SETTINGS", nVar, null, hVar, list, 8);
        this.f37295a = dsVar;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37295a, viewO, (h.c.e) null, 8, (short[]) null), 3);
        return viewO;
    }
}
