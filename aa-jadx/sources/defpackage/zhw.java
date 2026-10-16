package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface zhw extends java.util.concurrent.ScheduledExecutorService, defpackage.zhv {
    defpackage.zhu f(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit);

    defpackage.zhu g(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit);

    defpackage.zhu h(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit);

    defpackage.zhu i(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit);
}
