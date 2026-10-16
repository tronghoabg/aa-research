package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ob implements com.google.v.eg {
    HAZARDOUS_GOODS_TYPE_UNSPECIFIED(0),
    EXPLOSIVES(1),
    GASES(2),
    FLAMMABLE(3),
    COMBUSTIBLE(4),
    ORGANIC(5),
    POISON(6),
    RADIOACTIVE(7),
    CORROSIVE(8),
    ASPIRATION_HAZARD(9),
    ENVIRONMENTAL_HAZARD(10),
    OTHER(11);

    private final int n;

    ob(int i2) {
        this.n = i2;
    }

    public static ob a(int i2) {
        switch (i2) {
            case 0:
                return HAZARDOUS_GOODS_TYPE_UNSPECIFIED;
            case 1:
                return EXPLOSIVES;
            case 2:
                return GASES;
            case 3:
                return FLAMMABLE;
            case 4:
                return COMBUSTIBLE;
            case 5:
                return ORGANIC;
            case 6:
                return POISON;
            case 7:
                return RADIOACTIVE;
            case 8:
                return CORROSIVE;
            case 9:
                return ASPIRATION_HAZARD;
            case 10:
                return ENVIRONMENTAL_HAZARD;
            case 11:
                return OTHER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
