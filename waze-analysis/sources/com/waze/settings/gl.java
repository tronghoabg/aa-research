package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gl extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37318a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gl(gr grVar, com.waze.ui.ac.n nVar, fh fhVar, List list, com.waze.settings.tree.d dVar) {
        super("vehicle_type", "VEHICLE_TYPE_SETTINGS", nVar, dVar, fhVar, list);
        this.f37318a = grVar;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        String configValueString = this.f37318a.d().f().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE);
        h.g.b.x.f(wazeSettingsView, "view");
        int i2 = R.drawable.setting_icon_vehicle_private;
        if (configValueString != null) {
            int iHashCode = configValueString.hashCode();
            if (iHashCode != 2567710) {
                if (iHashCode == 403485027) {
                    configValueString.equals("PRIVATE");
                } else if (iHashCode == 871058833 && configValueString.equals("MOTORCYCLE")) {
                    i2 = R.drawable.setting_icon_vehicle_motorcycle;
                }
            } else if (configValueString.equals("TAXI")) {
                i2 = R.drawable.setting_icon_vehicle_taxi;
            }
        }
        com.waze.settings.tree.a aVar = new com.waze.settings.tree.a(i2);
        wazeSettingsView.K(aVar.a());
        v(aVar);
        return wazeSettingsView;
    }
}
