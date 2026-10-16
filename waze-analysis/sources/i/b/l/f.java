package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum f implements com.google.v.eg {
    NONE(0),
    CROWN(1),
    SWORD(2),
    SHIELD(3),
    PENCIL(4),
    BETA(5),
    HALO(6),
    ADDON7(7),
    ADDON8(8),
    ADDON9(9),
    ADDON10(10),
    ADDON11(11),
    ADDON12(12),
    ADDON13(13),
    ADDON14(14);

    private final int q;

    f(int i2) {
        this.q = i2;
    }

    public static f a(int i2) {
        switch (i2) {
            case 0:
                return NONE;
            case 1:
                return CROWN;
            case 2:
                return SWORD;
            case 3:
                return SHIELD;
            case 4:
                return PENCIL;
            case 5:
                return BETA;
            case 6:
                return HALO;
            case 7:
                return ADDON7;
            case 8:
                return ADDON8;
            case 9:
                return ADDON9;
            case 10:
                return ADDON10;
            case 11:
                return ADDON11;
            case 12:
                return ADDON12;
            case 13:
                return ADDON13;
            case 14:
                return ADDON14;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
