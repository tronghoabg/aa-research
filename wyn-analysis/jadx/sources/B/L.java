package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class L extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N.V f1382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.i f1383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(D.i iVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1382b = v2;
        this.f1383c = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new L(this.f1383c, this.f1382b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1381a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f1381a = 1;
            if (E.b(this.f1383c, this.f1382b, this) == aVar) {
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
