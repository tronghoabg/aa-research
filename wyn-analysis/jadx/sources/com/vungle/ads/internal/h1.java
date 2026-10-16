package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public Sdk.SDKMetric.SDKMetricType f33017a;

    /* renamed from: b, reason: collision with root package name */
    public String f33018b;

    public h1(Sdk.SDKMetric.SDKMetricType metricType) {
        AbstractC3340k.e(metricType, "metricType");
        this.f33017a = metricType;
    }

    public final void a(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        AbstractC3340k.e(sDKMetricType, "<set-?>");
        this.f33017a = sDKMetricType;
    }

    public final Sdk.SDKMetric.SDKMetricType b() {
        return this.f33017a;
    }

    public final String a() {
        return this.f33018b;
    }

    public final void a(String str) {
        this.f33018b = str;
    }
}
