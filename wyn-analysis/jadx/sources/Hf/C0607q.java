package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: Hf.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0607q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0607q(InterfaceC0602l interfaceC0602l, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5180b = interfaceC0602l;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C0607q(this.f5180b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0607q) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5179a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f5179a = 1;
            Object objCollect = this.f5180b.collect(If.y.f5521a, this);
            if (objCollect != aVar) {
                objCollect = c2515c;
            }
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return c2515c;
    }
}
