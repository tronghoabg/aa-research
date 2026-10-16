package If;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class h extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5476a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5478c = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        h hVar = new h(this.f5478c, interfaceC3103c);
        hVar.f5477b = obj;
        return hVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5476a;
        if (i5 == 0) {
            Fe.e.U(obj);
            InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.f5477b;
            this.f5476a = 1;
            if (this.f5478c.g(interfaceC0603m, this) == aVar) {
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
