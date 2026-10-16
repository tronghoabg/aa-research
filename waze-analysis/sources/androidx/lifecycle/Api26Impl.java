package androidx.lifecycle;

import h.g.b.x;
import j$.time.Duration;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(Duration duration) {
        x.f(duration, "timeout");
        return duration.toMillis();
    }
}
