package D;

import Ef.E;
import Hf.j0;
import N.V;
import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f2243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f2242b = iVar;
        this.f2243c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f2242b, this.f2243c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f2241a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return C2515C.f34653a;
        }
        Fe.e.U(obj);
        ArrayList arrayList = new ArrayList();
        j0 j0Var = this.f2242b.f2248a;
        c cVar = new c(arrayList, this.f2243c, 0);
        this.f2241a = 1;
        j0Var.collect(cVar, this);
        return aVar;
    }
}
