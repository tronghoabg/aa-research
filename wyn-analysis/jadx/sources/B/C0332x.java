package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: B.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332x extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public N.V f1491a;

    /* renamed from: b, reason: collision with root package name */
    public int f1492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f1493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.i f1494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0332x(D.i iVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1493c = v2;
        this.f1494d = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C0332x(this.f1494d, this.f1493c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0332x) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        N.V v2;
        N.V v10;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1492b;
        if (i5 == 0) {
            Fe.e.U(obj);
            v2 = this.f1493c;
            D.a aVar2 = (D.a) v2.getValue();
            if (aVar2 != null) {
                D.b bVar = new D.b(aVar2);
                D.i iVar = this.f1494d;
                if (iVar != null) {
                    this.f1491a = v2;
                    this.f1492b = 1;
                    if (iVar.a(bVar, this) == aVar) {
                        return aVar;
                    }
                    v10 = v2;
                }
                v2.setValue(null);
            }
            return C2515C.f34653a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v10 = this.f1491a;
        Fe.e.U(obj);
        v2 = v10;
        v2.setValue(null);
        return C2515C.f34653a;
    }
}
