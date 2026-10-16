package com.waze.ap.a.b;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum u implements eg {
    SPORT_UNKNOWN(0),
    SPORT_SOCCER(1),
    SPORT_BASKETBALL(2),
    SPORT_AMERICAN_FOOTBALL(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f15009g;

    u(int i2) {
        this.f15009g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f15009g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15009g);
    }
}
