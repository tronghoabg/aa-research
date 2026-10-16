package com.google.android.gms.k.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {
    private a() {
    }

    public static b a() {
        return new b();
    }

    public static String b(int i2) {
        if (i2 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i2 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i2 == 104) {
            return "LOW_POWER";
        }
        if (i2 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static a c() {
        return new a();
    }
}
