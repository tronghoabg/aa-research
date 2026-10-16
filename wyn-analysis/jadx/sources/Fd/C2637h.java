package fd;

import a.AbstractC1304a;
import ef.C2515C;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x1.C4449b;
import x1.C4452e;

/* renamed from: fd.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2637h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f35336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2637h(List list, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35336b = list;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2637h c2637h = new C2637h(this.f35336b, interfaceC3103c);
        c2637h.f35335a = obj;
        return c2637h;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2637h c2637h = (C2637h) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2637h.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        C4449b c4449b = (C4449b) this.f35335a;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        List list = this.f35336b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4452e c4452eK = AbstractC1304a.k((String) it.next());
                c4449b.getClass();
                c4449b.a();
                c4449b.f47646a.remove(c4452eK);
            }
        } else {
            c4449b.a();
            c4449b.f47646a.clear();
        }
        return C2515C.f34653a;
    }
}
