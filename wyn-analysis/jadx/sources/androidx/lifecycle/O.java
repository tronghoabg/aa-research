package androidx.lifecycle;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class O extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f18620a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1451o f18622c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC1450n f18623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ G1.c f18624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(AbstractC1451o abstractC1451o, EnumC1450n enumC1450n, G1.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f18622c = abstractC1451o;
        this.f18623d = enumC1450n;
        this.f18624e = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        O o7 = new O(this.f18622c, this.f18623d, this.f18624e, interfaceC3103c);
        o7.f18621b = obj;
        return o7;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f18620a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Ef.E e7 = (Ef.E) this.f18621b;
            Lf.e eVar = Ef.S.f3698a;
            Ff.e eVar2 = Jf.n.f6132a.f4117e;
            N n10 = new N(this.f18622c, this.f18623d, e7, this.f18624e, null);
            this.f18620a = 1;
            if (Ef.H.P(eVar2, n10, this) == aVar) {
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
