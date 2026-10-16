package Ef;

import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public final class A0 extends L {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3103c f3656d;

    public A0(InterfaceC3108h interfaceC3108h, tf.p pVar) {
        super(interfaceC3108h, false);
        this.f3656d = A6.h.q(this, this, pVar);
    }

    @Override // Ef.z0
    public final void Q() {
        try {
            Jf.b.h(C2515C.f34653a, A6.h.A(this.f3656d));
        } catch (Throwable th) {
            AbstractC3935e.v(this, th);
            throw null;
        }
    }
}
