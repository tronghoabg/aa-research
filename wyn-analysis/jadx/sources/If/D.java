package If;

import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.InterfaceC3465d;

/* loaded from: classes5.dex */
public final class D implements InterfaceC3103c, InterfaceC3465d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3103c f5453a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3108h f5454b;

    public D(InterfaceC3103c interfaceC3103c, InterfaceC3108h interfaceC3108h) {
        this.f5453a = interfaceC3103c;
        this.f5454b = interfaceC3108h;
    }

    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        InterfaceC3103c interfaceC3103c = this.f5453a;
        if (interfaceC3103c instanceof InterfaceC3465d) {
            return (InterfaceC3465d) interfaceC3103c;
        }
        return null;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        return this.f5454b;
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        this.f5453a.resumeWith(obj);
    }
}
