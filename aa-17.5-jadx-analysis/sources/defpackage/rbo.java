package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class rbo extends rbn {
    public final Handler b;
    public final rbq c;
    private boolean d;
    private boolean e;

    public rbo(Handler handler, rbq rbqVar) {
        this.b = handler;
        this.c = rbqVar;
    }

    @Override // defpackage.rbn
    protected final synchronized void a() {
        if (this.d && omc.c("CAR.TIME", 4)) {
            rrd.d(4, "CAR.TIME", null, "Canceling posted timeout for handler: %s runnable: %s", this.b, this.c);
        }
        this.e = true;
        this.b.removeCallbacks(this.c);
    }

    @Override // defpackage.rbn
    protected final synchronized void b() {
        if (!this.e) {
            this.b.post(this.c);
            this.d = true;
        } else if (omc.c("CAR.TIME", 4)) {
            rrd.d(4, "CAR.TIME", null, "Timeout for handler: %s runnable: %s was already canceled, ignoring run", this.b, this.c);
        }
    }

    @Override // defpackage.rbn
    protected final boolean c() {
        return true;
    }
}
