package Rd;

import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.InterfaceC3465d;

/* loaded from: classes5.dex */
public final class j implements InterfaceC3465d, InterfaceC3103c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f10605a = new j();

    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        return null;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return C3109i.f38759a;
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
