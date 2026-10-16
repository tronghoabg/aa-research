package defpackage;

/* loaded from: classes3.dex */
public enum ahib implements ahor {
    TRUE(0, 0),
    FALSE(1, 1),
    NULL(2, 2);

    private static ahos<ahib> internalValueMap = new ahos() { // from class: ahia
        @Override // defpackage.ahos
        public ahib findValueByNumber(int i) {
            return ahib.valueOf(i);
        }
    };
    private final int value;

    ahib(int i, int i2) {
        this.value = i2;
    }

    public static ahib valueOf(int i) {
        if (i == 0) {
            return TRUE;
        }
        if (i == 1) {
            return FALSE;
        }
        if (i != 2) {
            return null;
        }
        return NULL;
    }

    @Override // defpackage.ahor
    public final int getNumber() {
        return this.value;
    }
}
