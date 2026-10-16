package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class A extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1984b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(boolean z2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1984b = z2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        A a5 = new A(this.f1984b, interfaceC3103c);
        a5.f1983a = obj;
        return a5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        A a5 = (A) create((Fd.c) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        a5.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        ((Fd.c) this.f1983a).f4050f.a(F.f2002c, new C0357z(this.f1984b, 0));
        return C2515C.f34653a;
    }
}
