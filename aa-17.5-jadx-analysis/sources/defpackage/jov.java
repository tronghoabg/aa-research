package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class jov implements jcx {
    public static final yph a = yph.c("GH.MTMCByteCounter");
    public final jfg b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    public volatile long f = -1;

    public jov(jfg jfgVar) {
        this.b = jfgVar;
    }

    @Override // defpackage.jcx
    public final void a(long j) {
        if (this.c.get()) {
            this.d.addAndGet(j);
        } else {
            TimeUnit.SECONDS.getClass();
        }
    }

    @Override // defpackage.jcx
    public final void b(long j) {
        if (this.c.get()) {
            this.e.addAndGet(j);
        } else {
            TimeUnit.SECONDS.getClass();
        }
    }
}
