package defpackage;

/* loaded from: classes3.dex */
public enum ahhp implements ahor {
    CONCLUSION_CONDITION(0, 0),
    RETURNS_CONDITION(1, 1),
    HOLDSIN_CONDITION(2, 2);

    private static ahos<ahhp> internalValueMap = new ahos() { // from class: ahho
        @Override // defpackage.ahos
        public ahhp findValueByNumber(int i) {
            return ahhp.valueOf(i);
        }
    };
    private final int value;

    ahhp(int i, int i2) {
        this.value = i2;
    }

    public static ahhp valueOf(int i) {
        if (i == 0) {
            return CONCLUSION_CONDITION;
        }
        if (i == 1) {
            return RETURNS_CONDITION;
        }
        if (i != 2) {
            return null;
        }
        return HOLDSIN_CONDITION;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
