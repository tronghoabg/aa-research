package com.moloco.sdk.internal.ilrd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public int f28562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f28563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f28563b = mVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new f(this.f28563b, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        return ((f) create((InterfaceC3103c) obj)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f28562a;
        if (i5 == 0) {
            Fe.e.U(obj);
            m mVar = this.f28563b;
            r rVar = mVar.f28596q;
            if (rVar != null) {
                rVar.f28641f = true;
            }
            this.f28562a = 1;
            if (m.d(mVar, this) == aVar) {
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
