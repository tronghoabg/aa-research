package If;

import Ef.H;
import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class o extends i {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC3471j f5498e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(tf.q qVar, InterfaceC0602l interfaceC0602l, InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        super(i5, aVar, interfaceC0602l, interfaceC3108h);
        this.f5498e = (AbstractC3471j) qVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [lf.j, tf.q] */
    @Override // If.g
    public final g e(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return new o(this.f5498e, this.f5479d, interfaceC3108h, i5, aVar);
    }

    @Override // If.i
    public final Object g(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        Object objL = H.l(new n(this, interfaceC0603m, null), interfaceC3103c);
        return objL == kf.a.f39711a ? objL : C2515C.f34653a;
    }
}
