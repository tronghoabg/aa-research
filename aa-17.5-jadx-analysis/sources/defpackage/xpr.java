package defpackage;

/* loaded from: classes3.dex */
public enum xpr implements abnz {
    MESSAGE_WIFI_REQUEST_START_BT(1),
    MESSAGE_WIFI_REQUEST_INFO_BT(2),
    MESSAGE_WIFI_RESPONSE_INFO_BT(3),
    MESSAGE_WIFI_VERSION_REQUEST_BT(4),
    MESSAGE_WIFI_VERSION_RESPONSE_BT(5),
    MESSAGE_WIFI_CONNECT_STATUS_BT(6),
    MESSAGE_WIFI_RESPONSE_START_BT(7),
    MESSAGE_WIFI_PING_REQUEST_BT(8),
    MESSAGE_WIFI_PING_RESPONSE_BT(9),
    MESSAGE_WIFI_CONNECTION_REJECTION_BT(10),
    MESSAGE_WIFI_SETUP_INFO_BT(11);

    public final int l;

    xpr(int i) {
        this.l = i;
    }

    public static xpr b(int i) {
        switch (i) {
            case 1:
                return MESSAGE_WIFI_REQUEST_START_BT;
            case 2:
                return MESSAGE_WIFI_REQUEST_INFO_BT;
            case 3:
                return MESSAGE_WIFI_RESPONSE_INFO_BT;
            case 4:
                return MESSAGE_WIFI_VERSION_REQUEST_BT;
            case 5:
                return MESSAGE_WIFI_VERSION_RESPONSE_BT;
            case 6:
                return MESSAGE_WIFI_CONNECT_STATUS_BT;
            case 7:
                return MESSAGE_WIFI_RESPONSE_START_BT;
            case 8:
                return MESSAGE_WIFI_PING_REQUEST_BT;
            case 9:
                return MESSAGE_WIFI_PING_RESPONSE_BT;
            case 10:
                return MESSAGE_WIFI_CONNECTION_REJECTION_BT;
            case 11:
                return MESSAGE_WIFI_SETUP_INFO_BT;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
