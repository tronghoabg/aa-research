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

/* renamed from: com.moloco.sdk.internal.publisher.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1926o extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f29266a;

    /* renamed from: b, reason: collision with root package name */
    public String f29267b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29268c;

    /* renamed from: d, reason: collision with root package name */
    public long f29269d;

    /* renamed from: e, reason: collision with root package name */
    public int f29270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1929s f29271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f29273h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f29274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f29275j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1926o(C1929s c1929s, com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29271f = c1929s;
        this.f29272g = cVar;
        this.f29273h = str;
        this.f29274i = str2;
        this.f29275j = str3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1926o(this.f29271f, this.f29272g, this.f29273h, this.f29274i, this.f29275j, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1926o) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        Object objB;
        String str;
        com.moloco.sdk.acm.l lVar;
        long j8;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29270e;
        C1929s c1929s = this.f29271f;
        com.moloco.sdk.acm.recorder.c cVar = this.f29272g;
        String adUnitId = this.f29273h;
        com.moloco.sdk.internal.services.k kVar = c1929s.f29337b;
        if (i5 == 0) {
            Fe.e.U(obj);
            c0Var = c0.f29008e;
            kVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strC = C1929s.c(c1929s);
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
            com.moloco.sdk.acm.l lVarC = cVar.c("create_ad_time_ms");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            lVarC.a("ad_type", "INTERSTITIAL");
            lVarC.a("initial_sdk_init_state", strC);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + c0Var + " ad with adUnitId: " + adUnitId, null, false, 12, null);
            tf.l lVar2 = c1929s.f29339d;
            this.f29266a = c0Var;
            this.f29267b = strC;
            this.f29268c = lVarC;
            this.f29269d = jCurrentTimeMillis;
            this.f29270e = 1;
            objB = C1929s.b(c1929s, lVar2, c0Var, cVar, this);
            if (objB == aVar) {
                return aVar;
            }
            str = strC;
            lVar = lVarC;
            j8 = jCurrentTimeMillis;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = this.f29269d;
            com.moloco.sdk.acm.l lVar3 = this.f29268c;
            String str2 = this.f29267b;
            c0Var = this.f29266a;
            Fe.e.U(obj);
            str = str2;
            lVar = lVar3;
            objB = obj;
        }
        com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objB;
        if (eVar == null) {
            c0 c0Var2 = c0Var;
            MolocoAdError.AdCreateError adCreateErrorA = C1929s.a(c1929s, this.f29273h, str, lVar, c0Var2, cVar);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + c0Var2 + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new com.moloco.sdk.internal.y(adCreateErrorA);
        }
        Context contextE = ic.d.e(null);
        com.moloco.sdk.internal.services.u appLifecycleTrackerService = com.moloco.sdk.service_locator.b.a();
        G0 g0A = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest = com.moloco.sdk.service_locator.j.b();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v(this.f29274i);
        AdFormatType adFormatType = AdFormatType.INTERSTITIAL;
        W1.r rVar = new W1.r(adFormatType, AbstractC3935e.j(this.f29275j));
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        c0 c0Var3 = c0Var;
        com.moloco.sdk.acm.l lVar4 = lVar;
        C1914c c1914c = new C1914c(new l0(contextE, appLifecycleTrackerService, eVar.f28506b, adUnitId, persistentHttpRequest, g0A, new C1915d(0), new C8.i(8), adFormatType, vVar, rVar, cVar));
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "success");
        hVar.a("ad_type", c0Var3.name());
        hVar.a("initial_sdk_init_state", str.toString());
        cVar.a(hVar);
        lVar4.a("result", "success");
        cVar.b(lVar4);
        kVar.getClass();
        c1914c.a(j8, System.currentTimeMillis());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + c0Var3 + " ad with adUnitId: " + adUnitId, null, false, 12, null);
        return new com.moloco.sdk.internal.z(c1914c);
    }
}
