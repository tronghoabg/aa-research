package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class A extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G.e f1349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f1350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(G.e eVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1349b = eVar;
        this.f1350c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new A(this.f1349b, this.f1350c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1348a;
        if (i5 == 0) {
            Fe.e.U(obj);
            if (this.f1350c.getValue() != null) {
                throw new ClassCastException();
            }
            G.e eVar = this.f1349b;
            this.f1348a = 1;
            if (eVar.a(this) == aVar) {
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
