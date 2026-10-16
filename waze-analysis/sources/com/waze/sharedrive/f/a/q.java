package com.waze.sharedrive.f.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum q implements eg {
    DRIVER_STATUS_UNSPECIFIED(0),
    ACTIVE(1),
    ARRIVED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f38585f;

    q(int i2) {
        this.f38585f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f38585f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f38585f);
    }
}
