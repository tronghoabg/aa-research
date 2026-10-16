package Ef;

import java.util.concurrent.Executor;
import jf.C3109i;

/* loaded from: classes5.dex */
public final class Q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final A f3696a;

    public Q(A a5) {
        this.f3696a = a5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws N {
        C3109i c3109i = C3109i.f38759a;
        A a5 = this.f3696a;
        if (Jf.b.j(a5, c3109i)) {
            Jf.b.i(a5, c3109i, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f3696a.toString();
    }
}
