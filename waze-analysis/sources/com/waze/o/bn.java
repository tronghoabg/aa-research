package com.waze.o;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bn implements eg {
    REASON_UNSPECIFIED(0),
    JAM_PACKING_UP(1),
    BETTER_ROAD_FOUND(2),
    WRONG_TURN(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f32773f;

    bn(int i2) {
        this.f32773f = i2;
    }

    public static bn a(int i2) {
        if (i2 == 0) {
            return REASON_UNSPECIFIED;
        }
        if (i2 == 1) {
            return JAM_PACKING_UP;
        }
        if (i2 == 2) {
            return BETTER_ROAD_FOUND;
        }
        if (i2 != 3) {
            return null;
        }
        return WRONG_TURN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f32773f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32773f);
    }
}
