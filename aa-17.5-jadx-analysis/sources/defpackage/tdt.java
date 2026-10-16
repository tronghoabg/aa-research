package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class tdt extends tds implements zgp {
    private final zgp a;

    public tdt(zgp zgpVar, Thread thread) {
        super(zgpVar, thread);
        this.a = zgpVar;
    }

    @Override // defpackage.zgp
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        this.a.c(runnable, executor);
    }
}
