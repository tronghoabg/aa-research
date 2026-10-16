package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pj implements Executor {
    private final /* synthetic */ int a;

    public pj(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            new Thread(runnable).start();
        } else {
            ((pl) pk.bn().d).d.execute(runnable);
        }
    }
}
