package com.vungle.ads.internal.load;

import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.o;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class i implements com.vungle.ads.internal.network.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f33071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3 f33072b;

    public i(j jVar, i3 i3Var) {
        this.f33071a = jVar;
        this.f33072b = i3Var;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        j jVar = this.f33071a;
        ((com.vungle.ads.internal.executor.d) jVar.f33049c).f32981b.execute(new Ab.a(jVar, this.f33072b, oVar, 1));
    }

    public static final void a(j this$0, i3 placement, o oVar) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(placement, "$placement");
        if (this$0.h().b(placement.b()) > 0) {
            this$0.a(new AdRetryError().setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        if (oVar != null && !oVar.c()) {
            this$0.a(new APIFailedStatusCodeError(this$0.l() + " API: " + oVar.b()).setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        h0 h0Var = oVar != null ? (h0) oVar.a() : null;
        if ((h0Var != null ? h0Var.c() : null) == null) {
            this$0.a(new AdResponseEmptyError(this$0.l() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        this$0.a(h0Var, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        j jVar = this.f33071a;
        ((com.vungle.ads.internal.executor.d) jVar.f33049c).f32981b.execute(new C8.d(3, jVar, th));
    }

    public static final void a(j this$0, Throwable th) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.a(j.a(this$0, th).setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
    }
}
