package io.ktor.utils.io;

import Ef.H0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class D extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public int f37333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f37334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H0 h02, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f37334b = h02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new D(this.f37334b, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        return ((D) create((InterfaceC3103c) obj)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f37333a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f37333a = 1;
            if (this.f37334b.join(this) == aVar) {
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
