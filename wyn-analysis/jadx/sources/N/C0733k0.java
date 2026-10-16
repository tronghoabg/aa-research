package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: N.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733k0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7801a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0733k0 c0733k0 = new C0733k0(2, interfaceC3103c);
        c0733k0.f7801a = obj;
        return c0733k0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0733k0) create((EnumC0731j0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(((EnumC0731j0) this.f7801a) == EnumC0731j0.f7793a);
    }
}
