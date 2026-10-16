package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class xtf implements Runnable {
    public zfj a;
    public Executor b;

    public xtf(zfj zfjVar, Executor executor) {
        this.a = zfjVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
