package u0;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class E0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hf.v0 f46099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4165b0 f46100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(Hf.v0 v0Var, C4165b0 c4165b0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46099b = v0Var;
        this.f46100c = c4165b0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new E0(this.f46099b, this.f46100c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((E0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46098a;
        if (i5 == 0) {
            Fe.e.U(obj);
            B3.a aVar2 = new B3.a(this.f46100c, 10);
            this.f46098a = 1;
            if (this.f46099b.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        throw new E5.Q((byte) 0, 8);
    }
}
