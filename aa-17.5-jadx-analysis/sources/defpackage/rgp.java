package defpackage;

import android.os.Build;
import j$.time.Duration;

/* loaded from: classes.dex */
public enum rgp {
    STATE_INITIAL(Duration.ZERO, 2),
    STATE_WAITING_FOR_ENDPOINT_READY(Duration.ofSeconds(5), 3),
    STATE_WAITING_FOR_USER_AUTHORIZATION(Duration.ofMinutes(2), 16),
    STATE_ENABLING(Duration.ofSeconds(4), 4),
    STATE_WAITING_FOR_BLUETOOTH_PROFILE_UTIL(Duration.ofSeconds(4), 5),
    STATE_REQUESTING_CAR_PAIRING_PREPARATION(Duration.ofMinutes(2), 6),
    STATE_HFP_CONNECTION_CHECKING(Duration.ofMinutes(1), 7),
    STATE_PREPARING_FOR_PAIRING(Duration.ofSeconds(10), 8),
    STATE_PAIRING(Build.VERSION.SDK_INT >= 30 ? Duration.ofMinutes(1) : Duration.ofSeconds(10), 9),
    STATE_BLUETOOTH_CONNECTING(Duration.ofMinutes(1), 17),
    STATE_HFP_CONNECTING(Duration.ofMinutes(1), 10),
    STATE_HFP_CONNECTED(Duration.ofSeconds(3), 11),
    STATE_HFP_MONITORING(Duration.ofSeconds(10), 12),
    STATE_UNPAIRING(Duration.ZERO, 13),
    STATE_UNPAIRED(Duration.ZERO, 19),
    STATE_FAILED(Duration.ZERO, 15),
    STATE_NONE(Duration.ZERO, 1),
    STATE_WRONG(Duration.ZERO, 1);

    public final Duration s;
    public final int t;

    rgp(Duration duration, int i) {
        woy.O(!duration.isNegative(), "State timeout must be positive.");
        this.t = i;
        this.s = duration;
    }
}
