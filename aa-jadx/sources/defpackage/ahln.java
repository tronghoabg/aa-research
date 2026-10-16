package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahln implements defpackage.ahpr {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static defpackage.ahps<defpackage.ahln> internalValueMap = new defpackage.ahps() { // from class: ahlm
        @Override // defpackage.ahps
        public defpackage.ahln findValueByNumber(int i) {
            return defpackage.ahln.valueOf(i);
        }
    };
    private final int value;

    ahln(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahln valueOf(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
