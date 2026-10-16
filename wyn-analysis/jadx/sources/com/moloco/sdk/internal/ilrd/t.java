package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.C1950l0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final C1950l0 f28644a;

    public t(C1950l0 c1950l0) {
        this.f28644a = c1950l0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && AbstractC3340k.a(this.f28644a, ((t) obj).f28644a);
    }

    public final int hashCode() {
        return this.f28644a.hashCode();
    }

    public final String toString() {
        return "Max(impression=" + this.f28644a + ')';
    }
}
