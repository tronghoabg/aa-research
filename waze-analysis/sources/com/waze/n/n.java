package com.waze.n;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum n implements eg {
    DISPLAY_MODE_UNSPECIFIED(0),
    FOREGROUND(1),
    BACKGROUND(2),
    NOT_CONNECTED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f30659g;

    n(int i2) {
        this.f30659g = i2;
    }

    public static n a(int i2) {
        if (i2 == 0) {
            return DISPLAY_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return FOREGROUND;
        }
        if (i2 == 2) {
            return BACKGROUND;
        }
        if (i2 != 3) {
            return null;
        }
        return NOT_CONNECTED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f30659g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30659g);
    }
}
