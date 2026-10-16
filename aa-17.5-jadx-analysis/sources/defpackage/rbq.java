package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
final class rbq implements Runnable {
    public final Runnable a;
    public final Handler b;
    final /* synthetic */ rbr c;

    public rbq(rbr rbrVar, Runnable runnable, Handler handler) {
        this.c = rbrVar;
        this.a = runnable;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e.post(new ral(this, 2));
        this.a.run();
    }
}
