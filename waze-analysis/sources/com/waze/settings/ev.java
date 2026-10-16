package com.waze.settings;

import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ev extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37197a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ev(gr grVar, ew ewVar) {
        super("avoid_toll_roads", R.string.AVOID_TOLL_ROADS, "AVOID_TOLL_ROADS_SETTINGS", ewVar, R.drawable.setting_icon_toll);
        this.f37197a = grVar;
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        gr grVar = this.f37197a;
        View viewO = super.O(deVar);
        grVar.F(viewO);
        return viewO;
    }
}
