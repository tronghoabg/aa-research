package com.moloco.sdk.internal.ilrd;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class B extends E {

    /* renamed from: a, reason: collision with root package name */
    public final String f28539a;

    public B(String reason) {
        AbstractC3340k.e(reason, "reason");
        this.f28539a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && AbstractC3340k.a(this.f28539a, ((B) obj).f28539a);
    }

    public final int hashCode() {
        return this.f28539a.hashCode();
    }

    public final String toString() {
        return AbstractC0279p0.n(new StringBuilder("Error(reason="), this.f28539a, ')');
    }
}
