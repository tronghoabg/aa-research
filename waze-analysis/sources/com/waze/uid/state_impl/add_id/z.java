package com.waze.uid.state_impl.add_id;

import com.waze.uid.VehicleType;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final VehicleType f44598a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(VehicleType vehicleType) {
        super((byte[]) null);
        h.g.b.x.f(vehicleType, "vehicleType");
        this.f44598a = vehicleType;
    }

    public final VehicleType a() {
        return this.f44598a;
    }
}
