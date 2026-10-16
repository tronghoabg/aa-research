package com.waze.settings;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ed implements com.waze.settings.tree.c.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37170a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37171b;

    public /* synthetic */ ed(Object obj, int i2) {
        this.f37171b = i2;
        this.f37170a = obj;
    }

    @Override // com.waze.settings.tree.c.c
    public final boolean a() {
        switch (this.f37171b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                bs bsVar = (bs) ((ds) this.f37170a).A().d();
                h.g.b.x.f(bsVar, "<this>");
                if (bsVar.f() == null || !bsVar.s()) {
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                ConfigManager configManager = (ConfigManager) this.f37170a;
                if (configManager.getConfigValueBool(ConfigValues.CONFIG_VALUE_WAZE_MAP_AS_PRIMARY_MAP_ENABLED)) {
                    if (configManager.getConfigValueBool(ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_TRAFFIC_LIGHTS_WHILE_ROAMING_ENABLED) || configManager.getConfigValueBool(ConfigValues.CONFIG_VALUE_INSIGHTS_INFRA_TRAFFIC_LIGHTS_WHILE_NAVIGATING_ENABLED)) {
                    }
                }
                break;
            case 13:
                break;
            case 14:
                if (!(((gr) this.f37170a).d().j().b() instanceof com.waze.reports_v2.b)) {
                }
                break;
            default:
                com.waze.reports_v2.d dVarB = ((gr) this.f37170a).d().j().b();
                if ((dVarB instanceof com.waze.reports_v2.b) || !dVarB.a().i()) {
                }
                break;
        }
        return true;
    }
}
