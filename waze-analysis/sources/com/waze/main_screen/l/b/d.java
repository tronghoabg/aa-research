package com.waze.main_screen.l.b;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26612a;

    public d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_NAVIGATION_DRIVE_ON_LEFT_SIDE.b();
        x.e(boolB, "getValue(...)");
        this.f26612a = boolB.booleanValue();
    }

    public static final /* bridge */ /* synthetic */ boolean d() {
        return ConfigValues.CONFIG_VALUE_VENUE_FRESHNESS_FEATURE_ENABLED.b().booleanValue();
    }

    public static final /* bridge */ /* synthetic */ long e() {
        return ConfigValues.CONFIG_VALUE_VENUE_FRESHNESS_GET_VENUE_TIMEOUT_MS.b().longValue();
    }

    public static final /* bridge */ /* synthetic */ long f() {
        return ConfigValues.CONFIG_VALUE_VENUE_FRESHNESS_RECENT_MAX_AGE_SECONDS.b().longValue();
    }

    public static final /* bridge */ /* synthetic */ long g() {
        return ConfigValues.CONFIG_VALUE_VENUE_FRESHNESS_RECENT_MAX_DISTANCE_METERS.b().longValue();
    }

    public final boolean a() {
        return this.f26612a;
    }

    public final /* synthetic */ void b(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        eVar.e("closureImpactInfoEnabled: " + this.f26612a);
        eVar.e("venueFreshnessEnabled: " + d());
        eVar.e("venueFreshnessGetVenueTimeoutMs: " + e());
        eVar.e("venueFreshnessRecentMaxDistanceMeters: " + g());
        eVar.e("venueFreshnessRecentMaxAgeSeconds: " + f());
    }

    public final boolean c() {
        return this.f26612a;
    }

    public d(boolean z) {
        this.f26612a = z;
    }
}
