package com.waze.ak;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum aq implements eg {
    GUIDANCE_INSTRUCTION_UNSPECIFIED(0),
    NONE(1),
    AT(2),
    AFTER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f14102g;

    aq(int i2) {
        this.f14102g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f14102g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14102g);
    }
}
