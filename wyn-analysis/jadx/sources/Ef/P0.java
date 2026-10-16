package Ef;

import ef.C2527k;
import jf.C3104d;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class P0 extends Jf.q {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f3695e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public P0(InterfaceC3103c interfaceC3103c, InterfaceC3108h interfaceC3108h) {
        Q0 q02 = Q0.f3697a;
        super(interfaceC3103c, interfaceC3108h.get(q02) == null ? interfaceC3108h.plus(q02) : interfaceC3108h);
        this.f3695e = new ThreadLocal();
        if (interfaceC3103c.getContext().get(C3104d.f38758a) instanceof A) {
            return;
        }
        Object objN = Jf.b.n(interfaceC3108h, null);
        Jf.b.g(interfaceC3108h, objN);
        e0(interfaceC3108h, objN);
    }

    @Override // Jf.q
    public final void b0() {
        d0();
    }

    public final boolean c0() {
        boolean z2 = this.threadLocalIsSet && this.f3695e.get() == null;
        this.f3695e.remove();
        return !z2;
    }

    public final void d0() {
        if (this.threadLocalIsSet) {
            C2527k c2527k = (C2527k) this.f3695e.get();
            if (c2527k != null) {
                Jf.b.g((InterfaceC3108h) c2527k.f34671a, c2527k.f34672b);
            }
            this.f3695e.remove();
        }
    }

    public final void e0(InterfaceC3108h interfaceC3108h, Object obj) {
        this.threadLocalIsSet = true;
        this.f3695e.set(new C2527k(interfaceC3108h, obj));
    }

    @Override // Jf.q, Ef.z0
    public final void l(Object obj) {
        d0();
        Object objG = H.G(obj);
        InterfaceC3103c interfaceC3103c = this.f6134d;
        InterfaceC3108h context = interfaceC3103c.getContext();
        Object objN = Jf.b.n(context, null);
        P0 p0O = objN != Jf.b.f6100d ? H.O(interfaceC3103c, context, objN) : null;
        try {
            interfaceC3103c.resumeWith(objG);
            if (p0O == null || p0O.c0()) {
                Jf.b.g(context, objN);
            }
        } catch (Throwable th) {
            if (p0O == null || p0O.c0()) {
                Jf.b.g(context, objN);
            }
            throw th;
        }
    }
}
