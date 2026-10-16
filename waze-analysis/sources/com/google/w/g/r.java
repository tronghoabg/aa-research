package com.google.w.g;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum r implements eg {
    LAND_USE_UNKNOWN(0),
    LAND_USE_RESIDENTIAL(1),
    LAND_USE_COMMERCIAL(2),
    LAND_USE_MIXED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f13247g;

    r(int i2) {
        this.f13247g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13247g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13247g);
    }
}
