package com.waze.modules.c;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class da implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f30040a;

    public da(ConfigManager configManager) {
        h.g.b.x.f(configManager, "configManager");
        this.f30040a = configManager;
    }

    @Override // com.waze.modules.c.cz
    public final void A() {
    }

    @Override // com.waze.modules.c.cz
    public final void B() {
    }

    @Override // com.waze.modules.c.cz
    public final void C() {
    }

    @Override // com.waze.modules.c.cz
    public final void D() {
    }

    @Override // com.waze.modules.c.cz
    public final String a() {
        String configValueString = this.f30040a.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TRAILS);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.modules.c.cz
    public final String b() {
        String configValueString = this.f30040a.getConfigValueString(ConfigValues.CONFIG_VALUE_LICENSE_PLATE_SUFFIX);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.modules.c.cz
    public final String c() {
        String configValueString = this.f30040a.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.modules.c.cz
    public final String d() {
        String configValueString = this.f30040a.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE);
        h.g.b.x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.modules.c.cz
    public final boolean e() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_EV_HAS_EV_CAR);
    }

    @Override // com.waze.modules.c.cz
    public final boolean f() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_LICENSE_PLATE_FEATURE_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean g() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_HEADING_UPDATE_ALLOW_BIDI);
    }

    @Override // com.waze.modules.c.cz
    public final boolean h() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_UNKNOWN_DIRECTIONS_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean i() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_DANGER_ZONE_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean j() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES);
    }

    @Override // com.waze.modules.c.cz
    public final boolean k() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_PALESTINIAN_ROADS_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean l() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS);
    }

    @Override // com.waze.modules.c.cz
    public final boolean m() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES);
    }

    @Override // com.waze.modules.c.cz
    public final boolean n() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_TOLLS_ROADS_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean o() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS);
    }

    @Override // com.waze.modules.c.cz
    public final boolean p() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_LANE_GUIDANCE_CONTINUE_STRAIGHT_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean q() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_DANGER_ZONE_ALERTS);
    }

    @Override // com.waze.modules.c.cz
    public final boolean r() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_DANGEROUS_TURNS_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean s() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_DANGEROUS_TURNS);
    }

    @Override // com.waze.modules.c.cz
    public final boolean t() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_LANE_GUIDANCE_USER_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean u() {
        return !this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_PERSONALIZED_ROUTES_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean v() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_LANE_GUIDANCE_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean w() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_PREFER_SAME_STREET);
    }

    @Override // com.waze.modules.c.cz
    public final boolean x() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_PREFER_UNKNOWN_DIRECTIONS);
    }

    @Override // com.waze.modules.c.cz
    public final boolean y() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_FEATURE_ENABLED);
    }

    @Override // com.waze.modules.c.cz
    public final boolean z() {
        return this.f30040a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_PERSONAL_ETA_ENABLED);
    }
}
