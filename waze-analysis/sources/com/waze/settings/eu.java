package com.waze.settings;

import android.view.View;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eu extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(gr grVar, ew ewVar) {
        super("avoid_freeways", R.string.AVOID_HIGHWAYS, "AVOID_FREEWAYS_SETTINGS", ewVar, R.drawable.setting_icon_freeway);
        this.f37196a = grVar;
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        gr grVar = this.f37196a;
        View viewO = super.O(deVar);
        grVar.F(viewO);
        return viewO;
    }
}
