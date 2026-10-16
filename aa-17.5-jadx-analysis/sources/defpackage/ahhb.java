package defpackage;

/* loaded from: classes3.dex */
public enum ahhb implements ahor {
    CLASS(0, 0),
    INTERFACE(1, 1),
    ENUM_CLASS(2, 2),
    ENUM_ENTRY(3, 3),
    ANNOTATION_CLASS(4, 4),
    OBJECT(5, 5),
    COMPANION_OBJECT(6, 6);

    private static ahos<ahhb> internalValueMap = new ahos() { // from class: ahha
        @Override // defpackage.ahos
        public ahhb findValueByNumber(int i) {
            return ahhb.valueOf(i);
        }
    };
    private final int value;

    ahhb(int i, int i2) {
        this.value = i2;
    }

    public static ahhb valueOf(int i) {
        switch (i) {
            case 0:
                return CLASS;
            case 1:
                return INTERFACE;
            case 2:
                return ENUM_CLASS;
            case 3:
                return ENUM_ENTRY;
            case 4:
                return ANNOTATION_CLASS;
            case 5:
                return OBJECT;
            case 6:
                return COMPANION_OBJECT;
            default:
                return null;
        }
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
