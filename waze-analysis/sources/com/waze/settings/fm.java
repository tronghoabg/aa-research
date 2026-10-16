package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fm extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37267a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fm(ds dsVar, fw fwVar) {
        super("avoid_high_risk_areas", R.string.NAVIGATION_SETTINGS_AVOID_DANGEROUS_AREAS, "AVOID_HIGH_RISK_AREAS_SETTINGS", fwVar);
        this.f37267a = dsVar;
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37267a, wazeSettingsView, (h.c.e) null, 4, (byte[]) null), 3);
        return wazeSettingsView;
    }
}
