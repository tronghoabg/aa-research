package M;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class b extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f7155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.k f7156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, c cVar, D.k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7154b = oVar;
        this.f7155c = cVar;
        this.f7156d = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f7154b, this.f7155c, this.f7156d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7153a;
        D.k kVar = this.f7156d;
        c cVar = this.f7155c;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                o oVar = this.f7154b;
                this.f7153a = 1;
                if (oVar.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            cVar.f7161f.remove(kVar);
            return C2515C.f34653a;
        } catch (Throwable th) {
            cVar.f7161f.remove(kVar);
            throw th;
        }
    }
}
