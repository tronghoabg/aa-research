package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g f30330a;

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g gVar) {
        this.f30330a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && AbstractC3340k.a(this.f30330a, ((e) obj).f30330a);
    }

    public final int hashCode() {
        return this.f30330a.hashCode();
    }

    public final String toString() {
        return "Failure(failure=" + this.f30330a + ')';
    }
}
