package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahne implements defpackage.ahpr {
    NONE(0, 0),
    INTERNAL_TO_CLASS_ID(1, 1),
    DESC_TO_CLASS_ID(2, 2);

    private static defpackage.ahps<defpackage.ahne> internalValueMap = new defpackage.ahps() { // from class: ahnd
        @Override // defpackage.ahps
        public defpackage.ahne findValueByNumber(int i) {
            return defpackage.ahne.valueOf(i);
        }
    };
    private final int value;

    ahne(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahne valueOf(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return INTERNAL_TO_CLASS_ID;
        }
        if (i != 2) {
            return null;
        }
        return DESC_TO_CLASS_ID;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
