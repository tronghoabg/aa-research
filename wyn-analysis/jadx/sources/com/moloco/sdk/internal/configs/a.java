package com.moloco.sdk.internal.configs;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f28499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28500b;

    public a(String str, int i5) {
        this.f28499a = str;
        this.f28500b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC3340k.a(this.f28499a, aVar.f28499a) && this.f28500b == aVar.f28500b;
    }

    public final int hashCode() {
        return (this.f28499a.hashCode() * 31) + this.f28500b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationalMetricsConfig(reportingUrl=");
        sb2.append(this.f28499a);
        sb2.append(", pollingIntervalSeconds=");
        return M6.r(sb2, this.f28500b, ')');
    }
}
