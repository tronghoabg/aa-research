package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ab f51369a;

    public au(ab abVar) {
        this.f51369a = abVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h.c.k kVar = h.c.k.f48060a;
        ab abVar = this.f51369a;
        if (kotlinx.coroutines.e.k.d(abVar, kVar)) {
            kotlinx.coroutines.e.k.c(abVar, kVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f51369a.toString();
    }
}
