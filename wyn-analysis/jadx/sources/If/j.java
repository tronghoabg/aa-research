package If;

import Hf.InterfaceC0602l;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class j extends i {
    public j(InterfaceC0602l interfaceC0602l, Ff.e eVar, int i5, Gf.a aVar, int i10) {
        super((i10 & 4) != 0 ? -3 : i5, (i10 & 8) != 0 ? Gf.a.f4780a : aVar, interfaceC0602l, (i10 & 2) != 0 ? C3109i.f38759a : eVar);
    }

    @Override // If.g
    public final g e(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return new j(i5, aVar, this.f5479d, interfaceC3108h);
    }

    @Override // If.g
    public final InterfaceC0602l f() {
        return this.f5479d;
    }

    @Override // If.i
    public final Object g(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        Object objCollect = this.f5479d.collect(interfaceC0603m, interfaceC3103c);
        return objCollect == kf.a.f39711a ? objCollect : C2515C.f34653a;
    }
}
