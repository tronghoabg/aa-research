package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahjb implements defpackage.ahpr {
    TRUE(0, 0),
    FALSE(1, 1),
    NULL(2, 2);

    private static defpackage.ahps<defpackage.ahjb> internalValueMap = new defpackage.ahps() { // from class: ahja
        @Override // defpackage.ahps
        public defpackage.ahjb findValueByNumber(int i) {
            return defpackage.ahjb.valueOf(i);
        }
    };
    private final int value;

    ahjb(int i, int i2) {
        this.value = i2;
    }

    public static defpackage.ahjb valueOf(int i) {
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

    @Override // defpackage.ahpr
    public final int getNumber() {
        return this.value;
    }
}
