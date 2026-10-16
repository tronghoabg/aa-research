package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum am implements eg {
    UNKNOWN(0),
    MOBILE(1),
    TABLET(2),
    DESKTOP(3),
    GOOGLE_HOME(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f3647g;

    am(int i2) {
        this.f3647g = i2;
    }

    public static am a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return MOBILE;
        }
        if (i2 == 2) {
            return TABLET;
        }
        if (i2 == 3) {
            return DESKTOP;
        }
        if (i2 != 4) {
            return null;
        }
        return GOOGLE_HOME;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3647g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3647g);
    }
}
