package If;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f5481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603m f5482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC0603m interfaceC0603m, Object obj, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5481b = oVar;
        this.f5482c = interfaceC0603m;
        this.f5483d = obj;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new k(this.f5481b, this.f5482c, this.f5483d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [lf.j, tf.q] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5480a;
        if (i5 == 0) {
            Fe.e.U(obj);
            ?? r42 = this.f5481b.f5498e;
            this.f5480a = 1;
            if (r42.invoke(this.f5482c, this.f5483d, this) == aVar) {
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
