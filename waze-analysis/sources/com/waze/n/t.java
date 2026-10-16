package com.waze.n;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum t implements eg {
    PROJECTED_PLATFORM_UNSPECIFIED(0),
    CARPLAY(1),
    ANDROID_AUTO(2),
    EXTERNAL_DISPLAY_NONE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f30672g;

    t(int i2) {
        this.f30672g = i2;
    }

    public static t a(int i2) {
        if (i2 == 0) {
            return PROJECTED_PLATFORM_UNSPECIFIED;
        }
        if (i2 == 1) {
            return CARPLAY;
        }
        if (i2 == 2) {
            return ANDROID_AUTO;
        }
        if (i2 != 3) {
            return null;
        }
        return EXTERNAL_DISPLAY_NONE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f30672g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f30672g);
    }
}
