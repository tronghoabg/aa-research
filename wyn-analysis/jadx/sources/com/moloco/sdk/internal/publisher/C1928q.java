package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.internal.publisher.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1928q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f29301a;

    /* renamed from: b, reason: collision with root package name */
    public String f29302b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29303c;

    /* renamed from: d, reason: collision with root package name */
    public long f29304d;

    /* renamed from: e, reason: collision with root package name */
    public int f29305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1929s f29306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29307g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f29308h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f29309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f29310j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1928q(C1929s c1929s, com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29306f = c1929s;
        this.f29307g = cVar;
        this.f29308h = str;
        this.f29309i = str2;
        this.f29310j = str3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1928q(this.f29306f, this.f29307g, this.f29308h, this.f29309i, this.f29310j, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1928q) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        Object objB;
        long j8;
        String str;
        com.moloco.sdk.acm.l lVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29305e;
        C1929s c1929s = this.f29306f;
        com.moloco.sdk.acm.recorder.c cVar = this.f29307g;
        String adUnitId = this.f29308h;
        com.moloco.sdk.internal.services.k kVar = c1929s.f29337b;
        if (i5 == 0) {
            Fe.e.U(obj);
            c0Var = c0.f29007d;
            kVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strC = C1929s.c(c1929s);
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
            com.moloco.sdk.acm.l lVarC = cVar.c("create_ad_time_ms");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            lVarC.a("ad_type", "NATIVE_AD_MEDIATION");
            lVarC.a("initial_sdk_init_state", strC);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + c0Var + " ad with adUnitId: " + adUnitId, null, false, 12, null);
            tf.l lVar2 = c1929s.f29339d;
            this.f29301a = c0Var;
            this.f29302b = strC;
            this.f29303c = lVarC;
            this.f29304d = jCurrentTimeMillis;
            this.f29305e = 1;
            objB = C1929s.b(c1929s, lVar2, c0Var, cVar, this);
            if (objB == aVar) {
                return aVar;
            }
            j8 = jCurrentTimeMillis;
            str = strC;
            lVar = lVarC;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = this.f29304d;
            com.moloco.sdk.acm.l lVar3 = this.f29303c;
            String str2 = this.f29302b;
            c0Var = this.f29301a;
            Fe.e.U(obj);
            lVar = lVar3;
            str = str2;
            objB = obj;
        }
        c0 c0Var2 = c0Var;
        com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objB;
        if (eVar == null) {
            MolocoAdError.AdCreateError adCreateErrorA = C1929s.a(c1929s, this.f29308h, str, lVar, c0Var2, cVar);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + c0Var2 + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new com.moloco.sdk.internal.y(adCreateErrorA);
        }
        Context contextE = ic.d.e(null);
        com.moloco.sdk.internal.services.u appLifecycleTrackerService = com.moloco.sdk.service_locator.b.a();
        com.moloco.sdk.internal.services.y audioService = (com.moloco.sdk.internal.services.y) com.moloco.sdk.service_locator.e.f29840c.getValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S s10 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S();
        G0 g0A = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest = com.moloco.sdk.service_locator.j.b();
        C1880b viewLifecycleOwnerSingleton = (C1880b) com.moloco.sdk.service_locator.i.f29856d.getValue();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v(this.f29309i);
        AdFormatType adFormatType = AdFormatType.NATIVE;
        String str3 = this.f29310j;
        W1.r rVar = new W1.r(adFormatType, AbstractC3340k.a(str3, "MAX") ? Fe.b.S(8, Cf.c.f2208d) : AbstractC3340k.a(str3, "AdMob") ? Fe.b.S(58, Cf.c.f2208d) : Fe.b.S(60, Cf.c.f2208d));
        com.moloco.sdk.internal.services.k timeProvider = com.moloco.sdk.service_locator.i.b();
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(audioService, "audioService");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        AbstractC3340k.e(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        AbstractC3340k.e(timeProvider, "timeProvider");
        com.moloco.sdk.internal.publisher.nativead.c cVar2 = new com.moloco.sdk.internal.publisher.nativead.c(adUnitId, new com.moloco.sdk.internal.publisher.nativead.o(contextE, adUnitId, new a0((com.moloco.sdk.internal.ortb.e) com.moloco.sdk.internal.ortb.f.f28679a.getValue(), new androidx.fragment.app.X(3)), new ae.d(3), rVar, cVar, timeProvider), new com.moloco.sdk.internal.publisher.nativead.a(contextE, s10, viewLifecycleOwnerSingleton, vVar, new com.moloco.sdk.internal.d(eVar, g0A, contextE), cVar), appLifecycleTrackerService, eVar.f28506b, g0A, persistentHttpRequest, rVar, cVar);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "success");
        hVar.a("ad_type", c0Var2.name());
        hVar.a("initial_sdk_init_state", str.toString());
        cVar.a(hVar);
        lVar.a("result", "success");
        cVar.b(lVar);
        kVar.getClass();
        cVar2.a(j8, System.currentTimeMillis());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + c0Var2 + " ad with adUnitId: " + adUnitId, null, false, 12, null);
        return new com.moloco.sdk.internal.z(cVar2);
    }
}
