package Ef;

import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class O0 extends A {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3693b = 0;

    static {
        new O0();
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        S0 s02 = (S0) interfaceC3108h.get(S0.f3699b);
        if (s02 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        s02.f3700a = true;
    }

    @Override // Ef.A
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
