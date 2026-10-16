package com.waze.ap.a.b;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum n implements eg {
    UNKNOWN(0),
    YELLOW_CARD(1),
    RED_CARD(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f14994f;

    n(int i2) {
        this.f14994f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14994f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14994f);
    }
}
