package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;

/* loaded from: classes2.dex */
public enum pat implements abnz {
    NOT_INJECTED(0),
    NO_USB_ACCESSORIES(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    IO_EXCEPTION(102),
    NO_OP(103),
    IO_EXCEPTION_IF_NOT_PING_MESSAGE(104),
    WIFI_NETWORK_UNAVAILABLE(105),
    WIFI_NETWORK_LOST(106),
    WIFI_NETWORK_DELAY_AVAILABLE(107);

    private final int j;

    pat(int i2) {
        this.j = i2;
    }

    public static pat b(int i2) {
        if (i2 == 0) {
            return NOT_INJECTED;
        }
        switch (i2) {
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
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

    @Override // defpackage.abnz
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
