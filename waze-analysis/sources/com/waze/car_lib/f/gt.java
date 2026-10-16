package com.waze.car_lib.f;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gt {

    /* renamed from: a, reason: collision with root package name */
    private final long f19626a;

    public /* synthetic */ gt() {
        Long lB = ConfigValues.CONFIG_VALUE_SEARCH_IN_CAR_ADDRESS_PREVIEW_LOADING_TIMEOUT_MS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f19626a = lB.longValue();
    }

    public final long a() {
        return this.f19626a;
    }
}
