package com.waze.bo.a;

import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.modules.c.de;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ConfigManager f17166a;

    public b(ConfigManager configManager) {
        x.f(configManager, "configManager");
        this.f17166a = configManager;
    }

    @Override // com.waze.bo.a.a
    public final String a() {
        String configValueString = this.f17166a.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TRAILS);
        x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.bo.a.a
    public final String b() {
        String configValueString = this.f17166a.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS);
        x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.bo.a.a
    public final String c() {
        String configValueString = this.f17166a.getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE);
        x.e(configValueString, "getConfigValueString(...)");
        return configValueString;
    }

    @Override // com.waze.bo.a.a
    public final void d(boolean z) {
        this.f17166a.setConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES, z);
    }

    @Override // com.waze.bo.a.a
    public final void e(boolean z) {
        this.f17166a.setConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS, z);
    }

    @Override // com.waze.bo.a.a
    public final void f(de deVar) {
        x.f(deVar, "value");
        ConfigManager configManager = this.f17166a;
        configManager.setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE, deVar.a());
        configManager.setConfigValueString(ConfigValues.CONFIG_VALUE_CAR_TYPE_PERMANENT_CAR_TYPE, deVar.a());
    }

    @Override // com.waze.bo.a.a
    public final boolean g() {
        return this.f17166a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PALESTINIAN_ROADS);
    }

    @Override // com.waze.bo.a.a
    public final boolean h() {
        return this.f17166a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_DANGEROUS_TURNS);
    }

    @Override // com.waze.bo.a.a
    public final boolean i() {
        return this.f17166a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES);
    }

    @Override // com.waze.bo.a.a
    public final boolean j() {
        return this.f17166a.getConfigValueBool(ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_ROUTE_SETTINGS_AVOID_FERRIES_SUPPORTED);
    }

    @Override // com.waze.bo.a.a
    public final boolean k() {
        return this.f17166a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES);
    }

    @Override // com.waze.bo.a.a
    public final boolean l() {
        return this.f17166a.getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS);
    }
}
