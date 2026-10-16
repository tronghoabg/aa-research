package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class zhz extends defpackage.zhg implements defpackage.zhu {
    private final java.util.concurrent.ScheduledFuture b;

    public zhz(defpackage.zhs zhsVar, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(zhsVar);
        this.b = scheduledFuture;
    }

    @Override // defpackage.zhf, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            this.b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }
}
