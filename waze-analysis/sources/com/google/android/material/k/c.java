package com.google.android.material.k;

import android.graphics.RectF;
import androidx.core.math.MathUtils;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f6649a;

    public c(float f2) {
        this.f6649a = f2;
    }

    @Override // com.google.android.material.k.d
    public final float a(RectF rectF) {
        return MathUtils.clamp(this.f6649a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f6649a == ((c) obj).f6649a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6649a)});
    }
}
