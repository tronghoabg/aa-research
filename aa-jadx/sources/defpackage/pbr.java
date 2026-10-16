package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum pbr implements defpackage.abpb {
    NOT_INJECTED(0),
    NO_USB_ACCESSORIES(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    IO_EXCEPTION(102),
    NO_OP(103),
    IO_EXCEPTION_IF_NOT_PING_MESSAGE(104),
    WIFI_NETWORK_UNAVAILABLE(105),
    WIFI_NETWORK_LOST(106),
    WIFI_NETWORK_DELAY_AVAILABLE(107);

    private final int j;

    pbr(int i2) {
        this.j = i2;
    }

    public static defpackage.pbr b(int i2) {
        if (i2 == 0) {
            return NOT_INJECTED;
        }
        switch (i2) {
            case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return NO_USB_ACCESSORIES;
            case 102:
                return IO_EXCEPTION;
            case 103:
                return NO_OP;
            case 104:
                return IO_EXCEPTION_IF_NOT_PING_MESSAGE;
            case 105:
                return WIFI_NETWORK_UNAVAILABLE;
            case 106:
                return WIFI_NETWORK_LOST;
            case 107:
                return WIFI_NETWORK_DELAY_AVAILABLE;
            default:
                return null;
        }
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
