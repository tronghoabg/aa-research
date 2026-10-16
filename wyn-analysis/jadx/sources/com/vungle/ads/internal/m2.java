package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class m2 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public Long f33080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        AbstractC3340k.e(metricType, "metricType");
    }

    public final void a(Long l10) {
        this.f33080c = l10;
    }

    public final long c() {
        Long l10 = this.f33080c;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }
}
