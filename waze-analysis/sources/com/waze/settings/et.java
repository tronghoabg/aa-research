package com.waze.settings;

import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class et extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37195a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    et(gr grVar, com.waze.config.b bVar) {
        super("avoid_ferries", R.string.AVOID_FERRIES, "AVOID_FERRIES_SETTINGS", bVar, R.drawable.setting_icon_ferry);
        this.f37195a = grVar;
        h.g.b.x.c(bVar);
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        gr grVar = this.f37195a;
        View viewO = super.O(deVar);
        grVar.F(viewO);
        return viewO;
    }
}
