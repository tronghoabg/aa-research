package zd;

import Cd.s0;
import Ef.C0499l0;
import Ef.E;
import Ef.InterfaceC0501m0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f48479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f48480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fd.d f48481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Fd.d dVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f48480b = cVar;
        this.f48481c = dVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f48480b, this.f48481c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f48479a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        c cVar = this.f48480b;
        InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) ((e) cVar).getCoroutineContext().get(C0499l0.f3748a);
        if (!(interfaceC0501m0 != null ? interfaceC0501m0.isActive() : false)) {
            throw new s0("Client already closed", 10);
        }
        this.f48479a = 1;
        Object objA = ((Ad.e) cVar).a(this.f48481c, this);
        return objA == aVar ? aVar : objA;
    }
}
