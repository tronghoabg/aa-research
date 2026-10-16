package ga;

import cb.AbstractC1593a;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: ga.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2717c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35787a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2717c c2717c = new C2717c(2, interfaceC3103c);
        c2717c.f35787a = obj;
        return c2717c;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2717c c2717c = (C2717c) create((String) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2717c.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        AbstractC1593a.t("Error failing to fetch the remote configs: ", (String) this.f35787a, "SessionConfigFetcher");
        return C2515C.f34653a;
    }
}
