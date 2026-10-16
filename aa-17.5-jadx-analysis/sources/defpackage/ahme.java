package defpackage;

/* loaded from: classes3.dex */
public enum ahme implements ahor {
    NONE(0, 0),
    INTERNAL_TO_CLASS_ID(1, 1),
    DESC_TO_CLASS_ID(2, 2);

    private static ahos<ahme> internalValueMap = new ahos() { // from class: ahmd
        @Override // defpackage.ahos
        public ahme findValueByNumber(int i) {
            return ahme.valueOf(i);
        }
    };
    private final int value;

    ahme(int i, int i2) {
        this.value = i2;
    }

    public static ahme valueOf(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return INTERNAL_TO_CLASS_ID;
        }
        if (i != 2) {
            return null;
        }
        return DESC_TO_CLASS_ID;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
