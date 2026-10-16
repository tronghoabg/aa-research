package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahku implements defpackage.ahpr {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2);

    private static defpackage.ahps<defpackage.ahku> internalValueMap = new defpackage.ahps() { // from class: ahkt
        @Override // defpackage.ahps
        public defpackage.ahku findValueByNumber(int i) {
            return defpackage.ahku.valueOf(i);
        }
    };
    private final int value;

    ahku(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahku valueOf(int i) {
        if (i == 0) {
            return IN;
        }
        if (i == 1) {
            return OUT;
        }
        if (i != 2) {
            return null;
        }
        return INV;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
