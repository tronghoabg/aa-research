package u1;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4218g extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public int f46463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4215d f46464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4218g(InterfaceC4215d interfaceC4215d, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f46464b = interfaceC4215d;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new C4218g(this.f46464b, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        return ((C4218g) create((InterfaceC3103c) obj)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46463a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f46463a = 1;
            if (this.f46464b.cleanUp(this) == aVar) {
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
