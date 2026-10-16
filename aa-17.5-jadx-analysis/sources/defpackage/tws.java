package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class tws implements Runnable, upw {
    private final Executor a;
    private final zhc b;
    private int c;

    public tws(Executor executor, zhc zhcVar, int i) {
        woy.Q(i > 0, "BackgroundBarrier given a count <= 0: %s", i);
        this.a = executor;
        this.b = zhcVar;
        this.c = i;
    }

    @Override // defpackage.upw
    public final void a(upy upyVar) {
        int i;
        synchronized (this) {
            i = this.c - 1;
            this.c = i;
        }
        if (i == 0) {
            this.a.execute(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.o(null);
    }
}
