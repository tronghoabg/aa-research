package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fw implements com.waze.settings.tree.c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37279a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37280b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f37281c;

    fw(ds dsVar, gr grVar, int i2) {
        this.f37281c = i2;
        this.f37279a = dsVar;
        this.f37280b = grVar;
    }

    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        int i2 = this.f37281c;
        ds dsVar = this.f37279a;
        return i2 != 0 ? dsVar.f().getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS) : dsVar.f().getConfigValueBool(ConfigValues.CONFIG_VALUE_DANGER_ZONE_ALERTS);
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        if (this.f37281c == 0) {
            ds dsVar = this.f37279a;
            dsVar.f().setConfigValueBool(ConfigValues.CONFIG_VALUE_DANGER_ZONE_ALERTS, z);
            int configValueInt = dsVar.f().getConfigValueInt(ConfigValues.CONFIG_VALUE_DANGER_ZONE_TEXTS_ID) + R.string.NOTIFICATIONS_ON_ROUTE_DANGER_ZONES_CONFIRMATION;
            if (z) {
                return;
            }
            com.waze.ab.o oVar = new com.waze.ab.o();
            gr grVar = this.f37280b;
            oVar.Q(grVar.f37336i.c(R.string.ARE_YOU_SURE_Q, new Object[0]));
            oVar.M(grVar.f37336i.c(R.string.CONFIRM, new Object[0]));
            oVar.N(grVar.f37336i.c(R.string.CANCEL, new Object[0]));
            oVar.P(grVar.f37336i.c(configValueInt, new Object[0]));
            oVar.f13808a = new com.waze.dc(dsVar, 16);
            com.waze.z.a.d.ai.q(oVar);
            return;
        }
        if (Q() == z) {
            return;
        }
        if (z) {
            this.f37279a.N(true);
            return;
        }
        WazeSettingsView wazeSettingsView = view instanceof WazeSettingsView ? (WazeSettingsView) view : null;
        if (wazeSettingsView != null) {
            wazeSettingsView.D(true);
        }
        com.waze.ab.o oVar2 = new com.waze.ab.o();
        gr grVar2 = this.f37280b;
        oVar2.Q(grVar2.f37336i.c(R.string.ARE_YOU_SURE_Q, new Object[0]));
        oVar2.P(grVar2.f37336i.c(R.string.NAVIGATION_SETTINGS_AVOID_DANGEROUS_AREAS_CONFIRMATION, new Object[0]));
        oVar2.M(grVar2.f37336i.c(R.string.CONFIRM, new Object[0]));
        oVar2.N(grVar2.f37336i.c(R.string.CANCEL, new Object[0]));
        oVar2.f13808a = new com.waze.dc(this.f37279a, 15);
        com.waze.z.a.d.ai.q(oVar2);
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
