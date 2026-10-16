package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hf implements com.google.v.eg {
    UNDEFINED_ENERGY_UNIT(0),
    CALORIE(1),
    JOULE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f11912e;

    hf(int i2) {
        this.f11912e = i2;
    }

    public static hf a(int i2) {
        if (i2 == 0) {
            return UNDEFINED_ENERGY_UNIT;
        }
        if (i2 == 1) {
            return CALORIE;
        }
        if (i2 != 2) {
            return null;
        }
        return JOULE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11912e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11912e);
    }
}
