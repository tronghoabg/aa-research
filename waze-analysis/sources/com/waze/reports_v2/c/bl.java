package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bl implements bk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z f34254a;

    public bl(com.waze.z zVar) {
        h.g.b.x.f(zVar, "appType");
        this.f34254a = zVar;
    }

    @Override // com.waze.reports_v2.c.bk
    public final boolean a() {
        return this.f34254a == com.waze.z.f45553a ? ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_IN_CAR_ENABLED.b().booleanValue() : ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AAOS_ENABLED.b().booleanValue();
    }
}
