package com.moloco.sdk.internal.ilrd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class i extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f28568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f28569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28569b = mVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f28569b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28568a;
        if (i5 == 0) {
            Fe.e.U(obj);
            this.f28568a = 1;
            if (m.d(this.f28569b, this) == aVar) {
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
