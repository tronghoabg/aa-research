package com.moloco.sdk.internal.publisher;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class n0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29099a;

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        n0 n0Var = new n0(2, interfaceC3103c);
        n0Var.f29099a = obj;
        return n0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((com.moloco.sdk.internal.e) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return Boolean.valueOf(((com.moloco.sdk.internal.e) this.f29099a) != null);
    }
}
