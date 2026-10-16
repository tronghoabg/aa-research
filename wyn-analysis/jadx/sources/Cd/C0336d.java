package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: Cd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0336d extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Fd.c f2093a;

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0336d c0336d = new C0336d(3, (InterfaceC3103c) obj3);
        c0336d.f2093a = (Fd.c) obj;
        c0336d.invokeSuspend(C2515C.f34653a);
        return null;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        if (this.f2093a.f4050f.d(AbstractC0338f.f2099a) == null) {
            return null;
        }
        throw new ClassCastException();
    }
}
