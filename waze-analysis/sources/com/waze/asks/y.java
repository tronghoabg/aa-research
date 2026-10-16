package com.waze.asks;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15643a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15644b;

    public y() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_IN_CAR_LIST_MODE.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f15643a = boolB.booleanValue();
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_NEW_INFRA_ENABLED.b();
        h.g.b.x.e(boolB2, "getValue(...)");
        this.f15644b = boolB2.booleanValue();
    }

    @Override // com.waze.asks.x
    public final long a() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_QUESTION_TIMEOUT_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    @Override // com.waze.asks.x
    public final long b() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_THANK_YOU_TIMEOUT_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    @Override // com.waze.asks.x
    public final boolean c() {
        return this.f15644b;
    }

    @Override // com.waze.asks.x
    public final boolean d() {
        return this.f15643a;
    }
}
