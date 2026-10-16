package com.google.w.g;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum l implements eg {
    SOURCE_UNSPECIFIED(0),
    TESLA(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f13233e;

    l(int i2) {
        this.f13233e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13233e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13233e);
    }
}
