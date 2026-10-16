package K;

import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: K.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686k extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f6267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D.i f6268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X.p f6269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0686k(D.i iVar, X.p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f6268b = iVar;
        this.f6269c = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C0686k(this.f6268b, this.f6269c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0686k) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f6267a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return C2515C.f34653a;
        }
        Fe.e.U(obj);
        j0 j0Var = this.f6268b.f2248a;
        B3.a aVar2 = new B3.a(this.f6269c, 1);
        this.f6267a = 1;
        j0Var.collect(aVar2, this);
        return aVar;
    }
}
