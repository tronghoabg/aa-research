package com.moloco.sdk.internal.services.init;

import A7.AbstractC0279p0;
import com.moloco.sdk.internal.A;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final A f29634a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29635b;

    public c(A sdkInitResult, String str) {
        AbstractC3340k.e(sdkInitResult, "sdkInitResult");
        this.f29634a = sdkInitResult;
        this.f29635b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC3340k.a(this.f29634a, cVar.f29634a) && AbstractC3340k.a(this.f29635b, cVar.f29635b);
    }

    public final int hashCode() {
        return this.f29635b.hashCode() + (this.f29634a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FetchState(sdkInitResult=");
        sb2.append(this.f29634a);
        sb2.append(", fetchType=");
        return AbstractC0279p0.n(sb2, this.f29635b, ')');
    }
}
