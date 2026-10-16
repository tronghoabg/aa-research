package ga;

import Ef.E;
import Hf.InterfaceC0602l;
import Hf.k0;
import ef.C2515C;
import ff.AbstractC2640A;
import j$.util.DesugarCollections;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;
import x1.C4449b;

/* loaded from: classes4.dex */
public final class k extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public n f35812a;

    /* renamed from: b, reason: collision with root package name */
    public int f35813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f35814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35814c = nVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f35814c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35813b;
        if (i5 == 0) {
            Fe.e.U(obj);
            n nVar2 = this.f35814c;
            InterfaceC0602l data = nVar2.f35827a.getData();
            this.f35812a = nVar2;
            this.f35813b = 1;
            Object objO = k0.o(data, this);
            if (objO == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj = objO;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f35812a;
            Fe.e.U(obj);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((C4449b) obj).f47646a);
        AbstractC3340k.d(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        n.a(nVar, new C4449b(AbstractC2640A.a0(mapUnmodifiableMap), true));
        return C2515C.f34653a;
    }
}
