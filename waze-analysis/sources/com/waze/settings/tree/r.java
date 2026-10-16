package com.waze.settings.tree;

import android.view.View;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.p f37584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(com.waze.settings.tree.c.b bVar, h.g.a.p pVar) {
        super("alert", R.string.ALERT_ME_WHEN_APPROACHING, "ALERT_SETTINGS", bVar);
        this.f37584a = pVar;
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        h.g.a.p pVar = this.f37584a;
        com.waze.ifs.ui.a aVarP = ak.p(deVar);
        if (pVar != null && aVarP != null) {
            pVar.invoke(aVarP, wazeSettingsView);
        }
        return wazeSettingsView;
    }
}
