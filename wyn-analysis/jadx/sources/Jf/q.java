package Jf;

import Ef.AbstractC0476a;
import Ef.H;
import Ef.N;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.InterfaceC3465d;

/* loaded from: classes5.dex */
public class q extends AbstractC0476a implements InterfaceC3465d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3103c f6134d;

    public q(InterfaceC3103c interfaceC3103c, InterfaceC3108h interfaceC3108h) {
        super(interfaceC3108h, true);
        this.f6134d = interfaceC3103c;
    }

    @Override // Ef.z0
    public final boolean J() {
        return true;
    }

    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        InterfaceC3103c interfaceC3103c = this.f6134d;
        if (interfaceC3103c instanceof InterfaceC3465d) {
            return (InterfaceC3465d) interfaceC3103c;
        }
        return null;
    }

    @Override // Ef.z0
    public void k(Object obj) throws N {
        b.h(H.G(obj), A6.h.A(this.f6134d));
    }

    @Override // Ef.z0
    public void l(Object obj) {
        this.f6134d.resumeWith(H.G(obj));
    }

    public void b0() {
    }
}
