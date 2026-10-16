package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum iu implements com.google.v.eg {
    TYPE_ANY(0),
    TYPE_SURFACE(1),
    TYPE_T_BAR(17),
    TYPE_J_BAR(18),
    TYPE_ROPE_TOW(19),
    TYPE_POMA(20),
    TYPE_CARPET(21),
    TYPE_FUNICULAR(22),
    TYPE_GONDOLA(2),
    TYPE_CHAIR(3),
    TYPE_AERIAL(4),
    TYPE_TRAM(65);

    private final int n;

    iu(int i2) {
        this.n = i2;
    }

    public static iu a(int i2) {
        if (i2 == 0) {
            return TYPE_ANY;
        }
        if (i2 == 1) {
            return TYPE_SURFACE;
        }
        if (i2 == 2) {
            return TYPE_GONDOLA;
        }
        if (i2 == 3) {
            return TYPE_CHAIR;
        }
        if (i2 == 4) {
            return TYPE_AERIAL;
        }
        if (i2 == 65) {
            return TYPE_TRAM;
        }
        switch (i2) {
            case 17:
                return TYPE_T_BAR;
            case 18:
                return TYPE_J_BAR;
            case 19:
                return TYPE_ROPE_TOW;
            case 20:
                return TYPE_POMA;
            case 21:
                return TYPE_CARPET;
            case 22:
                return TYPE_FUNICULAR;
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
