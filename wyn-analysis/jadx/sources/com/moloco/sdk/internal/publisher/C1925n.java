package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K0;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.internal.publisher.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1925n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public c0 f29089a;

    /* renamed from: b, reason: collision with root package name */
    public String f29090b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.acm.l f29091c;

    /* renamed from: d, reason: collision with root package name */
    public long f29092d;

    /* renamed from: e, reason: collision with root package name */
    public int f29093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1929s f29094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.acm.recorder.c f29095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f29096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f29097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f29098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1925n(C1929s c1929s, com.moloco.sdk.acm.recorder.c cVar, String str, String str2, String str3, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29094f = c1929s;
        this.f29095g = cVar;
        this.f29096h = str;
        this.f29097i = str2;
        this.f29098j = str3;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1925n(this.f29094f, this.f29095g, this.f29096h, this.f29097i, this.f29098j, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1925n) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        com.moloco.sdk.acm.l lVar;
        long j8;
        c0 c0Var;
        String str;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29093e;
        C1929s c1929s = this.f29094f;
        com.moloco.sdk.acm.recorder.c cVar = this.f29095g;
        String adUnitId = this.f29096h;
        com.moloco.sdk.internal.services.k kVar = c1929s.f29337b;
        if (i5 == 0) {
            Fe.e.U(obj);
            c0 c0Var2 = c0.f29005b;
            kVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strC = C1929s.c(c1929s);
            com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.f28497b;
            com.moloco.sdk.acm.l lVarC = cVar.c("create_ad_time_ms");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            lVarC.a("ad_type", "BANNER_TABLET");
            lVarC.a("initial_sdk_init_state", strC);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Creating " + c0Var2 + " ad with adUnitId: " + adUnitId, null, false, 12, null);
            tf.l lVar2 = c1929s.f29339d;
            this.f29089a = c0Var2;
            this.f29090b = strC;
            this.f29091c = lVarC;
            this.f29092d = jCurrentTimeMillis;
            this.f29093e = 1;
            objB = C1929s.b(c1929s, lVar2, c0Var2, cVar, this);
            if (objB == aVar) {
                return aVar;
            }
            lVar = lVarC;
            j8 = jCurrentTimeMillis;
            c0Var = c0Var2;
            str = strC;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = this.f29092d;
            com.moloco.sdk.acm.l lVar3 = this.f29091c;
            String str2 = this.f29090b;
            c0 c0Var3 = this.f29089a;
            Fe.e.U(obj);
            c0Var = c0Var3;
            str = str2;
            lVar = lVar3;
            objB = obj;
        }
        com.moloco.sdk.internal.e eVar = (com.moloco.sdk.internal.e) objB;
        if (eVar == null) {
            String str3 = str;
            c0 c0Var4 = c0Var;
            MolocoAdError.AdCreateError adCreateErrorA = C1929s.a(c1929s, this.f29096h, str3, lVar, c0Var4, cVar);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdCreator", "Failed to create " + c0Var4 + " with reason: " + adCreateErrorA, null, false, 12, null);
            return new com.moloco.sdk.internal.y(adCreateErrorA);
        }
        Context contextE = ic.d.e(null);
        com.moloco.sdk.internal.services.u appLifecycleTrackerService = com.moloco.sdk.service_locator.b.a();
        K0 k02 = new K0();
        G0 g0A = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.acm.l lVar4 = lVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v(this.f29097i);
        String str4 = str;
        AdFormatType adFormatType = AdFormatType.BANNER;
        W1.r rVar = new W1.r(adFormatType, AbstractC3935e.a(this.f29098j));
        C1880b viewLifecycleOwnerSingleton = (C1880b) com.moloco.sdk.service_locator.i.f29856d.getValue();
        com.moloco.sdk.internal.l lVar5 = com.moloco.sdk.internal.l.f28662e;
        AbstractC3340k.e(appLifecycleTrackerService, "appLifecycleTrackerService");
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        c0 c0Var5 = c0Var;
        V vJ = H.J(contextE, appLifecycleTrackerService, eVar.f28506b, adUnitId, ((Boolean) eVar.f28508d.getValue()).booleanValue(), g0A, vVar, rVar, viewLifecycleOwnerSingleton, lVar5, eVar.f28507c, cVar, k02, adFormatType);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("create_ad");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
        hVar.a("result", "success");
        hVar.a("ad_type", c0Var5.name());
        hVar.a("initial_sdk_init_state", str4);
        cVar.a(hVar);
        lVar4.a("result", "success");
        cVar.b(lVar4);
        kVar.getClass();
        vJ.a(j8, System.currentTimeMillis());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "AdCreator", "Created " + c0Var5 + " ad with adUnitId: " + adUnitId, null, false, 12, null);
        return new com.moloco.sdk.internal.z(vJ);
    }
}
