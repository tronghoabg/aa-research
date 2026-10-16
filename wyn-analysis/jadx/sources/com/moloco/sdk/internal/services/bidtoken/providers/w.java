package com.moloco.sdk.internal.services.bidtoken.providers;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f29528a;

    public w(String str) {
        this.f29528a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && AbstractC3340k.a(this.f29528a, ((w) obj).f29528a);
    }

    public final int hashCode() {
        String str = this.f29528a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("TestConfigSignal(configJson="), this.f29528a, ')');
    }
}
