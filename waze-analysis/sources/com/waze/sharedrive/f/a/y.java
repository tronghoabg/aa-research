package com.waze.sharedrive.f.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum y implements eg {
    LOCATION_FRESHNESS_UNSPECIFIED(0),
    FRESH(1),
    STALE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f38591f;

    y(int i2) {
        this.f38591f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f38591f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f38591f);
    }
}
