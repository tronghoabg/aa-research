package C;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;
import p0.s;
import tf.p;

/* loaded from: classes.dex */
public final class a extends AbstractC3470i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1699a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1700b;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        a aVar = new a(2, interfaceC3103c);
        aVar.f1700b = obj;
        return aVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((s) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1699a;
        if (i5 == 0) {
            Fe.e.U(obj);
            s sVar = (s) this.f1700b;
            this.f1699a = 1;
            if (A6.c.h(sVar, this) == aVar) {
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
