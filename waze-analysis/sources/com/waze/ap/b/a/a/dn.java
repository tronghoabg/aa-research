package com.waze.ap.b.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum dn implements eg {
    VEHICLE_TYPE_UNKNOWN(0),
    VEHICLE_TYPE_PRIVATE(1),
    VEHICLE_TYPE_MOTORCYCLE(2),
    VEHICLE_TYPE_TAXI(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f15071g;

    dn(int i2) {
        this.f15071g = i2;
    }

    public static dn a(int i2) {
        if (i2 == 0) {
            return VEHICLE_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return VEHICLE_TYPE_PRIVATE;
        }
        if (i2 == 2) {
            return VEHICLE_TYPE_MOTORCYCLE;
        }
        if (i2 != 3) {
            return null;
        }
        return VEHICLE_TYPE_TAXI;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f15071g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15071g);
    }
}
