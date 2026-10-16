package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum jt implements com.google.v.eg {
    UNKNOWN_RIGHTS(0),
    GT_RIGHTS(5),
    FULL_RIGHTS(10);


    /* renamed from: e, reason: collision with root package name */
    private final int f12010e;

    jt(int i2) {
        this.f12010e = i2;
    }

    public static jt a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_RIGHTS;
        }
        if (i2 == 5) {
            return GT_RIGHTS;
        }
        if (i2 != 10) {
            return null;
        }
        return FULL_RIGHTS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12010e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12010e);
    }
}
