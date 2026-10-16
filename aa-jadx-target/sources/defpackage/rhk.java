package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public enum rhk {
    STATE_INITIAL(j$.time.Duration.ZERO, 2),
    STATE_WAITING_FOR_ENDPOINT_READY(j$.time.Duration.ofSeconds(5), 3),
    STATE_WAITING_FOR_USER_AUTHORIZATION(j$.time.Duration.ofMinutes(2), 16),
    STATE_ENABLING(j$.time.Duration.ofSeconds(4), 4),
    STATE_WAITING_FOR_BLUETOOTH_PROFILE_UTIL(j$.time.Duration.ofSeconds(4), 5),
    STATE_REQUESTING_CAR_PAIRING_PREPARATION(j$.time.Duration.ofMinutes(2), 6),
    STATE_HFP_CONNECTION_CHECKING(j$.time.Duration.ofMinutes(1), 7),
    STATE_PREPARING_FOR_PAIRING(j$.time.Duration.ofSeconds(10), 8),
    STATE_PAIRING(android.os.Build.VERSION.SDK_INT >= 30 ? j$.time.Duration.ofMinutes(1) : j$.time.Duration.ofSeconds(10), 9),
    STATE_BLUETOOTH_CONNECTING(j$.time.Duration.ofMinutes(1), 17),
    STATE_HFP_CONNECTING(j$.time.Duration.ofMinutes(1), 10),
    STATE_HFP_CONNECTED(j$.time.Duration.ofSeconds(3), 11),
    STATE_HFP_MONITORING(j$.time.Duration.ofSeconds(10), 12),
    STATE_UNPAIRING(j$.time.Duration.ZERO, 13),
    STATE_UNPAIRED(j$.time.Duration.ZERO, 19),
    STATE_FAILED(j$.time.Duration.ZERO, 15),
    STATE_NONE(j$.time.Duration.ZERO, 1),
    STATE_WRONG(j$.time.Duration.ZERO, 1);

    public final j$.time.Duration s;
    public final int t;

    rhk(j$.time.Duration duration, int i) {
        defpackage.ysr.aY(!duration.isNegative(), "State timeout must be positive.");
        this.t = i;
        this.s = duration;
    }
}
