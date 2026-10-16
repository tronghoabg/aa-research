package com.waze.car_lib.e;

import com.waze.config.ConfigValues;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f19268a = h.g.a(new com.waze.car_lib.b.l(13));

    @Override // com.waze.car_lib.e.a
    public final List a() {
        return (List) this.f19268a.getValue();
    }

    @Override // com.waze.car_lib.e.a
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_INSTRUMENT_CLUSTER_ALERTS_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.car_lib.e.a
    public final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_INSTRUMENT_CLUSTER_INSTRUCTIONS_AND_ETA_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.car_lib.e.a
    public final boolean d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_INSTRUMENT_CLUSTER_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.car_lib.e.a
    public final boolean e() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_INSTRUMENT_CLUSTER_MAP_POIS_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
