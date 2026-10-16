package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class swb implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
