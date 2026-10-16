package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahkc implements defpackage.ahpr {
    UNSPECIFIED(0, 0),
    MUST_USE(1, 1),
    EXPLICITLY_IGNORABLE(2, 2);

    private static defpackage.ahps<defpackage.ahkc> internalValueMap = new defpackage.ahps() { // from class: ahkb
        @Override // defpackage.ahps
        public defpackage.ahkc findValueByNumber(int i) {
            return defpackage.ahkc.valueOf(i);
        }
    };
    private final int value;

    ahkc(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahkc valueOf(int i) {
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

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
