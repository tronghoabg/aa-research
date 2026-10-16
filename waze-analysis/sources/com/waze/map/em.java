package com.waze.map;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class em extends com.waze.map.canvas.m {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f28841a;

    public em(Bitmap bitmap) {
        h.g.b.x.f(bitmap, "bitmap");
        this.f28841a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em) && h.g.b.x.n(this.f28841a, ((em) obj).f28841a);
    }

    @Override // com.waze.map.canvas.m
    public final Bitmap f() {
        return this.f28841a;
    }

    public final int hashCode() {
        return this.f28841a.hashCode();
    }

    public final String toString() {
        return "AvgSpeedCam(bitmap=" + this.f28841a + ")";
    }
}
