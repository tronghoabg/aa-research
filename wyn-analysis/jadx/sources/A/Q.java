package A;

import N.C0718d;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class Q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f71a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f72b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f73c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f73c = u10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Q q4 = new Q(this.f73c, interfaceC3103c);
        q4.f72b = obj;
        return q4;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((Q) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Ef.E e7;
        P p10;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f71a;
        if (i5 == 0) {
            Fe.e.U(obj);
            e7 = (Ef.E) this.f72b;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e7 = (Ef.E) this.f72b;
            Fe.e.U(obj);
        }
        do {
            p10 = new P(this.f73c, AbstractC0226t.h(e7.getCoroutineContext()));
            this.f72b = e7;
            this.f71a = 1;
        } while (C0718d.B(getContext()).d(p10, this) != aVar);
        return aVar;
    }
}
