package com.google.android.material.k;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d f6647a;

    /* renamed from: b, reason: collision with root package name */
    private final float f6648b;

    public b(float f2, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f6647a;
            f2 += ((b) dVar).f6648b;
        }
        this.f6647a = dVar;
        this.f6648b = f2;
    }

    @Override // com.google.android.material.k.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f6647a.a(rectF) + this.f6648b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6647a.equals(bVar.f6647a) && this.f6648b == bVar.f6648b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6647a, Float.valueOf(this.f6648b)});
    }
}
