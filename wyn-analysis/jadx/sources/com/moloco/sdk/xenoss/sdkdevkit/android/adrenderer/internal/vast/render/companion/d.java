package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f31675a;

    public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        AbstractC3340k.e(error, "error");
        this.f31675a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC3340k.a(this.f31675a, ((d) obj).f31675a);
    }

    public final int hashCode() {
        return this.f31675a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f31675a + ')';
    }
}
