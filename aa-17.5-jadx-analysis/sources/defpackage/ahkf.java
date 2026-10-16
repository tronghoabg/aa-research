package defpackage;

/* loaded from: classes3.dex */
public enum ahkf implements ahor {
    WARNING(0, 0),
    ERROR(1, 1),
    HIDDEN(2, 2);

    private static ahos<ahkf> internalValueMap = new ahos() { // from class: ahke
        @Override // defpackage.ahos
        public ahkf findValueByNumber(int i) {
            return ahkf.valueOf(i);
        }
    };
    private final int value;

    ahkf(int i, int i2) {
        this.value = i2;
    }

    public static ahkf valueOf(int i) {
        if (i == 0) {
            return WARNING;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i != 2) {
            return null;
        }
        return HIDDEN;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
