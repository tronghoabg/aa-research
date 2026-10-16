package android.support.v7.app;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class s implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
