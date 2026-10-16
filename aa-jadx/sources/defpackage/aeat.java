package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum aeat implements defpackage.aduj {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN("unknown");

    private final java.lang.String h;

    aeat(java.lang.String str) {
        this.h = str;
    }

    @Override // defpackage.aduj
    public final java.lang.String a() {
        return this.h;
    }
}
