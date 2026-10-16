package okhttp3;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f55933a;

    /* renamed from: b, reason: collision with root package name */
    private int f55934b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f55935c;

    public final d a() {
        this.f55933a = true;
        return this;
    }

    public final d b() {
        this.f55935c = true;
        return this;
    }

    public final e c() {
        return new e(this.f55933a, false, -1, -1, false, false, false, this.f55934b, -1, this.f55935c, false, false, null);
    }

    public final d d(TimeUnit timeUnit) {
        h.g.b.x.f(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(SieveCacheKt.NodeLinkMask);
        this.f55934b = seconds > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : (int) seconds;
        return this;
    }
}
