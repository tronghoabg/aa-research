package com.google.w.g;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum o implements eg {
    OEM_RESTRICTION_NONE(0),
    TESLA(1),
    NACS_PARTNER(2),
    RIVIAN(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f13240g;

    o(int i2) {
        this.f13240g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13240g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13240g);
    }
}
