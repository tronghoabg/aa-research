package defpackage;

/* loaded from: classes3.dex */
public enum ahht implements ahor {
    AT_MOST_ONCE(0, 0),
    EXACTLY_ONCE(1, 1),
    AT_LEAST_ONCE(2, 2);

    private static ahos<ahht> internalValueMap = new ahos() { // from class: ahhs
        @Override // defpackage.ahos
        public ahht findValueByNumber(int i) {
            return ahht.valueOf(i);
        }
    };
    private final int value;

    ahht(int i, int i2) {
        this.value = i2;
    }

    public static ahht valueOf(int i) {
        if (i == 0) {
            return AT_MOST_ONCE;
        }
        if (i == 1) {
            return EXACTLY_ONCE;
        }
        if (i != 2) {
            return null;
        }
        return AT_LEAST_ONCE;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
