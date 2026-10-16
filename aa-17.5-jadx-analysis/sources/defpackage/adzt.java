package defpackage;

/* loaded from: classes.dex */
public enum adzt implements adtj {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN("unknown");

    private final String h;

    adzt(String str) {
        this.h = str;
    }

    @Override // defpackage.adtj
    public final String a() {
        return this.h;
    }
}
