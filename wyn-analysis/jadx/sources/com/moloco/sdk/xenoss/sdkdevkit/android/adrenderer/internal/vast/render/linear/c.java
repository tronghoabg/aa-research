package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l f32018a;

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
        AbstractC3340k.e(error, "error");
        this.f32018a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f32018a == ((c) obj).f32018a;
    }

    public final int hashCode() {
        return this.f32018a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f32018a + ')';
    }
}
