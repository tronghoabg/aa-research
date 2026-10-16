package com.moloco.sdk.internal.services.bidtoken;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class y extends AbstractC3471j implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public int f29569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f29570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.z f29571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a5, com.moloco.sdk.internal.z zVar, InterfaceC3103c interfaceC3103c) {
        super(1, interfaceC3103c);
        this.f29570b = a5;
        this.f29571c = zVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(InterfaceC3103c interfaceC3103c) {
        return new y(this.f29570b, this.f29571c, interfaceC3103c);
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        return ((y) create((InterfaceC3103c) obj)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29569a;
        if (i5 == 0) {
            Fe.e.U(obj);
            G9.e eVar = this.f29570b.f29410c;
            m mVar = (m) this.f29571c.f29794a;
            this.f29569a = 1;
            if (eVar.d(mVar, this) == aVar) {
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
