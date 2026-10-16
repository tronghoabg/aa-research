package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hw implements com.google.v.eg {
    DIET_HALAL(0),
    DIET_KOSHER(1),
    DIET_ORGANIC(2),
    DIET_VEGAN(3),
    DIET_VEGETARIAN(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11961g;

    hw(int i2) {
        this.f11961g = i2;
    }

    public static hw a(int i2) {
        if (i2 == 0) {
            return DIET_HALAL;
        }
        if (i2 == 1) {
            return DIET_KOSHER;
        }
        if (i2 == 2) {
            return DIET_ORGANIC;
        }
        if (i2 == 3) {
            return DIET_VEGAN;
        }
        if (i2 != 4) {
            return null;
        }
        return DIET_VEGETARIAN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11961g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11961g);
    }
}
