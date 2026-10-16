package If;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class F extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5455a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603m f5457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5457c = interfaceC0603m;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        F f10 = new F(this.f5457c, interfaceC3103c);
        f10.f5456b = obj;
        return f10;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create(obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5455a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Object obj2 = this.f5456b;
            this.f5455a = 1;
            if (this.f5457c.emit(obj2, this) == aVar) {
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
