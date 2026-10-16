package com.moloco.sdk.internal.services;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class o extends Fe.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f29714a;

    public o(String str) {
        this.f29714a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && AbstractC3340k.a(this.f29714a, ((o) obj).f29714a);
    }

    public final int hashCode() {
        return this.f29714a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("Available(id="), this.f29714a, ')');
    }
}
