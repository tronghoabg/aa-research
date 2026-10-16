package com.moloco.sdk.internal.services.bidtoken;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f29572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f29573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a5, com.moloco.sdk.acm.recorder.c cVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29573b = a5;
        this.f29574c = cVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new z(this.f29573b, this.f29574c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29572a;
        if (i5 == 0) {
            Fe.e.U(obj);
            A.d("[Thread: " + Thread.currentThread().getName() + "] Fetching token from server");
            m mVar = f.f29435b;
            this.f29572a = 1;
            if (this.f29573b.a(this.f29574c, mVar, true, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        A.d("[Thread: " + Thread.currentThread().getName() + "] Finished fetching token from server");
        return C2515C.f34653a;
    }
}
