package defpackage;

/* loaded from: classes3.dex */
public enum ahiy implements ahor {
    CLASS(0, 0),
    PACKAGE(1, 1),
    LOCAL(2, 2);

    private static ahos<ahiy> internalValueMap = new ahos() { // from class: ahix
        @Override // defpackage.ahos
        public ahiy findValueByNumber(int i) {
            return ahiy.valueOf(i);
        }
    };
    private final int value;

    ahiy(int i, int i2) {
        this.value = i2;
    }

    public static ahiy valueOf(int i) {
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

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
