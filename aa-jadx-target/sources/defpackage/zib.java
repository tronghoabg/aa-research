package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zib extends defpackage.zhy implements java.lang.AutoCloseable, defpackage.zhw {
    final java.util.concurrent.ScheduledExecutorService a;

    public zib(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.zge, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.a.k(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhu schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.zim zimVar = new defpackage.zim(java.util.concurrent.Executors.callable(runnable, null));
        return new defpackage.zhz(zimVar, this.a.schedule(zimVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhu schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.zim zimVar = new defpackage.zim(callable);
        return new defpackage.zhz(zimVar, this.a.schedule(zimVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhu scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.zia ziaVar = new defpackage.zia(runnable);
        return new defpackage.zhz(ziaVar, this.a.scheduleAtFixedRate(ziaVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final defpackage.zhu scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.zia ziaVar = new defpackage.zia(runnable);
        return new defpackage.zhz(ziaVar, this.a.scheduleWithFixedDelay(ziaVar, j, j2, timeUnit));
    }
}
