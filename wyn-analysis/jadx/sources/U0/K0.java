package u0;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class K0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f46133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(M0 m02, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46133b = m02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new K0(this.f46133b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46132a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        C4188n c4188n = this.f46133b.f46155a;
        this.f46132a = 1;
        Object objJ = c4188n.f46305l.j(this);
        if (objJ != aVar) {
            objJ = c2515c;
        }
        return objJ == aVar ? aVar : c2515c;
    }
}
