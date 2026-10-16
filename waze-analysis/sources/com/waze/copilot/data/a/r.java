package com.waze.copilot.data.a;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.gw.Gateway;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f22937a;

    public r(ConfigManager configManager) {
        x.f(configManager, "configManager");
        this.f22937a = configManager;
    }

    @Override // com.waze.copilot.data.a.q
    public final String a() {
        Gateway.ensureMotorcycleArrowAssets();
        String configValueString = this.f22937a.getConfigValueString(ConfigValues.CONFIG_VALUE_TRIP_CAR);
        x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.copilot.data.a.q
    public final void b(String str) {
        x.f(str, "carId");
        this.f22937a.setConfigValueString(ConfigValues.CONFIG_VALUE_TRIP_CAR, str);
    }
}
