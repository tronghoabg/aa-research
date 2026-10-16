package com.waze.google_assistant;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z f24154a;

    public c(com.waze.z zVar) {
        h.g.b.x.f(zVar, "appType");
        this.f24154a = zVar;
    }

    public static final boolean b() {
        return ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_TERMS.b().booleanValue() || ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AGREED_TO_DISCLOSURE.b().booleanValue();
    }

    public static final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_WAZE_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public final boolean a() {
        return this.f24154a == com.waze.z.f45554b && ConfigValues.CONFIG_VALUE_GOOGLE_ASSISTANT_AAOS_REPORT_LOCATION_OVERRIDE_ENABLED.b().booleanValue();
    }
}
