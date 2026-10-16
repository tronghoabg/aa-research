package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class s extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f29717a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29717a = uVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new s(this.f29717a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        s sVar = (s) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        sVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        u uVar = this.f29717a;
        if (!uVar.f29722d) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
            uVar.f29719a.a(uVar.f29720b);
            uVar.f29722d = true;
        }
        return C2515C.f34653a;
    }
}
