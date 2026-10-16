package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahkk implements defpackage.ahpr {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2),
    STAR(3, 3);

    private static defpackage.ahps<defpackage.ahkk> internalValueMap = new defpackage.ahps() { // from class: ahkj
        @Override // defpackage.ahps
        public defpackage.ahkk findValueByNumber(int i) {
            return defpackage.ahkk.valueOf(i);
        }
    };
    private final int value;

    ahkk(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahkk valueOf(int i) {
        if (i == 0) {
            return IN;
        }
        if (i == 1) {
            return OUT;
        }
        if (i == 2) {
            return INV;
        }
        if (i != 3) {
            return null;
        }
        return STAR;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
