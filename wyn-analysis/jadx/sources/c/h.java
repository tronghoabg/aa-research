package C;

import d0.C2384c;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.q;

/* loaded from: classes.dex */
public final class h extends AbstractC3471j implements q {
    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j8 = ((C2384c) obj2).f33935a;
        h hVar = new h(3, (InterfaceC3103c) obj3);
        C2515C c2515c = C2515C.f34653a;
        hVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return C2515C.f34653a;
    }
}
