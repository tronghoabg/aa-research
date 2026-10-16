package M;

import A.AbstractC0226t;
import A.C0212e;
import A.C0225s;
import A.Z;
import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7178b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f7178b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7177a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C0212e c0212e = this.f7178b.f7195g;
            Float f10 = new Float(1.0f);
            Z zJ = AbstractC0226t.j(75, C0225s.f182a, 2);
            this.f7177a = 1;
            if (C0212e.c(c0212e, f10, zJ, this) == aVar) {
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
