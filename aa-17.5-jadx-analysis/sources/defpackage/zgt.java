package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface zgt extends ScheduledExecutorService, zgs {
    zgr f(Runnable runnable, long j, TimeUnit timeUnit);

    zgr g(Callable callable, long j, TimeUnit timeUnit);

    zgr h(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    zgr i(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
