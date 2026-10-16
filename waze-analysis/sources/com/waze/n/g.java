package com.waze.n;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum g implements eg {
    APP_UNSPECIFIED(0),
    WAZE(1),
    WAZE_AAOS(3),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f30652f;

    g(int i2) {
        this.f30652f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f30652f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30652f);
    }
}
