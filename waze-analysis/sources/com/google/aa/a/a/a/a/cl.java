package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cl implements eg {
    UNKNOWN(0),
    ANDROID_CARDBOARD_SDK(1),
    IOS_CARDBOARD_SDK(2),
    ANDROID_UNITY_SDK(3),
    IOS_UNITY_SDK(4),
    WINDOWS(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f3752h;

    cl(int i2) {
        this.f3752h = i2;
    }

    public static cl a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return ANDROID_CARDBOARD_SDK;
        }
        if (i2 == 2) {
            return IOS_CARDBOARD_SDK;
        }
        if (i2 == 3) {
            return ANDROID_UNITY_SDK;
        }
        if (i2 == 4) {
            return IOS_UNITY_SDK;
        }
        if (i2 != 5) {
            return null;
        }
        return WINDOWS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3752h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3752h);
    }
}
