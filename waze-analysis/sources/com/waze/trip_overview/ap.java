package com.waze.trip_overview;

import android.graphics.Rect;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    private final cw f41008a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f41009b;

    public ap(cw cwVar, Rect rect) {
        h.g.b.x.f(cwVar, TtmlNode.ATTR_ID);
        h.g.b.x.f(rect, "bbox");
        this.f41008a = cwVar;
        this.f41009b = rect;
    }

    public final Rect a() {
        return this.f41009b;
    }

    public final cw b() {
        return this.f41008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return h.g.b.x.n(this.f41008a, apVar.f41008a) && h.g.b.x.n(this.f41009b, apVar.f41009b);
    }

    public final int hashCode() {
        return (this.f41008a.hashCode() * 31) + this.f41009b.hashCode();
    }

    public final String toString() {
        return "MarkerDisplayRect(id=" + this.f41008a + ", bbox=" + this.f41009b + ")";
    }
}
