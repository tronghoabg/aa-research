package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* renamed from: com.google.k.a.a.b.if, reason: invalid class name */
/* loaded from: classes5.dex */
public enum Cif implements com.google.v.eg {
    SURFACE_UNKNOWN(0),
    SURFACE_PAVED(1),
    SURFACE_ASPHALT(17),
    SURFACE_CONCRETE(18),
    SURFACE_CHIPSEAL(19),
    SURFACE_BRICK(20),
    SURFACE_SETT(21),
    SURFACE_COBBLESTONE(22),
    SURFACE_UNPAVED(2),
    SURFACE_GRAVEL(33),
    SURFACE_DIRT(34),
    SURFACE_SAND(35);

    private final int n;

    Cif(int i2) {
        this.n = i2;
    }

    public static Cif a(int i2) {
        if (i2 == 0) {
            return SURFACE_UNKNOWN;
        }
        if (i2 == 1) {
            return SURFACE_PAVED;
        }
        if (i2 == 2) {
            return SURFACE_UNPAVED;
        }
        switch (i2) {
            case 17:
                return SURFACE_ASPHALT;
            case 18:
                return SURFACE_CONCRETE;
            case 19:
                return SURFACE_CHIPSEAL;
            case 20:
                return SURFACE_BRICK;
            case 21:
                return SURFACE_SETT;
            case 22:
                return SURFACE_COBBLESTONE;
            default:
                switch (i2) {
                    case 33:
                        return SURFACE_GRAVEL;
                    case 34:
                        return SURFACE_DIRT;
                    case 35:
                        return SURFACE_SAND;
                    default:
                        return null;
                }
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
