package com.moloco.sdk.internal.ortb;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Exception f28674a;

    public a(Exception exc) {
        this.f28674a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && AbstractC3340k.a(this.f28674a, ((a) obj).f28674a);
    }

    public final int hashCode() {
        return this.f28674a.hashCode();
    }

    public final String toString() {
        return "InvalidJson(cause=" + this.f28674a + ')';
    }
}
