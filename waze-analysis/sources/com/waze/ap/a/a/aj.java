package com.waze.ap.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum aj implements eg {
    QUESTIONABLE_INSIGHT_TYPE_UNSPECIFIED(0),
    QUESTIONABLE_INSIGHT_TYPE_HAZARD_DEFAULT(1),
    QUESTIONABLE_INSIGHT_TYPE_HAZARD_CONSTRUCTION(2),
    QUESTIONABLE_INSIGHT_TYPE_HAZARD_SHOULDER_VEHICLE_STOPPED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f14929g;

    aj(int i2) {
        this.f14929g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14929g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14929g);
    }
}
