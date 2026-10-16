package com.waze.settings.tree.a;

import android.view.View;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends com.waze.settings.tree.d.s {
    b(int i2, c cVar) {
        super("google_assistant.show_mic_button", i2, "GOOGLE_ASSISTANT_SHOW_MIC_ON_MAP", cVar);
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        int i2 = h.f37469a;
        wazeSettingsView.setVisibility(true != com.waze.google_assistant.aa.f24060a.a().E() ? 8 : 0);
        return wazeSettingsView;
    }
}
