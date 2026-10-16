package e.c.c.b;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends e.c.j implements e.c.a.c {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f47889a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f47890b;

    public g(ThreadFactory threadFactory) {
        this.f47890b = k.a(threadFactory);
    }

    public final void a() {
        if (this.f47889a) {
            return;
        }
        this.f47889a = true;
        this.f47890b.shutdownNow();
    }
}
