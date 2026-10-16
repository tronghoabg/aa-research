package com.waze.settings;

import android.view.View;
import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gg extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gg(ds dsVar, gr grVar, com.waze.ui.ac.n nVar, List list) {
        super(HintConstants.AUTOFILL_HINT_USERNAME, "USERNAME_SETTINGS", nVar, (com.waze.settings.tree.d) null, list, 24);
        this.f37307a = dsVar;
        this.f37308b = grVar;
        ((com.waze.settings.tree.g) this).f37568e = new gd(dsVar);
    }

    @Override // com.waze.settings.tree.d.n, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new gf(this.f37307a, viewO, this.f37308b, (h.c.e) null, 0), 3);
        return viewO;
    }
}
