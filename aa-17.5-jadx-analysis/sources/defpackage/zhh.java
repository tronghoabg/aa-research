package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zhh extends zga {
    public zgp a;
    public ScheduledFuture b;

    public zhh(zgp zgpVar) {
        zgpVar.getClass();
        this.a = zgpVar;
    }

    @Override // defpackage.zeu
    protected final void b() {
        m(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.zeu
    protected final String fO() {
        zgp zgpVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (zgpVar == null) {
            return null;
        }
        String strBW = a.bW(zgpVar, "inputFuture=[", "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strBW + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strBW;
    }
}
