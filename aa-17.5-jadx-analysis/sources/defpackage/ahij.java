package defpackage;

/* loaded from: classes3.dex */
public enum ahij implements ahor {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static ahos<ahij> internalValueMap = new ahos() { // from class: ahii
        @Override // defpackage.ahos
        public ahij findValueByNumber(int i) {
            return ahij.valueOf(i);
        }
    };
    private final int value;

    ahij(int i, int i2) {
        this.value = i2;
    }

    public static ahij valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
