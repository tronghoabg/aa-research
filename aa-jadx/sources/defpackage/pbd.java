package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum pbd {
    WIFI_INVALID_PROJECTION_ENDPOINT(-20, false),
    WIFI_INVALID_WPP_ENDPOINT(-19, false),
    WIFI_CONNECTION_SETUP_FAILED(-18, false),
    WIFI_INVALID_SSID(-17, false),
    WIFI_INVALID_BSSID(-16, false),
    WIFI_INVALID_PASSWORD(-15, false),
    WIFI_INACCESSIBLE_CHANNEL(-14, false),
    NO_COMPATIBLE_WIFI_VERSION_FOUND(-13, false),
    NO_COMPATIBLE_WIFI_CHANNEL_FOUND(-12, false),
    DISCONNECTED_BT(-11, false),
    ABORTED_WIFI(-10, false),
    RECONNECTION_PREVENTED(-9, false),
    BT_HFP_A2DP_DISCONNECTED(-8, false),
    CONNECTION_LOST_BT(-7, false),
    RFCOMM_READ_WRITE_FAILURE(-5, false),
    WIFI_INVALID_CREDENTIALS(-3, false),
    WIFI_SECURITY_NOT_SUPPORTED(-2, false),
    WIFI_FAILED_TO_AUTOMATICALLY_ENABLE(-1, false),
    IDLE(0, false),
    BT_HFP_A2DP_CONNECTED(1, false),
    CONNECTING_RFCOMM(3, false),
    CONNECTED_RFCOMM(5, true),
    CONNECTING_WIFI(6, true),
    CONNECTED_WIFI(7, true),
    PROJECTION_INITIATED(8, true),
    VERSION_CHECK_COMPLETE(9, true),
    SHUTDOWN(10, false),
    FOUND_COMPATIBLE_WIFI_NETWORK(11, true),
    PROJECTION_IN_PROGRESS(12, true),
    WIFI_CONNECT_TIMED_OUT(14, false),
    PROJECTION_START_TIMED_OUT(15, false),
    PROJECTION_ENDED(16, false),
    START_WIFI_REQUEST_SUCCESS(17, true),
    START_WIFI_REQUEST_FAILED_ALREADY_STARTED(18, false),
    START_WIFI_REQUEST_FAILED_WIFI_DISABLED(19, false),
    START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED(20, false),
    START_WIFI_REQUEST_FAILED_INVALID_CREDENTIALS(21, false),
    PROJECTION_CONNECTED(22, true),
    PROJECTION_DISCONNECTED(23, false),
    WIFI_PROJECTION_START_REQUESTED(24, true),
    WIFI_AUTOMATICALLY_ENABLED(25, false),
    WIFI_PROJECTION_RESTART_REQUESTED(26, true),
    MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT(32, false),
    USER_REJECT_WIFI_UNAVAILABLE(33, false),
    USER_DISCONNECTED_ANOTHER_NETWORK_CONNECTED(34, false),
    USER_DISCONNECTED_FROM_WIFI_NETWORK(35, false),
    USER_DISCONNECTED_MD_WIFI_ADAPTER_OFF(36, false),
    MD_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT_GAL_ONLY(37, false),
    HU_USER_REQUEST_BYE_BYE_INITIATED_WIFI_DISCONNECT(38, false),
    USER_INITIATED_GAL_DISCONNECT_OTHER_REASON(39, false);

    private static final android.util.SparseArray aa;
    public final int Y;
    public final boolean Z;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (defpackage.pbd pbdVar : values()) {
            sparseArray.append(pbdVar.Y, pbdVar);
        }
        aa = sparseArray;
    }

    pbd(int i, boolean z) {
        this.Y = i;
        this.Z = z;
    }

    public static defpackage.pbd a(int i) {
        return (defpackage.pbd) aa.get(i);
    }
}
