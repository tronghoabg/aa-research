package com.waze.car_lib.p;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cp extends com.waze.car_lib.r.co {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f20742a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(Bitmap bitmap) {
        super(null);
        h.g.b.x.f(bitmap, "bitmap");
        this.f20742a = bitmap;
    }

    public final Bitmap c() {
        return this.f20742a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp) && h.g.b.x.n(this.f20742a, ((cp) obj).f20742a);
    }

    public final int hashCode() {
        return this.f20742a.hashCode();
    }

    public final String toString() {
        return "Bitmap(bitmap=" + this.f20742a + ")";
    }
}
