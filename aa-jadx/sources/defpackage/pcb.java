package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pcb implements defpackage.abpb {
    STATIC_INJECTION_UNSET(0),
    CLEAR_WIFI_DATA_STORE(1),
    CLEAR_BLUETOOTH_DATA_STORE(2),
    DISABLE_WIFI(3),
    SEVER_HFP(4),
    SIMULATE_WIFI_INTERFERENCE(5);

    private final int h;

    pcb(int i) {
        this.h = i;
    }

    public static defpackage.pcb b(int i) {
        if (i == 0) {
            return STATIC_INJECTION_UNSET;
        }
        if (i == 1) {
            return CLEAR_WIFI_DATA_STORE;
        }
        if (i == 2) {
            return CLEAR_BLUETOOTH_DATA_STORE;
        }
        if (i == 3) {
            return DISABLE_WIFI;
        }
        if (i == 4) {
            return SEVER_HFP;
        }
        if (i != 5) {
            return null;
        }
        return SIMULATE_WIFI_INTERFERENCE;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
