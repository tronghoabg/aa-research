package z;

import A.C0212e;
import A.C0214g;
import A.InterfaceC0216i;
import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f48248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f48249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f48250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f48251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, long j8, s sVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f48249b = qVar;
        this.f48250c = j8;
        this.f48251d = sVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new r(this.f48249b, this.f48250c, this.f48251d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f48248a;
        s sVar = this.f48251d;
        if (i5 == 0) {
            Fe.e.U(obj);
            C0212e c0212e = this.f48249b.f48246a;
            L0.h hVar = new L0.h(this.f48250c);
            InterfaceC0216i interfaceC0216i = sVar.f48252a;
            this.f48248a = 1;
            obj = C0212e.c(c0212e, hVar, interfaceC0216i, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        if (((C0214g) obj).f156b == 2) {
            sVar.getClass();
        }
        return C2515C.f34653a;
    }
}
