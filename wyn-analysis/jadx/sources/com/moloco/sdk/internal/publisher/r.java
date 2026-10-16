package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f29319a;

    /* renamed from: b, reason: collision with root package name */
    public String f29320b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29321c;

    /* renamed from: d, reason: collision with root package name */
    public long f29322d;

    /* renamed from: e, reason: collision with root package name */
    public int f29323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1929s f29324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f29326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f29327i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f29328j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1929s c1929s, com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29324f = c1929s;
        this.f29325g = cVar;
        this.f29326h = str;
        this.f29327i = str2;
        this.f29328j = str3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new r(this.f29324f, this.f29325g, this.f29326h, this.f29327i, this.f29328j, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        Object objB;
        String str;
        long j8;
        com.moloco.sdk.acm.l lVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29323e;
        C1929s c1929s = this.f29324f;
        com.moloco.sdk.acm.recorder.c cVar = this.f29325g;
        String adUnitId = this.f29326h;
        com.moloco.sdk.internal.services.k kVar = c1929s.f29337b;
        if (i5 == 0) {
            Fe.e.U(obj);
            c0Var = c0.f29009f;
            kVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strC = C1929s.c(c1929s);
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
            com.moloco.sdk.acm.l lVarC = cVar.c("create_ad_time_ms");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            lVarC.a("ad_type", "REWARDED");
            lVarC.a("initial_sdk_init_state", strC);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + c0Var + " ad with adUnitId: " + adUnitId, null, false, 12, null);
            tf.l lVar2 = c1929s.f29339d;
            this.f29319a = c0Var;
            this.f29320b = strC;
            this.f29321c = lVarC;
            this.f29322d = jCurrentTimeMillis;
            this.f29323e = 1;
            objB = C1929s.b(c1929s, lVar2, c0Var, cVar, this);
            if (objB == aVar) {
                return aVar;
            }
            str = strC;
            j8 = jCurrentTimeMillis;
            lVar = lVarC;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = this.f29322d;
            lVar = this.f29321c;
            str = this.f29320b;
            c0Var = this.f29319a;
            Fe.e.U(obj);
            objB = obj;
        }
        com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objB;
        if (eVar == null) {
            c0 c0Var2 = c0Var;
            MolocoAdError.AdCreateError adCreateErrorA = C1929s.a(c1929s, this.f29326h, str, lVar, c0Var2, cVar);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + c0Var2 + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new com.moloco.sdk.internal.y(adCreateErrorA);
        }
        Context contextE = ic.d.e(null);
        com.moloco.sdk.internal.services.u appLifecycleTrackerService = com.moloco.sdk.service_locator.b.a();
        com.moloco.sdk.acm.l lVar3 = lVar;
        G0 g0A = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest = com.moloco.sdk.service_locator.j.b();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v(this.f29327i);
        AdFormatType adFormatType = AdFormatType.REWARDED;
        W1.r rVar = new W1.r(adFormatType, AbstractC3935e.j(this.f29328j));
        com.moloco.sdk.internal.services.config.a configService = (com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.f29836a.getValue();
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        AbstractC3340k.e(configService, "configService");
        c0 c0Var3 = c0Var;
        C1918g c1918g = new C1918g(new l0(contextE, appLifecycleTrackerService, eVar.f28506b, adUnitId, persistentHttpRequest, g0A, new C1915d(1), new C8.i(8), adFormatType, vVar, rVar, cVar), adUnitId, configService, cVar);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "success");
        hVar.a("ad_type", c0Var3.name());
        hVar.a("initial_sdk_init_state", str);
        cVar.a(hVar);
        lVar3.a("result", "success");
        cVar.b(lVar3);
        kVar.getClass();
        c1918g.a(j8, System.currentTimeMillis());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + c0Var3 + " ad with adUnitId: " + adUnitId, null, false, 12, null);
        return new com.moloco.sdk.internal.z(c1918g);
    }
}
