package K;

import A.C0212e;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687l extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f6270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212e f6271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6272c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687l(C0212e c0212e, float f10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f6271b = c0212e;
        this.f6272c = f10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C0687l(this.f6271b, this.f6272c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0687l) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f6270a;
        if (i5 == 0) {
            Fe.e.U(obj);
            L0.d dVar = new L0.d(this.f6272c);
            this.f6270a = 1;
            if (this.f6271b.e(dVar, this) == aVar) {
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
