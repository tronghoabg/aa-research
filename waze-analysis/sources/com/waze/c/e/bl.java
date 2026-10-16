package com.waze.c.e;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private final long f18607a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18608b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.b.ac f18609c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18610d;

    public bl(com.waze.alerters.a aVar) {
        h.g.b.x.f(aVar, "alerterConfigs");
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_ALTERNATIVE_ROUTES_V2_HOV_SAVED_TIME_THRESHOLD_MINUTES.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f18607a = h.o.c.j(lB.longValue(), h.o.d.f48274e);
        this.f18608b = (int) ConfigValues.CONFIG_VALUE_ROUTE_OVERVIEW_NUMBER_OF_ALERTS_TO_SHOW_ON_TIMELINE.b().longValue();
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_NO_PREFIX_PERMIT_STRINGS.b();
        this.f18609c = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_ALT_PERMIT_STRINGS.b().booleanValue() ? new com.waze.ui.b.ab(boolB.booleanValue()) : new com.waze.ui.b.aa(boolB.booleanValue());
        this.f18610d = aVar.b();
    }

    public final int a() {
        return this.f18608b;
    }

    public final long b() {
        return this.f18607a;
    }

    public final com.waze.ui.b.ac c() {
        return this.f18609c;
    }

    public final boolean d() {
        return this.f18610d;
    }
}
