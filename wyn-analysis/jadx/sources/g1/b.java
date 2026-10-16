package G1;

import Ef.E;
import Hf.v0;
import N.C0721e0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f4143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0721e0 f4144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v0 v0Var, C0721e0 c0721e0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f4143b = v0Var;
        this.f4144c = c0721e0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f4143b, this.f4144c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f4142a;
        if (i5 == 0) {
            Fe.e.U(obj);
            a aVar2 = new a(this.f4144c, 1);
            this.f4142a = 1;
            if (this.f4143b.collect(aVar2, this) == aVar) {
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
