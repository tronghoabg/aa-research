package defpackage;

/* loaded from: classes3.dex */
public enum yxo implements abnz {
    DETECTOR_TYPE_UNSPECIFIED(0),
    FLAKY_USB_CABLE(1),
    CHARGE_ONLY_CABLE(2),
    ONLY_KNOWN_CARS(3),
    SESSION_OVERVIEW(4),
    REJECTED_CARS(5),
    USB_DEBUGGING(6),
    ONLINE_HELP(7),
    NO_5GHZ_SUPPORT(8),
    VPN_DETECTED(9),
    WIFI_DISABLED_DETECTOR(10),
    SIDELOAD(11),
    USB_SIGNAL_DISABLED(12),
    BLUETOOTH_CONNECT_PERMISSION_MISSING(13),
    WIRELESS_WAITING_FOR_CAR_BLUETOOTH_HEADSET(14),
    STARTUP_DIAGNOSTIC(15),
    NO_HFP(16);

    public final int r;

    yxo(int i) {
        this.r = i;
    }

    public static yxo b(int i) {
        switch (i) {
            case 0:
                return DETECTOR_TYPE_UNSPECIFIED;
            case 1:
                return FLAKY_USB_CABLE;
            case 2:
                return CHARGE_ONLY_CABLE;
            case 3:
                return ONLY_KNOWN_CARS;
            case 4:
                return SESSION_OVERVIEW;
            case 5:
                return REJECTED_CARS;
            case 6:
                return USB_DEBUGGING;
            case 7:
                return ONLINE_HELP;
            case 8:
                return NO_5GHZ_SUPPORT;
            case 9:
                return VPN_DETECTED;
            case 10:
                return WIFI_DISABLED_DETECTOR;
            case 11:
                return SIDELOAD;
            case 12:
                return USB_SIGNAL_DISABLED;
            case 13:
                return BLUETOOTH_CONNECT_PERMISSION_MISSING;
            case 14:
                return WIRELESS_WAITING_FOR_CAR_BLUETOOTH_HEADSET;
            case 15:
                return STARTUP_DIAGNOSTIC;
            case 16:
                return NO_HFP;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
