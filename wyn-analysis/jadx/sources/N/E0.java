package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class E0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hf.v0 f7680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0721e0 f7681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(Hf.v0 v0Var, C0721e0 c0721e0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7680b = v0Var;
        this.f7681c = c0721e0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new E0(this.f7680b, this.f7681c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7679a;
        if (i5 == 0) {
            Fe.e.U(obj);
            G1.a aVar2 = new G1.a(this.f7681c, 3);
            this.f7679a = 1;
            if (this.f7680b.collect(aVar2, this) == aVar) {
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
