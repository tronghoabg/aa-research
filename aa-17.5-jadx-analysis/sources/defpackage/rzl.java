package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class rzl {
    public final Runnable a;
    public ScheduledExecutorService b;
    public long c = 0;
    public long d = 0;
    public TimeUnit e;

    public rzl(Runnable runnable) {
        this.a = runnable;
    }
}
