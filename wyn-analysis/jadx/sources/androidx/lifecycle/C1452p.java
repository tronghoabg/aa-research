package androidx.lifecycle;

import Ef.C0499l0;
import Ef.InterfaceC0501m0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452p extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1453q f18684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1452p(C1453q c1453q, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f18684b = c1453q;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C1452p c1452p = new C1452p(this.f18684b, interfaceC3103c);
        c1452p.f18683a = obj;
        return c1452p;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C1452p c1452p = (C1452p) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c1452p.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Ef.E e7 = (Ef.E) this.f18683a;
        C1453q c1453q = this.f18684b;
        AbstractC1451o abstractC1451o = c1453q.f18685a;
        if (abstractC1451o.b().compareTo(EnumC1450n.f18677b) >= 0) {
            abstractC1451o.a(c1453q);
        } else {
            InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) e7.getCoroutineContext().get(C0499l0.f3748a);
            if (interfaceC0501m0 != null) {
                interfaceC0501m0.cancel(null);
            }
        }
        return C2515C.f34653a;
    }
}
