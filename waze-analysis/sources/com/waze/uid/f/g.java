package com.waze.uid.f;

import com.waze.uid.VehicleType;
import com.waze.uid.b.ab;
import com.waze.uid.b.ad;
import h.g.b.x;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final bn f44516a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f44517b;

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        x.f(aVarA, "stringProvider");
        super(aVarA);
        bn bnVarB = ck.b(VehicleType.Private);
        this.f44516a = bnVarB;
        this.f44517b = bnVarB;
        u(ab.f44136a.a());
    }

    public final ch a() {
        return this.f44517b;
    }

    public final void b(VehicleType vehicleType) {
        x.f(vehicleType, "vehicleType");
        this.f44516a.e(vehicleType);
    }
}
