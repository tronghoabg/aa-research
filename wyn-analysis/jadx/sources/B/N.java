package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class N extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1390a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Kd.a f1392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.i f1393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N.V f1394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Kd.a aVar, D.i iVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1392c = aVar;
        this.f1393d = iVar;
        this.f1394e = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        N n10 = new N(this.f1392c, this.f1393d, this.f1394e, interfaceC3103c);
        n10.f1391b = obj;
        return n10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((p0.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1390a;
        if (i5 == 0) {
            Fe.e.U(obj);
            p0.t tVar = (p0.t) this.f1391b;
            M m10 = new M(getContext(), this.f1392c, this.f1393d, this.f1394e, null);
            this.f1390a = 1;
            if (tVar.A(m10, this) == aVar) {
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
