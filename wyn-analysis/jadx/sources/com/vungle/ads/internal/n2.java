package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class n2 extends h1 {

    /* renamed from: c, reason: collision with root package name */
    public Long f33372c;

    /* renamed from: d, reason: collision with root package name */
    public Long f33373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        AbstractC3340k.e(metricType, "metricType");
    }

    public final long c() {
        long jNanoTime = System.nanoTime();
        Long l10 = this.f33373d;
        long jLongValue = l10 != null ? l10.longValue() : jNanoTime;
        Long l11 = this.f33372c;
        if (l11 != null) {
            jNanoTime = l11.longValue();
        }
        return (jLongValue - jNanoTime) / 1000000;
    }

    public void d() {
        this.f33373d = Long.valueOf(System.nanoTime());
    }

    public void e() {
        this.f33372c = Long.valueOf(System.nanoTime());
    }
}
