package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ey implements com.google.v.eg {
    UNKNOWN_LOGICAL_MATERIAL(1),
    CONCRETE(2),
    METAL(3),
    PLASTIC(4),
    STONE(5),
    TIMBER(6);


    /* renamed from: h, reason: collision with root package name */
    private final int f11787h;

    ey(int i2) {
        this.f11787h = i2;
    }

    public static ey a(int i2) {
        switch (i2) {
            case 1:
                return UNKNOWN_LOGICAL_MATERIAL;
            case 2:
                return CONCRETE;
            case 3:
                return METAL;
            case 4:
                return PLASTIC;
            case 5:
                return STONE;
            case 6:
                return TIMBER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11787h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11787h);
    }
}
