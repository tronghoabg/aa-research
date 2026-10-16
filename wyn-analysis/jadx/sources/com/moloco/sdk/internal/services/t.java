package com.moloco.sdk.internal.services;

import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class t extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f29718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29718a = uVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new t(this.f29718a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        t tVar = (t) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        tVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "AnalyticsApplicationLifecycleTrackerImpl", "Tracking next bg / fg of the application", false, 4, null);
        u uVar = this.f29718a;
        boolean z2 = uVar.f29722d;
        m mVar = uVar.f29720b;
        if (!z2) {
            MolocoLogger.debug$default(molocoLogger, "AnalyticsApplicationLifecycleTrackerImpl", "Observing application lifecycle events", false, 4, null);
            uVar.f29719a.a(mVar);
            uVar.f29722d = true;
        }
        mVar.f29712d = true;
        return C2515C.f34653a;
    }
}
