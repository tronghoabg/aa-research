package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ziq implements Executor {
    private volatile Executor a;

    public ziq(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = zfq.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
