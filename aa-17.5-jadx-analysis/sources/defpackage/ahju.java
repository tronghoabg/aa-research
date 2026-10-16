package defpackage;

/* loaded from: classes3.dex */
public enum ahju implements ahor {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2);

    private static ahos<ahju> internalValueMap = new ahos() { // from class: ahjt
        @Override // defpackage.ahos
        public ahju findValueByNumber(int i) {
            return ahju.valueOf(i);
        }
    };
    private final int value;

    ahju(int i, int i2) {
        this.value = i2;
    }

    public static ahju valueOf(int i) {
        if (i == 0) {
            return IN;
        }
        if (i == 1) {
            return OUT;
        }
        if (i != 2) {
            return null;
        }
        return INV;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
