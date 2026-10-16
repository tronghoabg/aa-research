package com.waze.settings;

import android.view.View;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fd extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fd(ds dsVar, gr grVar, com.waze.ui.ac.n nVar, List list) {
        super("full_name", "FULL_NAME_SETTINGS", nVar, (com.waze.settings.tree.d) null, list, 24);
        this.f37245a = dsVar;
        this.f37246b = grVar;
        ((com.waze.settings.tree.g) this).f37568e = new fa(dsVar);
    }

    @Override // com.waze.settings.tree.d.n, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        ds dsVar = this.f37245a;
        View viewO = super.O(deVar);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new dl(dsVar.A(), 6)), new fc(viewO, this.f37246b, null)), com.waze.network.f.ak.q(deVar));
        return viewO;
    }
}
