package com.waze.map;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class en extends com.waze.map.canvas.m {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f28842a;

    public en(Bitmap bitmap) {
        h.g.b.x.f(bitmap, "bitmap");
        this.f28842a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof en) && h.g.b.x.n(this.f28842a, ((en) obj).f28842a);
    }

    @Override // com.waze.map.canvas.m
    public final Bitmap f() {
        return this.f28842a;
    }

    public final int hashCode() {
        return this.f28842a.hashCode();
    }

    public final String toString() {
        return "Insight(bitmap=" + this.f28842a + ")";
    }
}
