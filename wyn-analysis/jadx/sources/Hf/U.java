package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class U extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f5083a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        U u10 = new U(2, interfaceC3103c);
        u10.f5083a = ((Number) obj).intValue();
        return u10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(this.f5083a > 0);
    }
}
