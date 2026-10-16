package com.moloco.sdk.internal.scheduling;

import Ef.E;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.a f29367a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tf.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29367a = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f29367a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        bVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        e.U(obj);
        this.f29367a.invoke();
        return C2515C.f34653a;
    }
}
