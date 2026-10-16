package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum yyp implements defpackage.abpb {
    UNKNOWN_REASON(0),
    BT_CONNECTING(1),
    RFCOMM_CONNECTING(2),
    BT_CONNECTED(3),
    BT_DISCONNECTED(4),
    BT_HFP_A2DP_CONNECTED(23),
    BT_HFP_A2DP_DISCONNECTED(24),
    RFCOMM_RECONNECTING(25),
    RFCOMM_TIMED_OUT(5),
    RFCOMM_READ_FAILURE(6),
    RECONNECTION_PREVENTED(26),
    RFCOMM_WRITE_FAILURE(7),
    RFCOMM_READ_WRITE_FAILURE(28),
    FOUND_COMPATIBLE_WIFI_NETWORK(8),
    NO_COMPATIBLE_WIFI_CHANNEL_FOUND(9),
    NO_COMPATIBLE_WIFI_VERSION_FOUND(10),
    WIFI_START_REQUEST_RECEIVED(22),
    WIFI_CONNECTING(11),
    WIFI_CONNECTED(12),
    WIFI_DISABLED(13),
    WIFI_ABORTED(14),
    WIFI_CONNECT_TIMED_OUT(15),
    PROJECTION_INITIATED(16),
    PROJECTION_CONNECTED(17),
    PROJECTION_IN_PROGRESS(18),
    PROJECTION_DISCONNECTED(19),
    PROJECTION_ENDED(20),
    IDLE_STATE_ENTERED(21),
    WIRELESS_SERVICE_SHUT_DOWN(27);

    public final int D;

    yyp(int i) {
        this.D = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.D;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.D);
    }
}
