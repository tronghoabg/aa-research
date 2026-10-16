package com.moloco.sdk.internal.services.init;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class g extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f29653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29653a = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new g(this.f29653a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        gVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f29653a.f29664a.edit().clear().commit();
        return C2515C.f34653a;
    }
}
