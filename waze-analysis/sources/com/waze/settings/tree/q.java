package com.waze.settings.tree;

import android.view.View;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends com.waze.settings.tree.d.s {
    q(com.waze.settings.tree.c.b bVar) {
        super("show_on_map", R.string.SHOW_ON_MAP, "SHOW_ON_MAP_SETTINGS", bVar);
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        ak.p(deVar);
        return wazeSettingsView;
    }
}
