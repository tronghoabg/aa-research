package defpackage;

/* loaded from: classes3.dex */
public enum ahjc implements ahor {
    UNSPECIFIED(0, 0),
    MUST_USE(1, 1),
    EXPLICITLY_IGNORABLE(2, 2);

    private static ahos<ahjc> internalValueMap = new ahos() { // from class: ahjb
        @Override // defpackage.ahos
        public ahjc findValueByNumber(int i) {
            return ahjc.valueOf(i);
        }
    };
    private final int value;

    ahjc(int i, int i2) {
        this.value = i2;
    }

    public static ahjc valueOf(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return MUST_USE;
        }
        if (i != 2) {
            return null;
        }
        return EXPLICITLY_IGNORABLE;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
