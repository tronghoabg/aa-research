package com.waze.settings;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gk extends com.waze.settings.tree.a.ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37317b;

    gk(ds dsVar, gr grVar) {
        this.f37316a = dsVar;
        this.f37317b = grVar;
    }

    @Override // com.waze.settings.tree.a.ab, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        gr grVar = this.f37317b;
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new gf(this.f37316a, this, grVar, (h.c.e) null, 2), 3);
        return viewO;
    }
}
