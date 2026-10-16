package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum jy implements com.google.v.eg {
    DAY_OF_WEEK(0),
    DAY_OF_MONTH(1),
    DAY_OF_YEAR(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11646e;

    jy(int i2) {
        this.f11646e = i2;
    }

    public static jy a(int i2) {
        if (i2 == 0) {
            return DAY_OF_WEEK;
        }
        if (i2 == 1) {
            return DAY_OF_MONTH;
        }
        if (i2 != 2) {
            return null;
        }
        return DAY_OF_YEAR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11646e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11646e);
    }
}
