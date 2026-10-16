package defpackage;

/* loaded from: classes3.dex */
public enum ahjk implements ahor {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2),
    STAR(3, 3);

    private static ahos<ahjk> internalValueMap = new ahos() { // from class: ahjj
        @Override // defpackage.ahos
        public ahjk findValueByNumber(int i) {
            return ahjk.valueOf(i);
        }
    };
    private final int value;

    ahjk(int i, int i2) {
        this.value = i2;
    }

    public static ahjk valueOf(int i) {
        if (i == 0) {
            return IN;
        }
        if (i == 1) {
            return OUT;
        }
        if (i == 2) {
            return INV;
        }
        if (i != 3) {
            return null;
        }
        return STAR;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
