package defpackage;

/* loaded from: classes3.dex */
public enum ahhr implements ahor {
    RETURNS_CONSTANT(0, 0),
    CALLS(1, 1),
    RETURNS_NOT_NULL(2, 2),
    RETURNS_RESULT_OF(3, 3);

    private static ahos<ahhr> internalValueMap = new ahos() { // from class: ahhq
        @Override // defpackage.ahos
        public ahhr findValueByNumber(int i) {
            return ahhr.valueOf(i);
        }
    };
    private final int value;

    ahhr(int i, int i2) {
        this.value = i2;
    }

    public static ahhr valueOf(int i) {
        if (i == 0) {
            return RETURNS_CONSTANT;
        }
        if (i == 1) {
            return CALLS;
        }
        if (i == 2) {
            return RETURNS_NOT_NULL;
        }
        if (i != 3) {
            return null;
        }
        return RETURNS_RESULT_OF;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
