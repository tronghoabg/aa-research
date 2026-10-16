package A;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: A.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211d extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0212e f139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211d(C0212e c0212e, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f139a = c0212e;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new C0211d(this.f139a, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C0211d c0211d = (C0211d) create((InterfaceC3103c) obj);
        C2515C c2515c = C2515C.f34653a;
        c0211d.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C0212e.b(this.f139a);
        return C2515C.f34653a;
    }
}
