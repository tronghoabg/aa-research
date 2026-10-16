package If;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: If.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0625f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5470a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f5472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0625f(g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5472c = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0625f c0625f = new C0625f(this.f5472c, interfaceC3103c);
        c0625f.f5471b = obj;
        return c0625f;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0625f) create((Gf.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5470a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Gf.t tVar = (Gf.t) this.f5471b;
            this.f5470a = 1;
            if (this.f5472c.d(tVar, this) == aVar) {
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
