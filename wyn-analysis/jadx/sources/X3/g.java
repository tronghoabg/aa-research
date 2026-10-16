package X3;

import Ef.E;
import Ef.H;
import Ef.L;
import Ef.S;
import Jf.n;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f16092a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.h f16094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f16095d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, h4.h hVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f16094c = hVar;
        this.f16095d = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        g gVar = new g(this.f16095d, this.f16094c, interfaceC3103c);
        gVar.f16093b = obj;
        return gVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f16092a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        E e7 = (E) this.f16093b;
        Lf.e eVar = S.f3698a;
        L lH = H.h(e7, n.f6132a.f4117e, new f(this.f16095d, this.f16094c, null), 2);
        this.f16092a = 1;
        Object objP = lH.p(this);
        return objP == aVar ? aVar : objP;
    }
}
