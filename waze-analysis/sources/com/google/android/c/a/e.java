package com.google.android.c.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum e implements eg {
    DENSITY_UNKNOWN(0),
    DENSITY_ALLDPI(1),
    DENSITY_LDPI(2),
    DENSITY_MDPI(3),
    DENSITY_TVDPI(4),
    DENSITY_HDPI(5),
    DENSITY_XHDPI(7),
    DENSITY_DPI400(8),
    DENSITY_XXHDPI(9),
    DENSITY_XXXHDPI(10);


    /* renamed from: l, reason: collision with root package name */
    private final int f3888l;

    e(int i2) {
        this.f3888l = i2;
    }

    public static e a(int i2) {
        switch (i2) {
            case 0:
                return DENSITY_UNKNOWN;
            case 1:
                return DENSITY_ALLDPI;
            case 2:
                return DENSITY_LDPI;
            case 3:
                return DENSITY_MDPI;
            case 4:
                return DENSITY_TVDPI;
            case 5:
                return DENSITY_HDPI;
            case 6:
            default:
                return null;
            case 7:
                return DENSITY_XHDPI;
            case 8:
                return DENSITY_DPI400;
            case 9:
                return DENSITY_XXHDPI;
            case 10:
                return DENSITY_XXXHDPI;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3888l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3888l);
    }
}
