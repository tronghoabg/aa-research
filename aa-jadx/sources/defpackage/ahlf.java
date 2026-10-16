package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahlf implements defpackage.ahpr {
    WARNING(0, 0),
    ERROR(1, 1),
    HIDDEN(2, 2);

    private static defpackage.ahps<defpackage.ahlf> internalValueMap = new defpackage.ahps() { // from class: ahle
        @Override // defpackage.ahps
        public defpackage.ahlf findValueByNumber(int i) {
            return defpackage.ahlf.valueOf(i);
        }
    };
    private final int value;

    ahlf(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahlf valueOf(int i) {
        if (i == 0) {
            return WARNING;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i != 2) {
            return null;
        }
        return HIDDEN;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
