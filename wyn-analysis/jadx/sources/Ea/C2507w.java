package ea;

import Hf.Z;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: ea.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2507w extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f34586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2480D f34587b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2507w(C2480D c2480d, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34587b = c2480d;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2507w(this.f34587b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2507w) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34586a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2480D c2480d = this.f34587b;
            Z z2 = c2480d.f34453d;
            B3.a aVar2 = new B3.a(c2480d, 9);
            this.f34586a = 1;
            if (z2.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
