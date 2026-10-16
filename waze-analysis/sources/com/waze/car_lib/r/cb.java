package com.waze.car_lib.r;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f21183a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21184b;

    public cb(Bitmap bitmap, String str) {
        h.g.b.x.f(bitmap, "bitmap");
        h.g.b.x.f(str, "text");
        this.f21183a = bitmap;
        this.f21184b = str;
    }

    public final Bitmap a() {
        return this.f21183a;
    }

    public final String b() {
        return this.f21184b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return h.g.b.x.n(this.f21183a, cbVar.f21183a) && h.g.b.x.n(this.f21184b, cbVar.f21184b);
    }

    public final int hashCode() {
        return (this.f21183a.hashCode() * 31) + this.f21184b.hashCode();
    }

    public final String toString() {
        return "ExitSign(bitmap=" + this.f21183a + ", text=" + this.f21184b + ")";
    }
}
