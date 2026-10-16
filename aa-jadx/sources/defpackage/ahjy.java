package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahjy implements defpackage.ahpr {
    CLASS(0, 0),
    PACKAGE(1, 1),
    LOCAL(2, 2);

    private static defpackage.ahps<defpackage.ahjy> internalValueMap = new defpackage.ahps() { // from class: ahjx
        @Override // defpackage.ahps
        public defpackage.ahjy findValueByNumber(int i) {
            return defpackage.ahjy.valueOf(i);
        }
    };
    private final int value;

    ahjy(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahjy valueOf(int i) {
        if (i == 0) {
            return CLASS;
        }
        if (i == 1) {
            return PACKAGE;
        }
        if (i != 2) {
            return null;
        }
        return LOCAL;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
