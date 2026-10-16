package Lf;

import Ef.A;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class l extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final l f7134b = new l();

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        e.f7122c.f7124b.d(runnable, true, false);
    }

    @Override // Ef.A
    public final void o(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        e.f7122c.f7124b.d(runnable, true, true);
    }

    @Override // Ef.A
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // Ef.A
    public final A y(int i5) {
        Jf.b.a(i5);
        return i5 >= k.f7131d ? this : super.y(i5);
    }
}
