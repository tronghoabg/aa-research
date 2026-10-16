package com.google.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum i implements eg {
    FAILURE_MODE_UNSPECIFIED(0),
    FALLBACK_PUBLIC(1),
    FAIL_CLOSED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f3625f;

    i(int i2) {
        this.f3625f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f3625f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3625f);
    }
}
