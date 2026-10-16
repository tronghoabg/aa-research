package M;

import A.C0212e;
import A.Z;
import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class w extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f7222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, float f10, Z z2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7220b = yVar;
        this.f7221c = f10;
        this.f7222d = z2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new w(this.f7220b, this.f7221c, this.f7222d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7219a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C0212e c0212e = (C0212e) this.f7220b.f7228c;
            Float f10 = new Float(this.f7221c);
            this.f7219a = 1;
            if (C0212e.c(c0212e, f10, this.f7222d, this) == aVar) {
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
