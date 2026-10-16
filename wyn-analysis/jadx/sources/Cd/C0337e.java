package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: Cd.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0337e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2095a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0337e c0337e = new C0337e(2, interfaceC3103c);
        c0337e.f2095a = obj;
        return c0337e;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((C0337e) create((Gd.a) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return null;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        if (((Gd.a) this.f2095a).c().d().b().d(AbstractC0338f.f2100b) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
