package com.google.android.material.k;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f6680a;

    public m(float f2) {
        this.f6680a = f2;
    }

    @Override // com.google.android.material.k.d
    public final float a(RectF rectF) {
        return this.f6680a * Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f6680a == ((m) obj).f6680a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6680a)});
    }

    public final String toString() {
        return ((int) (this.f6680a * 100.0f)) + "%";
    }
}
