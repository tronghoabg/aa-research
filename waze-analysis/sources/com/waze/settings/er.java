package com.waze.settings;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class er extends com.waze.settings.tree.h {
    er() {
        super("delete_account", Integer.valueOf(R.string.DELETE_ACCOUNT), "DELETE_ACCOUNT_SETTINGS");
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(t());
        wazeSettingsView.r(ContextCompat.getColor(deVar.g(), R.color.alarming_variant));
        wazeSettingsView.K(0);
        wazeSettingsView.setOnClickListener(new com.waze.a.y(this, deVar, 17));
        return wazeSettingsView;
    }
}
