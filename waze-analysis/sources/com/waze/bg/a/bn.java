package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bn implements com.google.v.eg {
    ANIMAL_UNSPECIFIED(0),
    ANIMAL_DEFAULT(1),
    ANIMAL_ON_ROAD(2),
    ANIMAL_ON_SHOULDER(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f16404f;

    bn(int i2) {
        this.f16404f = i2;
    }

    public static com.google.v.ei a() {
        return o.f16562h;
    }

    public static bn b(int i2) {
        if (i2 == 0) {
            return ANIMAL_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ANIMAL_DEFAULT;
        }
        if (i2 == 2) {
            return ANIMAL_ON_ROAD;
        }
        if (i2 != 3) {
            return null;
        }
        return ANIMAL_ON_SHOULDER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16404f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16404f);
    }
}
