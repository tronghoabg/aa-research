package com.moloco.sdk.acm.eventprocessing;

import C6.l;
import Ef.E;
import Y2.B;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class h extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f28401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28401a = lVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h(this.f28401a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        hVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        ((B) this.f28401a.f1844a).a();
        return C2515C.f34653a;
    }
}
