package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum xqw implements defpackage.abpb {
    UNKNOWN_SECURITY_MODE(0),
    OPEN(1),
    WEP_64(2),
    WEP_128(3),
    WPA_PERSONAL(4),
    WPA2_PERSONAL(8),
    WPA_WPA2_PERSONAL(12),
    WPA_ENTERPRISE(20),
    WPA2_ENTERPRISE(24),
    WPA_WPA2_ENTERPRISE(28),
    WPA3_PERSONAL(32),
    WPA2_WPA3_PERSONAL(40);

    public final int m;

    xqw(int i) {
        this.m = i;
    }

    public static defpackage.xqw b(int i) {
        if (i == 0) {
            return UNKNOWN_SECURITY_MODE;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return WEP_64;
        }
        if (i == 3) {
            return WEP_128;
        }
        if (i == 4) {
            return WPA_PERSONAL;
        }
        if (i == 8) {
            return WPA2_PERSONAL;
        }
        if (i == 12) {
            return WPA_WPA2_PERSONAL;
        }
        if (i == 20) {
            return WPA_ENTERPRISE;
        }
        if (i == 24) {
            return WPA2_ENTERPRISE;
        }
        if (i == 28) {
            return WPA_WPA2_ENTERPRISE;
        }
        if (i == 32) {
            return WPA3_PERSONAL;
        }
        if (i != 40) {
            return null;
        }
        return WPA2_WPA3_PERSONAL;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.m);
    }
}
