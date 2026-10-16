package com.moloco.sdk.acm.services;

import Ef.E;
import ef.C2515C;
import java.util.Iterator;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28470a = str;
        this.f28471b = str2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f28470a, this.f28471b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        dVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Iterator it = e.f28473b.iterator();
        if (!it.hasNext()) {
            return C2515C.f34653a;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        Kd.a aVar2 = e.f28472a;
        e.f(this.f28470a);
        throw null;
    }
}
