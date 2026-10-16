package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahlh implements defpackage.ahpr {
    LANGUAGE_VERSION(0, 0),
    COMPILER_VERSION(1, 1),
    API_VERSION(2, 2);

    private static defpackage.ahps<defpackage.ahlh> internalValueMap = new defpackage.ahps() { // from class: ahlg
        @Override // defpackage.ahps
        public defpackage.ahlh findValueByNumber(int i) {
            return defpackage.ahlh.valueOf(i);
        }
    };
    private final int value;

    ahlh(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahlh valueOf(int i) {
        if (i == 0) {
            return LANGUAGE_VERSION;
        }
        if (i == 1) {
            return COMPILER_VERSION;
        }
        if (i != 2) {
            return null;
        }
        return API_VERSION;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
