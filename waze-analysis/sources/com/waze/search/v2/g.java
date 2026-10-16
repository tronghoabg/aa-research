package com.waze.search.v2;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap f36586a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f36587b;

    /* renamed from: c, reason: collision with root package name */
    private final Point f36588c;

    public g(Bitmap bitmap, Rect rect, Point point) {
        h.g.b.x.f(bitmap, "bitmap");
        this.f36586a = bitmap;
        this.f36587b = rect;
        this.f36588c = point;
    }

    public final Bitmap a() {
        return this.f36586a;
    }

    public final Point b() {
        return this.f36588c;
    }

    public final Rect c() {
        return this.f36587b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.g.b.x.n(this.f36586a, gVar.f36586a) && h.g.b.x.n(this.f36587b, gVar.f36587b) && h.g.b.x.n(this.f36588c, gVar.f36588c);
    }

    public final int hashCode() {
        int iHashCode = this.f36586a.hashCode() * 31;
        Rect rect = this.f36587b;
        int iHashCode2 = (iHashCode + (rect == null ? 0 : rect.hashCode())) * 31;
        Point point = this.f36588c;
        return iHashCode2 + (point != null ? point.hashCode() : 0);
    }

    public final String toString() {
        return "PinBitmap(bitmap=" + this.f36586a + ", hitBoxInset=" + this.f36587b + ", anchorShift=" + this.f36588c + ")";
    }

    public /* synthetic */ g(Bitmap bitmap, Point point, int i2) {
        this(bitmap, (Rect) null, (i2 & 4) != 0 ? null : point);
    }
}
