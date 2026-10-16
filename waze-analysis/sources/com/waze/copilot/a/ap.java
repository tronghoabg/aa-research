package com.waze.copilot.a;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f22697a;

    public ap(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f22697a = configManager;
    }

    public final void a() {
        ConfigManager configManager = this.f22697a;
        com.waze.config.c cVar = ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_FTE_POPUP_TIMES_SHOWN;
        configManager.setConfigValueLong(cVar, configManager.getConfigValueLong(cVar) + 1);
    }
}
