package defpackage;

/* loaded from: classes3.dex */
public enum ahkh implements ahor {
    LANGUAGE_VERSION(0, 0),
    COMPILER_VERSION(1, 1),
    API_VERSION(2, 2);

    private static ahos<ahkh> internalValueMap = new ahos() { // from class: ahkg
        @Override // defpackage.ahos
        public ahkh findValueByNumber(int i) {
            return ahkh.valueOf(i);
        }
    };
    private final int value;

    ahkh(int i, int i2) {
        this.value = i2;
    }

    public static ahkh valueOf(int i) {
        if (i == 0) {
            return LANGUAGE_VERSION;
        }
        if (i == 1) {
            return COMPILER_VERSION;
        }
        if (i != 2) {
            return null;
        }
        return API_VERSION;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
