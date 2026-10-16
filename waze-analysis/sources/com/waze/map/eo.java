package com.waze.map;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class eo extends com.waze.map.canvas.m {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f28843a;

    public eo(Bitmap bitmap) {
        h.g.b.x.f(bitmap, "bitmap");
        this.f28843a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo) && h.g.b.x.n(this.f28843a, ((eo) obj).f28843a);
    }

    @Override // com.waze.map.canvas.m
    public final Bitmap f() {
        return this.f28843a;
    }

    public final int hashCode() {
        return this.f28843a.hashCode();
    }

    public final String toString() {
        return "Street(bitmap=" + this.f28843a + ")";
    }
}
