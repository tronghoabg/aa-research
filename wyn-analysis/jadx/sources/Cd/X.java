package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class X extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f2040a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f2041b;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        X x5 = new X(2, interfaceC3103c);
        x5.f2041b = ((Number) obj).longValue();
        return x5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create(Long.valueOf(((Number) obj).longValue()), (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f2040a;
        if (i5 == 0) {
            Fe.e.U(obj);
            long j8 = this.f2041b;
            this.f2040a = 1;
            if (Ef.H.m(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
