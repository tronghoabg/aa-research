package defpackage;

/* loaded from: classes3.dex */
public enum ahih implements ahor {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static ahos<ahih> internalValueMap = new ahos() { // from class: ahig
        @Override // defpackage.ahos
        public ahih findValueByNumber(int i) {
            return ahih.valueOf(i);
        }
    };
    private final int value;

    ahih(int i, int i2) {
        this.value = i2;
    }

    public static ahih valueOf(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
