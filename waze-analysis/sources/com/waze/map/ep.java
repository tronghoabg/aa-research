package com.waze.map;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ep extends com.waze.map.canvas.m {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f28844a;

    public ep(Bitmap bitmap) {
        h.g.b.x.f(bitmap, "bitmap");
        this.f28844a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep) && h.g.b.x.n(this.f28844a, ((ep) obj).f28844a);
    }

    @Override // com.waze.map.canvas.m
    public final Bitmap f() {
        return this.f28844a;
    }

    public final int hashCode() {
        return this.f28844a.hashCode();
    }

    public final String toString() {
        return "TrafficMeter(bitmap=" + this.f28844a + ")";
    }
}
