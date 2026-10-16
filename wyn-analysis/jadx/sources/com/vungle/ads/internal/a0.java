package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class a0 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sdk.SDKMetric.SDKMetricType f32916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f32917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.vungle.ads.internal.util.s f32918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sdk.SDKMetric.Builder f32919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j8, com.vungle.ads.internal.util.s sVar, Sdk.SDKMetric.Builder builder) {
        super(0);
        this.f32916a = sDKMetricType;
        this.f32917b = j8;
        this.f32918c = sVar;
        this.f32919d = builder;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Logging Metric ");
        sbA.append(this.f32916a);
        sbA.append(" with value ");
        sbA.append(this.f32917b);
        sbA.append(" for placement ");
        com.vungle.ads.internal.util.s sVar = this.f32918c;
        sbA.append(sVar != null ? sVar.f33862a : null);
        sbA.append(" mediation:");
        sbA.append(this.f32919d.getMediationName());
        return sbA.toString();
    }
}
