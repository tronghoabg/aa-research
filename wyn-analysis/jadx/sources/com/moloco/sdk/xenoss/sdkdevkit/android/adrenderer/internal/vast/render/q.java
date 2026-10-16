package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Va.M6;

/* loaded from: classes4.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    public final int f32077a;

    public q(int i5) {
        this.f32077a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f32077a == ((q) obj).f32077a;
    }

    public final int hashCode() {
        return this.f32077a;
    }

    public final String toString() {
        return M6.r(new StringBuilder("Html(webViewId="), this.f32077a, ')');
    }
}
