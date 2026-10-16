package com.waze.copilot.a;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f22816a;

    public br(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f22816a = configManager;
    }

    public final boolean a() {
        ConfigManager configManager = this.f22816a;
        return configManager.getConfigValueLong(ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_FTE_POPUP_MAX_SHOW_TIMES) > configManager.getConfigValueLong(ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_FTE_POPUP_TIMES_SHOWN);
    }
}
