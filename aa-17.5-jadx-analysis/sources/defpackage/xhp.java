package defpackage;

/* loaded from: classes.dex */
public enum xhp implements abnz {
    BLUETOOTH_PAIRING_UNAVAILABLE(-1),
    BLUETOOTH_PAIRING_OOB(1),
    BLUETOOTH_PAIRING_NUMERIC_COMPARISON(2),
    BLUETOOTH_PAIRING_PASSKEY_ENTRY(3),
    BLUETOOTH_PAIRING_PIN(4);

    public final int f;

    xhp(int i) {
        this.f = i;
    }

    public static xhp b(int i) {
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

    @Override // defpackage.abnz
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
