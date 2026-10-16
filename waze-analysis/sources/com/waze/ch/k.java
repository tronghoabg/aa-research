package com.waze.ch;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum k implements eg {
    DISPLAY_PLATFORM_UNSPECIFIED(0),
    MOBILE(1),
    CARPLAY(2),
    ANDROID_AUTO(3),
    ANDROID_AUTOMOTIVE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f22379g;

    k(int i2) {
        this.f22379g = i2;
    }

    public static k a(int i2) {
        if (i2 == 0) {
            return DISPLAY_PLATFORM_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MOBILE;
        }
        if (i2 == 2) {
            return CARPLAY;
        }
        if (i2 == 3) {
            return ANDROID_AUTO;
        }
        if (i2 != 4) {
            return null;
        }
        return ANDROID_AUTOMOTIVE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f22379g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f22379g);
    }
}
