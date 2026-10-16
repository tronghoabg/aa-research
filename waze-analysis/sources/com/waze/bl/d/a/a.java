package com.waze.bl.d.a;

import android.graphics.Bitmap;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f17040a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f17041b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17042c;

    public a(Bitmap bitmap, Bitmap bitmap2, int i2) {
        x.f(bitmap, "arrow");
        x.f(bitmap2, "pill");
        this.f17040a = bitmap;
        this.f17041b = bitmap2;
        this.f17042c = i2;
    }

    public final int a() {
        return this.f17042c;
    }

    public final Bitmap b() {
        return this.f17040a;
    }

    public final Bitmap c() {
        return this.f17041b;
    }

    public final boolean d() {
        return (this.f17040a.isRecycled() || this.f17041b.isRecycled()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f17040a, aVar.f17040a) && x.n(this.f17041b, aVar.f17041b) && this.f17042c == aVar.f17042c;
    }

    public final int hashCode() {
        return (((this.f17040a.hashCode() * 31) + this.f17041b.hashCode()) * 31) + this.f17042c;
    }

    public final String toString() {
        return "BitmapData(arrow=" + this.f17040a + ", pill=" + this.f17041b + ", uiMode=" + this.f17042c + ")";
    }
}
