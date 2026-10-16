package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jny {
    public final zgp a;
    public final xyc b;
    private volatile boolean c;
    private volatile boolean d;

    public jny(xyc xycVar, xyc xycVar2, long j) {
        if (j <= 0) {
            this.a = a(xycVar);
        } else {
            this.a = wub.aa(new jnx(this, xycVar, 0), j, TimeUnit.MILLISECONDS, Executors.newSingleThreadScheduledExecutor());
        }
        this.b = wub.L(new jbk(this, xycVar2, 4, null));
    }

    public final synchronized zgp a(xyc xycVar) {
        woy.aa(!this.c, "Should only connect once.");
        this.c = true;
        if (!this.d) {
            return (zgp) xycVar.gu();
        }
        zgk zgkVar = zgk.a;
        if (zgkVar != null) {
            return zgkVar;
        }
        return new zgk();
    }

    public final synchronized zgp b(xyc xycVar) {
        woy.aa(!this.d, "Should only release once.");
        this.d = true;
        if (this.c) {
            return (zgp) xycVar.gu();
        }
        return wub.Y(true);
    }
}
