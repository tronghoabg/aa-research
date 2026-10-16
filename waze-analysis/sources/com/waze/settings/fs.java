package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fs extends com.waze.settings.tree.d.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fs(ds dsVar, ew ewVar) {
        super("sync_events_toggle", R.string.CALENDAR_SETTINGS_SYNC, "SYNC_EVENTS_TOGGLE_SETTINGS", ewVar, R.drawable.setting_icon_calendar_events);
        this.f37276a = dsVar;
    }

    @Override // com.waze.settings.tree.d.s, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        final WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        com.waze.ifs.ui.a aVarP = com.waze.network.f.ak.p(deVar);
        if (aVarP != null) {
            final ds dsVar = this.f37276a;
            aVarP.ax(new com.waze.ifs.ui.b() { // from class: com.waze.settings.fr
                @Override // com.waze.ifs.ui.b
                public final void a(com.waze.ifs.ui.a aVar, int i2, int i3) {
                    if (i2 == 7781 && i3 == 0) {
                        fs fsVar = this;
                        WazeSettingsView wazeSettingsView2 = wazeSettingsView;
                        dsVar.H();
                        wazeSettingsView2.D(fsVar.B().Q());
                    }
                }
            });
        }
        return wazeSettingsView;
    }
}
