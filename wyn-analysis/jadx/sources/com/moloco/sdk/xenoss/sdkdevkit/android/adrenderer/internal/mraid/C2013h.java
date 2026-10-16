package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2013h {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f30414a;

    public C2013h(z0 z0Var) {
        this.f30414a = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2013h) && AbstractC3340k.a(this.f30414a, ((C2013h) obj).f30414a);
    }

    public final int hashCode() {
        z0 z0Var = this.f30414a;
        if (z0Var == null) {
            return 0;
        }
        return z0Var.hashCode();
    }

    public final String toString() {
        return "MraidAdData(dec=" + this.f30414a + ')';
    }
}
