package com.google.android.material.k;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f6630a;

    public a(float f2) {
        this.f6630a = f2;
    }

    @Override // com.google.android.material.k.d
    public final float a(RectF rectF) {
        return this.f6630a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f6630a == ((a) obj).f6630a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6630a)});
    }

    public final String toString() {
        return this.f6630a + "px";
    }
}
