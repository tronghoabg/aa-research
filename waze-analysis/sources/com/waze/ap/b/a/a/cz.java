package com.waze.ap.b.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum cz implements eg {
    SPEED_CONDITION_UNSPECIFIED(0),
    SPEED_CONDITION_HIGH(1),
    SPEED_CONDITION_LOW(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f15058f;

    cz(int i2) {
        this.f15058f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f15058f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15058f);
    }
}
