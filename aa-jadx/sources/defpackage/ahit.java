package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahit implements defpackage.ahpr {
    AT_MOST_ONCE(0, 0),
    EXACTLY_ONCE(1, 1),
    AT_LEAST_ONCE(2, 2);

    private static defpackage.ahps<defpackage.ahit> internalValueMap = new defpackage.ahps() { // from class: ahis
        @Override // defpackage.ahps
        public defpackage.ahit findValueByNumber(int i) {
            return defpackage.ahit.valueOf(i);
        }
    };
    private final int value;

    ahit(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahit valueOf(int i) {
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

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
