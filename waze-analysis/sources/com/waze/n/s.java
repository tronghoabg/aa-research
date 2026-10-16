package com.waze.n;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum s implements eg {
    OS_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f30665f;

    s(int i2) {
        this.f30665f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f30665f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30665f);
    }
}
