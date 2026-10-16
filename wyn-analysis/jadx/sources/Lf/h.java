package Lf;

import Ef.AbstractC0483d0;
import java.util.concurrent.Executor;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public abstract class h extends AbstractC0483d0 {

    /* renamed from: b, reason: collision with root package name */
    public c f7124b;

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        c.h(this.f7124b, runnable, 6);
    }

    @Override // Ef.A
    public final void o(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        c.h(this.f7124b, runnable, 2);
    }

    @Override // Ef.AbstractC0483d0
    public final Executor z() {
        return this.f7124b;
    }
}
