package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class t1 extends n2 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f33679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        AbstractC3340k.e(metricType, "metricType");
    }

    @Override // com.vungle.ads.internal.n2
    public final void d() {
        if (this.f33373d == null) {
            super.d();
        }
    }

    @Override // com.vungle.ads.internal.n2
    public final void e() {
        if (this.f33372c == null) {
            super.e();
        }
    }

    public final boolean f() {
        return this.f33679e;
    }

    public final void g() {
        this.f33679e = true;
    }
}
