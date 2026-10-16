package If;

import Ef.H;
import Hf.InterfaceC0603m;
import Hf.k0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: If.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0624e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5466a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603m f5468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f5469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624e(InterfaceC0603m interfaceC0603m, g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5468c = interfaceC0603m;
        this.f5469d = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0624e c0624e = new C0624e(this.f5468c, this.f5469d, interfaceC3103c);
        c0624e.f5467b = obj;
        return c0624e;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0624e) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5466a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        Ef.E e7 = (Ef.E) this.f5467b;
        g gVar = this.f5469d;
        int i10 = gVar.f5474b;
        if (i10 == -3) {
            i10 = -2;
        }
        Ef.F f10 = Ef.F.f3665c;
        tf.p c0625f = new C0625f(gVar, null);
        Gf.s sVar = new Gf.s(H.E(e7, gVar.f5473a), ic.d.a(i10, 4, gVar.f5475c));
        sVar.a0(f10, sVar, c0625f);
        this.f5466a = 1;
        Object objN = k0.n(this.f5468c, sVar, true, this);
        if (objN != aVar) {
            objN = c2515c;
        }
        return objN == aVar ? aVar : c2515c;
    }
}
