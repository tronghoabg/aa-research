package G1;

import Ef.H;
import Hf.v0;
import N.C0721e0;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.O;
import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4149a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1451o f4151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC1450n f4152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3108h f4153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f4154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC1451o abstractC1451o, EnumC1450n enumC1450n, InterfaceC3108h interfaceC3108h, v0 v0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f4151c = abstractC1451o;
        this.f4152d = enumC1450n;
        this.f4153e = interfaceC3108h;
        this.f4154f = v0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        d dVar = new d(this.f4151c, this.f4152d, this.f4153e, this.f4154f, interfaceC3103c);
        dVar.f4150b = obj;
        return dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((C0721e0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f4149a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        c cVar = new c(this.f4153e, this.f4154f, (C0721e0) this.f4150b, null);
        this.f4149a = 1;
        EnumC1450n enumC1450n = EnumC1450n.f18677b;
        EnumC1450n enumC1450n2 = this.f4152d;
        if (enumC1450n2 == enumC1450n) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        AbstractC1451o abstractC1451o = this.f4151c;
        if (abstractC1451o.b() == EnumC1450n.f18676a || (objL = H.l(new O(abstractC1451o, enumC1450n2, cVar, null), this)) != aVar) {
            objL = c2515c;
        }
        return objL == aVar ? aVar : c2515c;
    }
}
