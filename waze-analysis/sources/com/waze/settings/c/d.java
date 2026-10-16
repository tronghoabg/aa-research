package com.waze.settings.c;

import android.view.View;
import com.waze.R;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends com.waze.settings.tree.d.g {
    d(com.waze.ui.ac.n nVar) {
        super("loader", nVar, null, null, null, null, 60);
    }

    @Override // com.waze.settings.tree.d.g, com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(com.waze.shared_infra.o.b.a().c(R.string.___, new Object[0]));
        wazeSettingsView.G();
        return wazeSettingsView;
    }
}
