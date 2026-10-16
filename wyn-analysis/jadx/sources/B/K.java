package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class K extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D.i f1379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f1380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(D.i iVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1379b = iVar;
        this.f1380c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new K(this.f1379b, this.f1380c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1378a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f1378a = 1;
            if (E.a(this.f1379b, this.f1380c, this) == aVar) {
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
