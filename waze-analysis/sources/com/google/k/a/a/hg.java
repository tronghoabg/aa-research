package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hg implements com.google.v.eg {
    UNDEFINED_MASS_UNIT(0),
    GRAM(1),
    MILLIGRAM(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11917e;

    hg(int i2) {
        this.f11917e = i2;
    }

    public static hg a(int i2) {
        if (i2 == 0) {
            return UNDEFINED_MASS_UNIT;
        }
        if (i2 == 1) {
            return GRAM;
        }
        if (i2 != 2) {
            return null;
        }
        return MILLIGRAM;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11917e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11917e);
    }
}
