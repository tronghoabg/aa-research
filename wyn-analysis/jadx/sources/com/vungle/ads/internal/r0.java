package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public final class r0 implements com.vungle.ads.internal.network.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.l f33599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f33600b;

    public r0(Context context, q2 q2Var) {
        this.f33599a = q2Var;
        this.f33600b = context;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(com.vungle.ads.internal.network.o oVar) {
        if (oVar != null && oVar.c() && oVar.a() != null) {
            ConfigManager.INSTANCE.a(this.f33600b, (com.vungle.ads.internal.model.v2) oVar.a(), false, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
            this.f33599a.invoke(Boolean.TRUE);
        } else {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("config API: ");
            sbA.append(oVar != null ? Integer.valueOf(oVar.b()) : null);
            new APIFailedStatusCodeError(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
            this.f33599a.invoke(Boolean.FALSE);
        }
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error while fetching config: ");
        sbA.append(th != null ? th.getMessage() : null);
        new NetworkUnreachable(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
        this.f33599a.invoke(Boolean.FALSE);
    }
}
