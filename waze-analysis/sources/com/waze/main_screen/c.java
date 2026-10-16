package com.waze.main_screen;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f26077a;

    public c(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f26077a = configManager;
    }

    @Override // com.waze.main_screen.b
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_MAIN_MENU_BANNERS_MAX_COUNT.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.main_screen.b
    public final String b() {
        String strB = ConfigValues.CONFIG_VALUE_FEEDBACK_CORE_URL_PS.b();
        h.g.b.x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.main_screen.b
    public final String c() {
        String strB = ConfigValues.CONFIG_VALUE_HELP_REWIRE_MAIN_MENU_URL.b();
        h.g.b.x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.main_screen.b
    public final kotlinx.coroutines.b.k d() {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_GALLERY_ENABLED.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        return kVarK;
    }

    @Override // com.waze.main_screen.b
    public final kotlinx.coroutines.b.k e() {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_REALTIME_INVISIBLE_MODE;
        h.g.b.x.e(bVar, "CONFIG_VALUE_REALTIME_INVISIBLE_MODE");
        return com.waze.n.ac.o(bVar);
    }

    @Override // com.waze.main_screen.b
    public final boolean f() {
        return this.f26077a.getConfigValueBool(ConfigValues.CONFIG_VALUE_GENERAL_IS_ALPHA_USER);
    }

    @Override // com.waze.main_screen.b
    public final boolean g() {
        return this.f26077a.getConfigValueBool(ConfigValues.CONFIG_VALUE_GENERAL_IS_BETA_TESTER);
    }

    @Override // com.waze.main_screen.b
    public final boolean h() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GENERAL_IS_RT_BETA_IL_USER.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.main_screen.b
    public final boolean i() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_COPILOT_MARKETPLACE_GALLERY_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.main_screen.b
    public final boolean j() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GENERAL_IS_STAFF_USER.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
