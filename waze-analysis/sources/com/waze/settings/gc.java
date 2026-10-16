package com.waze.settings;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gc extends com.waze.settings.tree.d.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gc(ds dsVar, com.waze.ui.ac.n nVar) {
        super("alert_sound_description", nVar);
        this.f37297a = dsVar;
    }

    @Override // com.waze.settings.tree.d.l, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37297a, viewO, (h.c.e) null, 10, (boolean[]) null), 3);
        return viewO;
    }
}
