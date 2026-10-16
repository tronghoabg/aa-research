package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
final class yuv implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ yux b;

    public yuv(yux yuxVar, Executor executor) {
        this.a = executor;
        this.b = yuxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.b.p(e);
        }
    }
}
