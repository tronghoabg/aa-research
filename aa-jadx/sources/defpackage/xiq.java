package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum xiq implements defpackage.abpb {
    BLUETOOTH_PAIRING_UNAVAILABLE(-1),
    BLUETOOTH_PAIRING_OOB(1),
    BLUETOOTH_PAIRING_NUMERIC_COMPARISON(2),
    BLUETOOTH_PAIRING_PASSKEY_ENTRY(3),
    BLUETOOTH_PAIRING_PIN(4);

    public final int f;

    xiq(int i) {
        this.f = i;
    }

    public static defpackage.xiq b(int i) {
        if (i == -1) {
            return BLUETOOTH_PAIRING_UNAVAILABLE;
        }
        if (i == 1) {
            return BLUETOOTH_PAIRING_OOB;
        }
        if (i == 2) {
            return BLUETOOTH_PAIRING_NUMERIC_COMPARISON;
        }
        if (i == 3) {
            return BLUETOOTH_PAIRING_PASSKEY_ENTRY;
        }
        if (i != 4) {
            return null;
        }
        return BLUETOOTH_PAIRING_PIN;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
