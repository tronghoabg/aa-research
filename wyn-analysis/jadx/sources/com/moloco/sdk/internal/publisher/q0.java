package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MediationInfo;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class q0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f29311a;

    /* renamed from: b, reason: collision with root package name */
    public long f29312b;

    /* renamed from: c, reason: collision with root package name */
    public int f29313c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f29315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f29316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MediationInfo f29317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.services.init.u f29318h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.moloco.sdk.acm.recorder.c cVar, r0 r0Var, String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.u uVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29314d = cVar;
        this.f29315e = r0Var;
        this.f29316f = str;
        this.f29317g = mediationInfo;
        this.f29318h = uVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new q0(this.f29314d, this.f29315e, this.f29316f, this.f29317g, this.f29318h, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.moloco.sdk.acm.l lVarC;
        long j8;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29313c;
        r0 r0Var = this.f29315e;
        if (i5 == 0) {
            Fe.e.U(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "startInitialization switch to Dispatchers.IO", null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
            lVarC = this.f29314d.c("sdk_init_time");
            r0Var.f29331a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.moloco.sdk.service_locator.f fVar = com.moloco.sdk.service_locator.f.f29845a;
            com.moloco.sdk.internal.services.init.s sVar = (com.moloco.sdk.internal.services.init.s) com.moloco.sdk.service_locator.f.f29849e.getValue();
            this.f29311a = lVarC;
            this.f29312b = jCurrentTimeMillis;
            this.f29313c = 1;
            obj = sVar.c(this.f29316f, this.f29317g, this);
            if (obj != aVar) {
                j8 = jCurrentTimeMillis;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.moloco.sdk.internal.A a5 = (com.moloco.sdk.internal.A) this.f29311a;
            Fe.e.U(obj);
            return a5;
        }
        j8 = this.f29312b;
        lVarC = (com.moloco.sdk.acm.l) this.f29311a;
        Fe.e.U(obj);
        com.moloco.sdk.acm.l lVar = lVarC;
        com.moloco.sdk.internal.A a10 = (com.moloco.sdk.internal.A) obj;
        r0Var.f29331a.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j8;
        this.f29311a = a10;
        this.f29313c = 2;
        return r0.a(this.f29315e, a10, jCurrentTimeMillis2, this.f29318h, this.f29314d, lVar, this) == aVar ? aVar : a10;
    }
}
