package Y3;

import Cd.C0333a;
import Ef.E;
import Hf.K;
import Hf.f0;
import N.C0718d;
import ef.C2515C;
import jf.C3109i;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class j extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f16644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f16644b = nVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new j(this.f16644b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f16643a;
        if (i5 == 0) {
            Fe.e.U(obj);
            n nVar = this.f16644b;
            f0 f0VarN = C0718d.N(new A0.p(nVar, 15));
            h hVar = new h(nVar, null);
            int i10 = K.f5051a;
            If.o oVar = new If.o(new C0333a(hVar, (InterfaceC3103c) null), f0VarN, C3109i.f38759a, -2, Gf.a.f4780a);
            i iVar = new i(nVar);
            this.f16643a = 1;
            if (oVar.collect(iVar, this) == aVar) {
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
