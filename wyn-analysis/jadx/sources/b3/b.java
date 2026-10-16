package B3;

import D3.i;
import Ef.E;
import Fe.e;
import Hf.InterfaceC0602l;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f1577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f1578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0602l interfaceC0602l, i iVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1577b = interfaceC0602l;
        this.f1578c = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f1577b, this.f1578c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1576a;
        if (i5 == 0) {
            e.U(obj);
            a aVar2 = new a(this.f1578c, 0);
            this.f1576a = 1;
            if (this.f1577b.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.U(obj);
        }
        return C2515C.f34653a;
    }
}
