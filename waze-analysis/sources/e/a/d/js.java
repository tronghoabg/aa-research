package e.a.d;

import androidx.core.os.EnvironmentCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum js implements cf {
    SUBCHANNEL_SHUTDOWN("subchannel shutdown"),
    CONNECTION_RESET("connection reset"),
    CONNECTION_TIMED_OUT("connection timed out"),
    CONNECTION_ABORTED("connection aborted"),
    SOCKET_ERROR("socket error"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);


    /* renamed from: h, reason: collision with root package name */
    private final String f47254h;

    js(String str) {
        this.f47254h = str;
    }

    @Override // e.a.d.cf
    public final String a() {
        return this.f47254h;
    }
}
