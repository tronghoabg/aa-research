package com.waze.navigate.location_preview;

import com.waze.config.ConfigValues;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f31749a = h.g.a(new com.waze.native_managers.n(2));

    public static final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_PARKING_BOOKING_DISPLAY_RATES.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public static final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_PARKING_BOOKING_RESERVATION_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    public final List a() {
        return (List) this.f31749a.getValue();
    }
}
