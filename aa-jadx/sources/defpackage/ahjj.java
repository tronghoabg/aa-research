package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahjj implements defpackage.ahpr {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static defpackage.ahps<defpackage.ahjj> internalValueMap = new defpackage.ahps() { // from class: ahji
        @Override // defpackage.ahps
        public defpackage.ahjj findValueByNumber(int i) {
            return defpackage.ahjj.valueOf(i);
        }
    };
    private final int value;

    ahjj(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahjj valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
