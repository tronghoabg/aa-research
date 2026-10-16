package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class ifp implements Executor {
    private final /* synthetic */ int a;

    public ifp(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            ify.g(runnable);
        } else {
            runnable.run();
        }
    }
}
