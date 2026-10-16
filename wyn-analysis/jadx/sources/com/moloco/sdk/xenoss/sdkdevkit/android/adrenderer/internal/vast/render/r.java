package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import Va.M6;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final String f32078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32080c;

    public r(String imageUrl, int i5, int i10) {
        AbstractC3340k.e(imageUrl, "imageUrl");
        this.f32078a = imageUrl;
        this.f32079b = i5;
        this.f32080c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC3340k.a(this.f32078a, rVar.f32078a) && this.f32079b == rVar.f32079b && this.f32080c == rVar.f32080c;
    }

    public final int hashCode() {
        return (((this.f32078a.hashCode() * 31) + this.f32079b) * 31) + this.f32080c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Image(imageUrl=");
        sb2.append(this.f32078a);
        sb2.append(", w=");
        sb2.append(this.f32079b);
        sb2.append(", h=");
        return M6.r(sb2, this.f32080c, ')');
    }
}
