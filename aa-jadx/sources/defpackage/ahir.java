package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahir implements defpackage.ahpr {
    RETURNS_CONSTANT(0, 0),
    CALLS(1, 1),
    RETURNS_NOT_NULL(2, 2),
    RETURNS_RESULT_OF(3, 3);

    private static defpackage.ahps<defpackage.ahir> internalValueMap = new defpackage.ahps() { // from class: ahiq
        @Override // defpackage.ahps
        public defpackage.ahir findValueByNumber(int i) {
            return defpackage.ahir.valueOf(i);
        }
    };
    private final int value;

    ahir(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahir valueOf(int i) {
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

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
