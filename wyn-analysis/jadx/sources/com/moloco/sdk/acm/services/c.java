package com.moloco.sdk.acm.services;

import Ef.E;
import androidx.lifecycle.AbstractC1451o;
import b7.k;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f28469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f28469a = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f28469a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        cVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        k kVar = this.f28469a;
        if (((AtomicBoolean) kVar.f19398d).compareAndSet(false, true)) {
            e.c("ApplicationLifecycleObserver", "Start observing application lifecycle events");
            ((AbstractC1451o) kVar.f19396b).a((b) kVar.f19397c);
        }
        return C2515C.f34653a;
    }
}
