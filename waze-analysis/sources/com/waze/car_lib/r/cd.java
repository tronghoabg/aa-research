package com.waze.car_lib.r;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd extends com.waze.n.aq {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f21186a;

    /* JADX WARN: Illegal instructions before constructor call */
    public cd(Bitmap bitmap) {
        h.g.b.x.f(bitmap, "bitmap");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f21186a = bitmap;
    }

    public final Bitmap b() {
        return this.f21186a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd) && h.g.b.x.n(this.f21186a, ((cd) obj).f21186a);
    }

    public final int hashCode() {
        return this.f21186a.hashCode();
    }

    public final String toString() {
        return "View(bitmap=" + this.f21186a + ")";
    }
}
