package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum kb implements com.google.v.eg {
    WEEK_OF_MONTH(0),
    WEEK_OF_YEAR(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11680d;

    kb(int i2) {
        this.f11680d = i2;
    }

    public static kb a(int i2) {
        if (i2 == 0) {
            return WEEK_OF_MONTH;
        }
        if (i2 != 1) {
            return null;
        }
        return WEEK_OF_YEAR;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11680d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11680d);
    }
}
