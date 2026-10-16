package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ep extends com.waze.settings.tree.h {
    ep() {
        super("logout", Integer.valueOf(R.string.LOG_OUT), "LOGOUT_SETTINGS");
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(t());
        wazeSettingsView.K(0);
        wazeSettingsView.setOnClickListener(new com.waze.inbox.e(16));
        return wazeSettingsView;
    }
}
