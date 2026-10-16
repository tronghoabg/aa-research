package com.waze.ap.b.a.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum dk implements eg {
    TRAFFIC_CONDITION_UNSPECIFIED(0),
    TRAFFIC_CONDITION_HIGH(1),
    TRAFFIC_CONDITION_LOW(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f15064f;

    dk(int i2) {
        this.f15064f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f15064f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15064f);
    }
}
