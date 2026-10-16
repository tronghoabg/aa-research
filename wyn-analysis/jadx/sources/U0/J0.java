package u0;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class J0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f46130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(M0 m02, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46130b = m02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new J0(this.f46130b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46129a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        C4188n c4188n = this.f46130b.f46155a;
        this.f46129a = 1;
        Object objK = c4188n.f46279S.k(this);
        if (objK != aVar) {
            objK = c2515c;
        }
        return objK == aVar ? aVar : c2515c;
    }
}
