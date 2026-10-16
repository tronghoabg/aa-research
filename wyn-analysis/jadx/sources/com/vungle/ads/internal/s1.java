package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class s1 extends m2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        AbstractC3340k.e(metricType, "metricType");
    }

    public final boolean d() {
        return this.f33629d;
    }

    public final void e() {
        this.f33629d = true;
    }
}
