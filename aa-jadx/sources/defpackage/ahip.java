package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahip implements defpackage.ahpr {
    CONCLUSION_CONDITION(0, 0),
    RETURNS_CONDITION(1, 1),
    HOLDSIN_CONDITION(2, 2);

    private static defpackage.ahps<defpackage.ahip> internalValueMap = new defpackage.ahps() { // from class: ahio
        @Override // defpackage.ahps
        public defpackage.ahip findValueByNumber(int i) {
            return defpackage.ahip.valueOf(i);
        }
    };
    private final int value;

    ahip(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahip valueOf(int i) {
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

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
