package com.waze.ap.a.b;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum q implements eg {
    UNKNOWN(0),
    KICK_OFF(1),
    HALF_TIME(2),
    SECOND_HALF_KICK_OFF(3),
    END_OF_MATCH(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f15002h;

    q(int i2) {
        this.f15002h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f15002h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15002h);
    }
}
