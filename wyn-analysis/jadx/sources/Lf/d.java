package Lf;

import Ef.A;
import Ef.AbstractC0483d0;
import Jf.t;
import java.util.concurrent.Executor;
import jf.C3109i;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class d extends AbstractC0483d0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final d f7120b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final A f7121c;

    static {
        l lVar = l.f7134b;
        int i5 = t.f6138a;
        if (64 >= i5) {
            i5 = 64;
        }
        f7121c = lVar.y(Jf.b.l(i5, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(C3109i.f38759a, runnable);
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        f7121c.i(interfaceC3108h, runnable);
    }

    @Override // Ef.A
    public final void o(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        f7121c.o(interfaceC3108h, runnable);
    }

    @Override // Ef.A
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // Ef.A
    public final A y(int i5) {
        return l.f7134b.y(1);
    }

    @Override // Ef.AbstractC0483d0
    public final Executor z() {
        return this;
    }
}
