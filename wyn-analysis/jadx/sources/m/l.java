package M;

import Ef.E;
import Ef.H;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7184b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        l lVar = new l(this.f7184b, interfaceC3103c);
        lVar.f7183a = obj;
        return lVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        E e7 = (E) this.f7183a;
        o oVar = this.f7184b;
        H.D(e7, null, new i(oVar, null), 3);
        H.D(e7, null, new j(oVar, null), 3);
        return H.D(e7, null, new k(oVar, null), 3);
    }
}
