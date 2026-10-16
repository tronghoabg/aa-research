package Ef;

import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class N extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3687a;

    public N(Throwable th, A a5, InterfaceC3108h interfaceC3108h) {
        super("Coroutine dispatcher " + a5 + " threw an exception, context = " + interfaceC3108h, th);
        this.f3687a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3687a;
    }
}
