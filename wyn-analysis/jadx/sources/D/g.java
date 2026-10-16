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
public final class g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f2247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f2246b = iVar;
        this.f2247c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new g(this.f2246b, this.f2247c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f2245a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return C2515C.f34653a;
        }
        Fe.e.U(obj);
        ArrayList arrayList = new ArrayList();
        j0 j0Var = this.f2246b.f2248a;
        c cVar = new c(arrayList, this.f2247c, 1);
        this.f2245a = 1;
        j0Var.collect(cVar, this);
        return aVar;
    }
}
