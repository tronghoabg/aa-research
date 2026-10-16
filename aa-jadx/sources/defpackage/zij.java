package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zij extends defpackage.zhd {
    public defpackage.zhs a;
    public java.util.concurrent.ScheduledFuture b;

    public zij(defpackage.zhs zhsVar) {
        zhsVar.getClass();
        this.a = zhsVar;
    }

    @Override // defpackage.zga
    protected final void b() {
        m(this.a);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zhs zhsVar = this.a;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.b;
        if (zhsVar == null) {
            return null;
        }
        java.lang.String strBV = defpackage.a.bV(zhsVar, "inputFuture=[", "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strBV + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strBV;
    }
}
