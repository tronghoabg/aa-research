package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahjh implements defpackage.ahpr {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static defpackage.ahps<defpackage.ahjh> internalValueMap = new defpackage.ahps() { // from class: ahjg
        @Override // defpackage.ahps
        public defpackage.ahjh findValueByNumber(int i) {
            return defpackage.ahjh.valueOf(i);
        }
    };
    private final int value;

    ahjh(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahjh valueOf(int i) {
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

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
